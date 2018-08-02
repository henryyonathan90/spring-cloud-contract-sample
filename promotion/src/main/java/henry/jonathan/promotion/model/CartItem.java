package henry.jonathan.promotion.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author henry.jonathan
 * @since
 */
@Data
@Builder
public class CartItem {
  private String itemId;
  private int quantity;
  private BigDecimal unitPrice;
}
