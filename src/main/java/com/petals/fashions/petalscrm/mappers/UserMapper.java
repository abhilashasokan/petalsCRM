package com.petals.fashions.petalscrm.mappers;


import com.petals.fashions.petalscrm.dtos.SignUpDto;
import com.petals.fashions.petalscrm.dtos.UserDto;
import com.petals.fashions.petalscrm.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
