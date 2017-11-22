package sebivenlo.workshop.controller;

import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test Class for {@link AccountController}
 *
 * @author merve
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
@SpringBootTest
public class AccountControllerTest {

    private static final String CONTENT_TYPE_HTML="text/html;charset=UTF-8";
    
    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    public AccountControllerTest() {
    }

    @Before
    public void setUp() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(SecurityMockMvcConfigurers.springSecurity())
                .build();
    }

   
    @Test
    public void testIndex() throws Exception {
        //TODO 4.1.0: create test for calling the index method
    }

    
    @Test
    public void testIndexFail() throws Exception {       
        //TODO 4.1.1: create test with wrong url
    }
}
