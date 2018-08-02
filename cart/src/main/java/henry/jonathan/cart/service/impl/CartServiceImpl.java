package henry.jonathan.cart.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import henry.jonathan.cart.model.CartItem;
import henry.jonathan.cart.model.FindCartRequest;
import henry.jonathan.cart.model.FindCartResponse;
import henry.jonathan.cart.service.api.CartService;
import henry.jonathan.clientsdk.api.PromotionControllerApi;
import henry.jonathan.clientsdk.model.CalcPromotionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author henry.jonathan
 * @since
 */
@Service
public class CartServiceImpl implements CartService {

  @Autowired
  private PromotionControllerApi promotionControllerApi;

  @Autowired
  private ObjectMapper objectMapper;

  public FindCartResponse findCart(FindCartRequest findCartRequest) {
    List<CartItem> cartItems = Arrays.asList(CartItem.builder()
            .itemId("Shampoo")
            .unitPrice(new BigDecimal("200000"))
            .quantity(1)
            .build(),
        CartItem.builder().itemId("Soap").unitPrice(new BigDecimal("100000")).quantity(2).build());

    return FindCartResponse.builder()
        .cartId(findCartRequest.getCartId())
        .cartItems(cartItems)
        .discount(promotionControllerApi.calcPromotionUsingPOST(CalcPromotionRequest.builder()
            .cartItems(cartItems.stream()
                .map(cartItem -> convert(cartItem))
                .collect(Collectors.toList()))
            .build()).getBody().getData().getDiscount())
        .build();
  }

  private henry.jonathan.clientsdk.model.CartItem convert(CartItem cartItem) {
    try {
      return objectMapper.readValue(objectMapper.writeValueAsString(cartItem),
          henry.jonathan.clientsdk.model.CartItem.class);
    } catch (Exception ex) {
    }
    return null;
  }
}
