package henry.jonathan.clientsdk.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import henry.jonathan.clientsdk.config.ClientConfiguration;

@FeignClient(name="${promotion.name:promotion}", url="${promotion.url:https://localhost:8082/promotion}", configuration = ClientConfiguration.class)
public interface PromotionControllerApiClient extends PromotionControllerApi {
}