package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tbl_employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    public Employee() {
    }

    //Getters and setters

    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName + ",
        lastName=" + lastName + ", email=" + email  + "]";
    }
}
