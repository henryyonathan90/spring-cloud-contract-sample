/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package henry.jonathan.clientsdk.api;

import henry.jonathan.clientsdk.model.CalcPromotionRequest;
import henry.jonathan.clientsdk.model.RestResponseOfCalcPromotionResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-01T11:23:50.673+07:00")

@Api(value = "PromotionController", description = "the PromotionController API")
public interface PromotionControllerApi {

    @ApiOperation(value = "calcPromotion", nickname = "calcPromotionUsingPOST", notes = "", response = RestResponseOfCalcPromotionResponse.class, tags={ "promotion-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestResponseOfCalcPromotionResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/promotion",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RestResponseOfCalcPromotionResponse> calcPromotionUsingPOST(@ApiParam(
        value = "calcPromotionRequest",
        required = true) @Valid @RequestBody CalcPromotionRequest calcPromotionRequest);

}
