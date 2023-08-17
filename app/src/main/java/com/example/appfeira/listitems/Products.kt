package com.example.appfeira.listitems

import android.os.Bundle
import com.example.appfeira.R
import com.example.appfeira.databinding.ActivityProductDetailsBinding
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
                imgProduct = R.drawable.tomate,
                name = "Tomate",
                price = "R$ 2,99"

            ),

            Product(
                imgProduct = R.drawable.cenoura,
                name = "Cenoura",
                price = "R$ 1,99"

            ),
            Product(
                imgProduct = R.drawable.batata,
                name = "Batata",
                price = "R$ 3,99"

            ),
            Product(
                imgProduct = R.drawable.couveflor,
                name = "Couve Flor",
                price = "R$ 1,99"

            ),
            Product(
                imgProduct = R.drawable.pepino,
                name = "Pepino",
                price = "R$ 1,99"

            ),
            Product(
                imgProduct = R.drawable.beterraba,
                name = "Beterraba",
                price = "R$ 1,99"

            ),
            Product(
                imgProduct = R.drawable.berinjela,
                name = "Berinjela",
                price = "R$ 1,99"

            ),
            Product(
                imgProduct = R.drawable.milho,
                name = "Milho Verde",
                price = "R$ 6,99"

            ),
            Product(
                imgProduct = R.drawable.pimentao,
                name = "Pimentão",
                price = "R$ 12,99"

            ),
        )

        _productList.value = productList
        return productListFlow

    }

}