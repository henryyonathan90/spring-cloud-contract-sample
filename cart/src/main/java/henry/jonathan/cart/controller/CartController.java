package henry.jonathan.cart.controller;

import henry.jonathan.cart.model.FindCartRequest;
import henry.jonathan.cart.model.FindCartResponse;
import henry.jonathan.cart.model.RestResponse;
import henry.jonathan.cart.service.api.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author henry.jonathan
 * @since
 */
@RestController
@RequestMapping("/api/cart")
public class CartController {

  @Autowired
  private CartService cartService;

  @GetMapping
  public RestResponse<FindCartResponse> addToCart(FindCartRequest findCartRequest) {
    return RestResponse.<FindCartResponse>builder().data(cartService.findCart(findCartRequest))
        .build();
  }
}
