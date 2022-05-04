package exam_project.models;

import exam_project.enums.SupplierStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
@NoArgsConstructor
@Getter@Setter
public class Supplier {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "status")
    private SupplierStatus status;

    @ManyToOne(cascade = CascadeType.ALL)
    private Order orders;

    public Supplier(String fullName, int phoneNumber, SupplierStatus status) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", status=" + status +
                ", orders=" + orders +
                '}';
    }
}
