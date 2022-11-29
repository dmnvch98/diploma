package com.example.diploma.converter;

import com.example.diploma.dto.UserDto;
import com.example.diploma.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserConverter {
    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userRestDto);
}
