package selfproject.registeration.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import selfproject.registeration.models.dto.UserDto;
import selfproject.registeration.models.entity.User;
import selfproject.registeration.repositories.UserRepository;
import selfproject.registeration.services.UserService;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final List<String> months;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.months = List.of(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        );
    }

    public User registerUser(UserDto userDto) {
        String firstName = userDto.getFirstName();
        String lastName = userDto.getLastName();
        String email = userDto.getEmail();
        String phone = userDto.getPhone();
        String year = userDto.getYears();
        String month = userDto.getMonth();
        String day = userDto.getDay();
        String country = userDto.getCountry();

        if (userRepository.existsByEmailAndPhone(email, phone)) {
            throw new RuntimeException("User with this phone and email already exists!");
        } else {
            LocalDate birthDate = LocalDate.of(Integer.parseInt(year), convertMonthToInt(month), Integer.parseInt(day));

            User userToRegister = new User(firstName, lastName, email, phone, birthDate, country);
            userRepository.save(userToRegister);

            return userToRegister;
        }
    }

    @Override
    public int convertMonthToInt(String month) {
        if (!months.contains(month)) {
            throw new RuntimeException("Invalid month!");
        } else {
            return months.indexOf(month) + 1;
        }
    }
}