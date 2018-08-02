package henry.jonathan.clientsdk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalcPromotionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T11:23:50.673+07:00")

public class CalcPromotionResponse   {
  @JsonProperty("discount")
  private BigDecimal discount = null;

  public CalcPromotionResponse discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalcPromotionResponse calcPromotionResponse = (CalcPromotionResponse) o;
    return Objects.equals(this.discount, calcPromotionResponse.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalcPromotionResponse {\n");
    
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

