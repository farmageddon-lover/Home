package lee.project.farmageddon.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
  @RequestMapping("/home")
  public String home(Map<String, Object> model)
  {
    return "home";
  }

  @RequestMapping("/angular")
  public String angular(Map<String, Object> model)
  {
    return "angular";
  }
}
