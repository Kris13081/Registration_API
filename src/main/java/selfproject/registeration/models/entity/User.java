package selfproject.registeration.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

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

    @Value("${default.phone}")
    @Column(unique = true)
    @Size(min = 10, max = 10)
    private String phone;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    private String country;

    public User() {
    }

    public User(String firstName, String lastName, String email, String phone, LocalDate birthDate, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.country = country;
    }
}

