package contracts.ui

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name('Add to Cart Success')
            request {
                method 'PUT'
                urlPath('/api/cart')
                headers {
                    contentType('application/json')
                    accept('application/json')
                }
                body '''\
                {
                    "cartId": "henry.yonathan90@gmail.com",
                    "cartItem": {
                        "itemId": "ABC01"
                    }
                }
                '''
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
                        "cartId": "henry.yonathan90@gmail.com",
                        "cartItems": [
                            {
                                "itemId": "QWE01"
                            },{
                                "itemId": "ABC01"
                            }
                        ]
                    }
                }
                '''
            }
        },
        Contract.make {
            name('Add to Cart Failed')
            request {
                method 'PUT'
                urlPath('/api/cart/add')
                headers {
                    contentType('application/json')
                    accept('application/json')
                }
                body '''\
                {
                    "cartId": "henry.yonathan99@gmail.com",
                    "cartItem": {
                        "itemId": "ABC01"
                    }
                }
                '''
            }
            response {
                status 200
                headers {
                    contentType('application/json')
                }
                body '''\
                {
                    "errorCode": "NOT_FOUND",
                    "errorMessage": "member not found",
                    "data": null
                }
                '''
            }
        }
]
