package henry.jonathan.cart.service.api;

import henry.jonathan.cart.model.FindCartResponse;

/**
 * @author henry.jonathan
 * @since
 */
public interface CartService {

  FindCartResponse findCart(String cartId);

}
