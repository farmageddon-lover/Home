package lee.project.farmageddon.services;

import lee.project.farmageddon.model.User;

public interface UserService
{
  public Iterable<User> findAll();

  public User findById(Long id);

  public User findByUsername(String username);
}
