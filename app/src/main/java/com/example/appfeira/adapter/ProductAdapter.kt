package com.example.feiraapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.appfeira.databinding.ProductItemBinding
import com.example.appfeira.model.Product
import com.example.feiraapp.model.ProductDetails

class ProductAdapter(private val context: Context, private val productList: MutableList<Product>):
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val listItem = ProductItemBinding.inflate(LayoutInflater.from(context), parent,false)
        return ProductViewHolder(listItem)
    }

    override fun getItemCount() = productList.size

    fun clickOn(holder: ProductAdapter.ProductViewHolder, position: Int){
        holder.btAdd.setOnClickListener{
            val intent = Intent(context, ProductDetails::class.java)
            intent.putExtra("imgProduct", productList[position].imgProduct)
            intent.putExtra("name", productList[position].name)
            intent.putExtra("price", productList[position].price)
            context.startActivity(intent)
        }
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
        holder.imgProduct.setBackgroundResource(productList[position].imgProduct)
        holder.name.text = productList[position].name
        holder.price.text = productList[position].price
    }
    inner class ProductViewHolder(binding: ProductItemBinding): RecyclerView.ViewHolder(binding.root){
        val imgProduct = binding.imgProduct
        val name = binding.txtName
        val price = binding.txtPrice
        val btAdd = binding.add
    }
}