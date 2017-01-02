package lee.project.farmageddon.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

public class UserControllerTest extends AbstractControllerTest
{
  @Test
  public void shouldAllowAGetToBePerformed() throws Exception
  {
    mockMvc.perform(get("/v1/users"))
           .andDo(print())
           .andExpect(status().isOk());
  }
}
