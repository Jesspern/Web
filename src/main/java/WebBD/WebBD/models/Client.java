package WebBD.WebBD.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private Long id;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_surname")
    private String surname;

    @Column(name = "client_sex")
    private String sex;
    @Column(name = "client_inn")
    private String inn;

    @Column(name = "client_snils")
    private String snils;

    @Column(name = "client_passport")
    private String passport;
    @Column(name = "client_wage")
    private Long salary;

    public Client() {

    }

    public Client(String name, String surname, String sex, String inn, String snils, String passport, Long salary) {

        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.inn = inn;
        this.snils = snils;
        this.passport = passport;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", inn='" + inn + '\'' +
                ", snils='" + snils + '\'' +
                ", passport='" + passport + '\'' +
                ", salary=" + salary +
                '}';
    }
}