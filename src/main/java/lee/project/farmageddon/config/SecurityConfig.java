package lee.project.farmageddon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
  @Override
  protected void configure(HttpSecurity http) throws Exception
  {
    http
    .formLogin()
    .loginPage("/home")
    .loginProcessingUrl("/j_spring_security_check")
    .defaultSuccessUrl("/angular", true)
    .usernameParameter("j_username")
    .passwordParameter("j_password")
    .failureUrl("/home?error")
    .and()
    .logout()
    .logoutUrl("/j_spring_security_logout")
    .logoutSuccessUrl("/home?logout")
    .and()
    .csrf().disable()
    .authorizeRequests()
    .antMatchers("/home").permitAll()
    .antMatchers("/angular").access("hasRole('ROLE_USER')")
    .antMatchers("/welcome").access("hasRole('ROLE_USER')")
    .antMatchers("/hello").access("hasRole('ROLE_USER')");
  }

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
  {
    auth
      .inMemoryAuthentication()
        .withUser("username").password("password").roles("USER");
  }
}
