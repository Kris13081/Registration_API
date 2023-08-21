package selfproject.registeration.services;

import selfproject.registeration.models.dto.UserDto;
import selfproject.registeration.models.entity.User;

public interface UserService {
    User registerUser(UserDto user);

    int convertMonthToInt(String month);
}
