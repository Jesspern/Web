package WebBD.WebBD.repository;

import WebBD.WebBD.models.Client;
import WebBD.WebBD.models.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreditRepository extends JpaRepository<Credit, Long> {

}
