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
@Table(name = "credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private Long id;
    @Column(name = "sum_of_credit")
    private Long sum_of_credit;
    @Column(name = "monthly_rent")
    private Long monthly_rent;
    @Column(name = "percent")
    private double percent;
    @Column(name = "day_count")
    private int day_count;
    @Column(name = "client_id")
    private int client_id;
    @Column(name = "employer_id")
    private int employer_id;
    @Column(name = "data_take")
    private String data_take;
    @Column(name = "data_manurity")
    private int data_manurity;
    @Column(name = "status")
    private String status;
    @Column(name = "contract_number")
    private String contract_number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSum_of_credit() {
        return sum_of_credit;
    }

    public void setSum_of_credit(Long sum_of_credit) {
        this.sum_of_credit = sum_of_credit;
    }

    public Long getMonthly_rent() {
        return monthly_rent;
    }

    public void setMonthly_rent(Long monthly_rent) {
        this.monthly_rent = monthly_rent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getDay_count() {
        return day_count;
    }

    public void setDay_count(int day_count) {
        this.day_count = day_count;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getEmployer_id() {
        return employer_id;
    }

    public void setEmployer_id(int employer_id) {
        this.employer_id = employer_id;
    }

    public String getData_take() {
        return data_take;
    }

    public void setData_take(String data_take) {
        this.data_take = data_take;
    }

    public int getData_manurity() {
        return data_manurity;
    }

    public void setData_manurity(int data_manurity) {
        this.data_manurity = data_manurity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContract_number() {
        return contract_number;
    }

    public void setContract_number(String contract_number) {
        this.contract_number = contract_number;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", sum_of_credit=" + sum_of_credit +
                ", monthly_rent=" + monthly_rent +
                ", percent=" + percent +
                ", day_count=" + day_count +
                ", client_id=" + client_id +
                ", employer_id=" + employer_id +
                ", data_take='" + data_take + '\'' +
                ", data_manurity=" + data_manurity +
                ", status='" + status + '\'' +
                ", contract_number='" + contract_number + '\'' +
                '}';
    }
}
