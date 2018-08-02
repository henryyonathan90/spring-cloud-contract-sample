package henry.jonathan.clientsdk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import henry.jonathan.clientsdk.model.CalcPromotionResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RestResponseOfCalcPromotionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T11:23:50.673+07:00")

public class RestResponseOfCalcPromotionResponse   {
  @JsonProperty("data")
  private CalcPromotionResponse data = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  public RestResponseOfCalcPromotionResponse data(CalcPromotionResponse data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CalcPromotionResponse getData() {
    return data;
  }

  public void setData(CalcPromotionResponse data) {
    this.data = data;
  }

  public RestResponseOfCalcPromotionResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public RestResponseOfCalcPromotionResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestResponseOfCalcPromotionResponse restResponseOfCalcPromotionResponse = (RestResponseOfCalcPromotionResponse) o;
    return Objects.equals(this.data, restResponseOfCalcPromotionResponse.data) &&
        Objects.equals(this.errorCode, restResponseOfCalcPromotionResponse.errorCode) &&
        Objects.equals(this.errorMessage, restResponseOfCalcPromotionResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestResponseOfCalcPromotionResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

