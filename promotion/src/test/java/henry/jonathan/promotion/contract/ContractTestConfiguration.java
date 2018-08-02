package henry.jonathan.promotion.contract;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.contract.verifier.messaging.amqp.ContractVerifierAmqpAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @author henry.jonathan
 * @since
 */
@TestConfiguration
public class ContractTestConfiguration {

}
