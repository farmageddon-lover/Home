package lee.project.farmageddon.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable
{
  private static final long serialVersionUID = -6492538112487170340L;

  @Id
  @GeneratedValue
  private Long id;

  private String username;

  private String forename;

  private String surname;

  private String email;

  @Column(columnDefinition = "TINYINT", length = 1)
  private Boolean locked;

  private String uuid;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getForename()
  {
    return forename;
  }

  public void setForename(String forename)
  {
    this.forename = forename;
  }

  public String getSurname()
  {
    return surname;
  }

  public void setSurname(String surname)
  {
    this.surname = surname;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public Boolean getLocked()
  {
    return locked;
  }

  public void setLocked(Boolean locked)
  {
    this.locked = locked;
  }

  public String getUuid()
  {
    return uuid;
  }

  public void setUuid(String uuid)
  {
    this.uuid = uuid;
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + ((forename == null) ? 0 : forename.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((locked == null) ? 0 : locked.hashCode());
    result = prime * result + ((surname == null) ? 0 : surname.hashCode());
    result = prime * result + ((username == null) ? 0 : username.hashCode());
    result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User) obj;
    if (email == null)
    {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    if (forename == null)
    {
      if (other.forename != null)
        return false;
    } else if (!forename.equals(other.forename))
      return false;
    if (id == null)
    {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (locked == null)
    {
      if (other.locked != null)
        return false;
    } else if (!locked.equals(other.locked))
      return false;
    if (surname == null)
    {
      if (other.surname != null)
        return false;
    } else if (!surname.equals(other.surname))
      return false;
    if (username == null)
    {
      if (other.username != null)
        return false;
    } else if (!username.equals(other.username))
      return false;
    if (uuid == null)
    {
      if (other.uuid != null)
        return false;
    } else if (!uuid.equals(other.uuid))
      return false;
    return true;
  }
}
