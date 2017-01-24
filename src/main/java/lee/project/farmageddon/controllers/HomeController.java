package lee.project.farmageddon.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
  @Value("${application.name}")
  private String applicationName;

  @Value("${application.version}")
  private String applicationVersion;

  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public ModelAndView home(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout)
  {
    ModelAndView model = new ModelAndView();

    if (error != null)
    {
      model.addObject("error", "Invalid username and password!");
    }
    else if (logout != null)
    {
      model.addObject("msg", "You've been logged out successfully.");
    }

    model.setViewName("home");
    model.addObject("applicationName", applicationName);
    model.addObject("applicationVersion", applicationVersion);

    return model;
  }

  @RequestMapping("/angular")
  public String angular(Map<String, Object> model)
  {
    return "angular";
  }
}
