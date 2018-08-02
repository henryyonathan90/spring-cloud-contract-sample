package henry.jonathan.cart.contract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author henry.jonathan
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages = "henry.jonathan.cart", excludeFilters = {
    @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
    @ComponentScan.Filter(type = FilterType.CUSTOM,
        classes = AutoConfigurationExcludeFilter.class)})
@AutoConfigureMockMvc
@Import(ContractTestConfiguration.class)
@AutoConfigureStubRunner(workOffline = true,
    ids = {"henry.jonathan:promotion-contract:1.0-SNAPSHOT:stubs:8082"})
public class ContractTestBase {

  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private ApplicationContext context;

  @Before
  public void setup() {
    RestAssuredMockMvc.mockMvc(mockMvc);
  }

  @After
  public void tearDown() {
  }
}
