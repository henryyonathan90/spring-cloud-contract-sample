package henry.jonathan.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author henry.jonathan
 * @since
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"henry.jonathan.clientsdk"})
public class CartMain {
  public static void main(String[] args) {
    SpringApplication.run(CartMain.class, args);
  }
}
