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
 * CartItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T11:23:50.673+07:00")

public class CartItem   {
  @JsonProperty("itemId")
  private String itemId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("unitPrice")
  private BigDecimal unitPrice = null;

  public CartItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")


  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CartItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public CartItem unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItem cartItem = (CartItem) o;
    return Objects.equals(this.itemId, cartItem.itemId) &&
        Objects.equals(this.quantity, cartItem.quantity) &&
        Objects.equals(this.unitPrice, cartItem.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, quantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

