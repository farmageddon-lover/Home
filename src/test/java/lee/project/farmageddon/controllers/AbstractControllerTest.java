package lee.project.farmageddon.controllers;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lee.project.farmageddon.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment=WebEnvironment.DEFINED_PORT)
public abstract class AbstractControllerTest
{
  protected MockMvc mockMvc;

  @Autowired
  protected WebApplicationContext webApplicationContext;

  @Before
  public void setup()
  {
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  }
}
