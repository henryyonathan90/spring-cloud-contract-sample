package henry.jonathan.cart.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author henry.jonathan
 * @since
 */
@Configuration
public class BeanConfig {

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }
}
