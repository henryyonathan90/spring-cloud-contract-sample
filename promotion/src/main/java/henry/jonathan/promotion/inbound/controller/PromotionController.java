package henry.jonathan.promotion.inbound.controller;

import henry.jonathan.promotion.model.CalcPromotionRequest;
import henry.jonathan.promotion.model.CalcPromotionResponse;
import henry.jonathan.promotion.model.RestResponse;
import henry.jonathan.promotion.service.api.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author henry.jonathan
 * @since
 */
@RestController
@RequestMapping("/api/promotion")
public class PromotionController {

  @Autowired
  private PromotionService promotionService;

  @PostMapping
  public RestResponse<CalcPromotionResponse> calcPromotion(@RequestBody CalcPromotionRequest calcPromotionRequest) {
    return RestResponse.<CalcPromotionResponse>builder().data(promotionService.applyPromotion(
        calcPromotionRequest)).build();
  }
}
