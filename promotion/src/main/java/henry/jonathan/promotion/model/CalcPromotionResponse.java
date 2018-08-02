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
public class CalcPromotionResponse {
  private BigDecimal discount;
}
