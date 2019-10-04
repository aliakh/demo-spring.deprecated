package com.demo.coroutines.controller

import com.demo.coroutines.model.Product

class ProductStockView(product: Product, var stockQuantity: Int) {
    var id: Int = 0
    var name: String = ""
    var price: Float = 0.0f

    init {
        this.id = product.id
        this.name = product.name
        this.price = product.price
    }
}