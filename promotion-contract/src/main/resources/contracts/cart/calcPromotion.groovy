package contracts.cart

import org.springframework.cloud.contract.spec.Contract

/**
 *
 *
 * @author henry.jonathan
 * @since
 *
 */
[
        Contract.make {
            name('Calculate Promotion')
            request {
                method 'POST'
                headers {
                    contentType('application/json')
                }
                urlPath('/api/promotion') {
                    body '''
                    {
                        "cartItems": [
                            {
                                "itemId": "Shampoo",
                                "unitPrice": 200000,
                                "quantity": 1
                            },
                            {
                                "itemId": "Soap",
                                "unitPrice": 100000,
                                "quantity": 2
                            }
                        ]
                    }'''
                }
            }
            response {
                status 200
                headers {
                    contentType('application/json;charset=UTF-8')
                }
                body '''
                {
                    "errorCode": null,
                    "errorMessage": null,
                    "data": {
                        "discount": 40000
                    }   
                }'''
            }
        }
]
