package contracts.ui

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name('Find Cart')
            request {
                method 'GET'
                urlPath('/api/cart') {
                    queryParameters {
                        parameter 'cartId': 'henry'
                    }
                }
                headers {
                    accept('application/json')
                }
            }
            response {
                status 200
                headers {
                    contentType('application/json')
                }
                body '''\
                {
                    "errorCode": null,
                    "errorMessage": null,
                    "data": {
                        "cartId": "henry",
                        "cartItems": [
                            {
                            "itemId": "Shampoo",
                            "quantity": 1,
                            "unitPrice": 200000
                            },
                            {
                            "itemId": "Soap",
                            "quantity": 2,
                            "unitPrice": 100000
                            }
                        ],
                        "discount": 40000
                    }
                }
                '''
            }
        }
]
