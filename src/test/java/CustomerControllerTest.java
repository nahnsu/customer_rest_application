import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
//import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.trace.http.HttpTrace.Session;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.nahnsu.customers.dao.CustomerDAOImpl;
import com.nahnsu.customers.entity.Customer;
import com.nahnsu.customers.rest.CustomerRestController;
import com.nahnsu.customers.service.CustomerService;
import com.nahnsu.customers.service.CustomerServiceImpl;

class CustomerControllerTest {
	
	SessionFactory sessionFactory;
	
	@Before
	public void setUp() {
//		CustomerService customerService = new CustomerServiceImpl();
//		CustomerRestController controller = new CustomerRestController();
	}
	
	@Test
	public void listCustomersTest() throws Exception{
//		CustomerService customerService = new CustomerServiceImpl();
//		CustomerRestController controller = new CustomerRestController();
		
//		List<Customer> customers = controller.getCustomers();
	}

}
