package henry.jonathan.clientsdk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import henry.jonathan.clientsdk.model.CartItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalcPromotionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T11:23:50.673+07:00")
@Builder
public class CalcPromotionRequest   {
  @JsonProperty("cartItems")
  @Valid
  private List<CartItem> cartItems = null;

  public CalcPromotionRequest cartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
    return this;
  }

  public CalcPromotionRequest addCartItemsItem(CartItem cartItemsItem) {
    if (this.cartItems == null) {
      this.cartItems = new ArrayList<CartItem>();
    }
    this.cartItems.add(cartItemsItem);
    return this;
  }

  /**
   * Get cartItems
   * @return cartItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CartItem> getCartItems() {
    return cartItems;
  }

  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalcPromotionRequest calcPromotionRequest = (CalcPromotionRequest) o;
    return Objects.equals(this.cartItems, calcPromotionRequest.cartItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalcPromotionRequest {\n");
    
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
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

