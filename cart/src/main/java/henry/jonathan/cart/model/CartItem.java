package henry.jonathan.cart.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author henry.jonathan
 * @since
 */
@Data
@Builder
public class CartItem {
  private String itemId;
}
