import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tutorial.mvc.BlogEntryController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by prasanthbabuganta on 1/1/16.
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
    public void test() throws Exception {
        mockMvc.perform(post("/test")
                .content("{\"title\":\"Test Blog Title\"}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(jsonPath("$.title",is("Test Blog Title")))
                .andDo(print());
    }

}
