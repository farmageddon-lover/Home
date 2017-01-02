package lee.project.farmageddon.repositories;

import org.springframework.data.repository.CrudRepository;

import lee.project.farmageddon.model.User;

public interface UserRepository extends CrudRepository<User, Long>
{
  User findByUsername(String username);
}
