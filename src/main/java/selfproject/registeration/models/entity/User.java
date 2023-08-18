package selfproject.registeration.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false)
    @Size(min = 2, max = 25)
    private String firstName;

    @Column(nullable = false)
    @Size(min = 2, max = 25)
    private String lastName;

    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    @Size(min = 10, max = 10)
    private Long phoneNumber;

    @Column(nullable = false)
    private Date birthDate;

    public User() {
    }

    public User(String firstName, String lastName, String email, Long phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }
}

