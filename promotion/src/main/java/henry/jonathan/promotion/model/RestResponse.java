package henry.jonathan.promotion.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author henry.jonathan
 * @since
 */
@Data
@Builder
public class RestResponse<T> {
  private String errorCode;
  private String errorMessage;
  private T data;
}
