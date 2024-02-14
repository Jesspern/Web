package WebBD.WebBD.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

public class Input {

    private String name;

    private String surname;

    private String sex;
    private String inn;

    private String snils;

    private String passport;
    private Long salary;
    private Long sum_of_credit;

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

    public Long getSum_of_credit() {
        return sum_of_credit;
    }

    public void setSum_of_credit(Long sum_of_credit) {
        this.sum_of_credit = sum_of_credit;
    }

    public boolean equals(Client o) {
        return Objects.equals(getName(), o.getName()) &&
                Objects.equals(getSurname(), o.getSurname()) &&
                Objects.equals(getSex(), o.getSex()) &&
                Objects.equals(getInn(), o.getInn()) &&
                Objects.equals(getSnils(), o.getSnils()) &&
                Objects.equals(getPassport(), o.getPassport());
    }

    @Override
    public String toString() {
        return "Input{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", inn='" + inn + '\'' +
                ", snils='" + snils + '\'' +
                ", passport='" + passport + '\'' +
                ", salary=" + salary +
                ", sum_of_credit=" + sum_of_credit +
                '}';
    }
}
