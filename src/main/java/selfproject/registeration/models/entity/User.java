package selfproject.registeration.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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

    @Pattern(regexp="^(0|[1-9][0-9]*)$")
    @Column(nullable = false, unique = true)
    @Size(min = 10, max = 10)
    private String phone;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    private String country;

    public User() {
    }

    public User(String firstName, String lastName, String email, String phone, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
    }
}

