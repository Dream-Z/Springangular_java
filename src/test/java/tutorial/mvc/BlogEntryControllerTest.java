package tutorial.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.ModelResultMatchers.*;

/**
 * Created by viholovko on 20.01.16.
 */
public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController controller;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test(){
        try {
            mockMvc.perform(post("/test")
                    .contentType(MediaType.valueOf("{\"title\":\"Test Blog Title\"}"))
                    .contentType(MediaType.APPLICATION_JSON)
            ).andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
