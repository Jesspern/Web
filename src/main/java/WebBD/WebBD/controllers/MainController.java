package WebBD.WebBD.controllers;

import WebBD.WebBD.models.Client;
import WebBD.WebBD.models.Credit;
import WebBD.WebBD.models.Input;
import WebBD.WebBD.models.UserSelect;
import WebBD.WebBD.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import WebBD.WebBD.repository.ClientRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class MainController {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CreditRepository creditRepository;
    
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("input", new Input());
        try {
            List<Client> clients = new ArrayList<Client>();

            clientRepository.findAll().forEach(clients::add);

        } catch (Exception e) {
            System.out.println("Exception");
        }
        return "greeting";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Input input, Model model) {
        model.addAttribute("input", input);
        try {
            List<Client> clients = new ArrayList<Client>();
            List<Credit> credits = new ArrayList<Credit>();

            clientRepository.findAll().forEach(clients::add);
            creditRepository.findAll().forEach(credits::add);

            Long id_client = (long) -1;
            for (int i = 0; i < clients.size(); i++) {
                if (input.equals(clients.get(i))) {
                    id_client = (clients.get(i).getId());
                    break;
                }
            }
            String result = "";
            if (id_client != -1) {
                for (Credit credit : credits) {
                    if (credit.getClient_id() == id_client) {
                        if (credit.getStatus().equals("expired")) {
                            result = "Не может взять кредит, так как один из кредитов просрочен";
                            model.addAttribute("credit_result", credit);
                            break;
                        }
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println(input.getSalary());
                System.out.println(input.getSum_of_credit());

                if (input.getSalary() * 12 < input.getSum_of_credit()) {
                    result = "Не может взять кредит из-за маленькой зарплаты";
                }
                else {
                    result = "Может взять кредит";
                }
            }
            model.addAttribute("result", result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "result";
    }

}
