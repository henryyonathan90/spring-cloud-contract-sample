package henry.jonathan.promotion.service.impl;

import henry.jonathan.promotion.model.CalcPromotionRequest;
import henry.jonathan.promotion.model.CalcPromotionResponse;
import henry.jonathan.promotion.service.api.PromotionService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author henry.jonathan
 * @since
 */
@Service
public class PromotionServiceImpl implements PromotionService {

  @Override
  public CalcPromotionResponse applyPromotion(CalcPromotionRequest calcPromotionRequest) {

    return CalcPromotionResponse.builder()
        .discount(BigDecimal.valueOf(calcPromotionRequest.getCartItems()
            .stream()
            .mapToDouble(value -> value.getUnitPrice()
                .multiply(BigDecimal.valueOf(value.getQuantity()))
                .doubleValue())
            .sum() / 10))
        .build();
  }
}
