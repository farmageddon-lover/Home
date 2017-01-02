package lee.project.farmageddon.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lee.project.farmageddon.dto.UserDTO;
import lee.project.farmageddon.model.User;
import lee.project.farmageddon.services.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController
{
  @Autowired
  private UserService userService;

  @RequestMapping("")
  public List<UserDTO> getAllUsers()
  {
    Iterable<User> users = userService.findAll();
    List<UserDTO> userDTOs = new ArrayList<>();

    for (User user : users)
    {
      final UserDTO userDTO = new UserDTO();
      userDTO.setUsername(user.getUsername());
      userDTO.setEmail(user.getEmail());
      userDTOs.add(userDTO);
    }

    return userDTOs;
  }
}
