package lee.project.farmageddon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lee.project.farmageddon.model.User;
import lee.project.farmageddon.repositories.UserRepository;

@Component
public class UserServiceImpl implements UserService
{
  @Autowired
  private UserRepository userRepository;

  @Override
  public Iterable<User> findAll()
  {
    return userRepository.findAll();
  }

  @Override
  public User findById(Long id)
  {
    return userRepository.findOne(id);
  }

  @Override
  public User findByUsername(String username)
  {
    return userRepository.findByUsername(username);
  }

}
