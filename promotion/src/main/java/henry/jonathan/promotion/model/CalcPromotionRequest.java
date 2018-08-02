package henry.jonathan.promotion.model;

import lombok.Data;

import java.util.List;

/**
 * @author henry.jonathan
 * @since
 */
@Data
public class CalcPromotionRequest {
  private List<CartItem> cartItems;
}
