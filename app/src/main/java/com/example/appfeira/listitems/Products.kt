package com.example.appfeira.listitems

import com.example.appfeira.R
import com.example.appfeira.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Products {
    private val _productList = MutableStateFlow<MutableList<Product>>(mutableListOf())
    private val productListFlow: StateFlow<MutableList<Product>> = _productList

    fun getProducts(): Flow<MutableList<Product>>{
        val productList: MutableList<Product> = mutableListOf(
            Product(
                imgProduct = R.drawable.hellokit,
                name = "Tomate",
                price = "2,99"

            ),

            Product(
                imgProduct = R.drawable.coco,
                name = "Batata",
                price = "1,99"

            ),
            Product(
                imgProduct = R.drawable.hellokit,
                name = "Cenoura",
                price = "3,99"

            ),
            Product(
                imgProduct = R.drawable.hellokit,
                name = "Chuchu",
                price = "1,99"

            ),
        )

        _productList.value = productList
        return productListFlow
    }
}