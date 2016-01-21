package tutorial.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tutorial.rest.mvc.BlogEntryController;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by viholovko on 20.01.16.
 */

public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController controller;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test() throws Exception {
        mockMvc.perform(post("/test")
                    .contentType(MediaType.valueOf("{\"title\":\"Test Blog Title\"}"))
                    .contentType(MediaType.APPLICATION_JSON)
            )
                    .andExpect(jsonPath("$.title", is("Test Blog Title W")))
                    .andDo(print());
    }
}
