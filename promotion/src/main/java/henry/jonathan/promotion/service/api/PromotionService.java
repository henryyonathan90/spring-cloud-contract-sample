package henry.jonathan.promotion.service.api;

import henry.jonathan.promotion.model.CalcPromotionRequest;
import henry.jonathan.promotion.model.CalcPromotionResponse;

/**
 * @author henry.jonathan
 * @since
 */
public interface PromotionService {

  CalcPromotionResponse applyPromotion(CalcPromotionRequest calcPromotionRequest);

}
