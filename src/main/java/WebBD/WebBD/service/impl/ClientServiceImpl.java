package WebBD.WebBD.service.impl;

import WebBD.WebBD.models.Client;
import WebBD.WebBD.repository.ClientRepository;
import WebBD.WebBD.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ArrayList<Client> getAll() {

        return (ArrayList<Client>) clientRepository.findAll();
    }
}
