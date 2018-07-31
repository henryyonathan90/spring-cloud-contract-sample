package henry.jonathan.cart.service.impl;

import henry.jonathan.cart.model.CartItem;
import henry.jonathan.cart.model.FindCartRequest;
import henry.jonathan.cart.model.FindCartResponse;
import henry.jonathan.cart.service.api.CartService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author henry.jonathan
 * @since
 */
@Service
public class CartServiceImpl implements CartService {

  public FindCartResponse findCart(FindCartRequest findCartRequest) {
    return FindCartResponse.builder()
        .cartId(findCartRequest.getCartId())
        .cartItems(Arrays.asList(CartItem.builder().itemId("Shampoo").build(),
            CartItem.builder().itemId("Soap").build()))
        .build();
  }
}
