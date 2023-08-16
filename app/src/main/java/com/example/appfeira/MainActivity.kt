package com.example.appfeira

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.appfeira.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // private lateinit var productAdapter: ProductAdapter
    //private val products = Products()
    //private val productList: MutableList<Product> = mutableListOf()
    var clicked = false

    @SuppressLint("ResourceAsColor", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        functionsView()

    }

    @SuppressLint("ResourceAsColor")
    fun functionsView() {
//
//        CoroutineScope(Dispatchers.IO).launch {
//            products.getProducts().collectIndexed { index, value ->
//                for (p in value) {
//                    productList.add(p)
//                }
//            }
//        }

        //val recyclerViewProducts = binding.recyclerViewProducts
        //recyclerViewProducts.layoutManager = GridLayoutManager(this, 2)
        // recyclerViewProducts.setHasFixedSize(true)
        // productAdapter = ProductAdapter(this, productList)
        // recyclerViewProducts.adapter = productAdapter


        binding.btnAll.setOnClickListener {
            clicked = true
            if (clicked) {
                binding.btnAll.setBackgroundResource(R.drawable.bd_button_enabled)
                binding.btnAll.setTextColor(Color.WHITE)
                binding.btnFrutas.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnFrutas.setTextColor(R.color.dark_gray)
                binding.btnVerduras.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnVerduras.setTextColor(R.color.dark_gray)
                binding.btnFolhas.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnFolhas.setTextColor(R.color.dark_gray)
                // binding.recyclerViewProducts.visibility = View.INVISIBLE
                //  binding.textListTitle.text = "All"
            }
        }

        binding.btnFrutas.setOnClickListener {
            clicked = true
            if (clicked) {
                binding.btnFrutas.setBackgroundResource(R.drawable.bd_button_enabled)
                binding.btnFrutas.setTextColor(Color.WHITE)
                binding.btnAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnAll.setTextColor(R.color.dark_gray)
                binding.btnVerduras.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnVerduras.setTextColor(R.color.dark_gray)
                binding.btnFolhas.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnFolhas.setTextColor(R.color.dark_gray)
                //binding.recyclerViewProducts.visibility = View.INVISIBLE
                //binding.textListTitle.text = "Frutas"
            }
        }

        binding.btnVerduras.setOnClickListener {
            clicked = true
            if (clicked) {
                binding.btnVerduras.setBackgroundResource(R.drawable.bd_button_enabled)
                binding.btnVerduras.setTextColor(Color.WHITE)
                binding.btnFrutas.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnFrutas.setTextColor(R.color.dark_gray)
                binding.btnAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnAll.setTextColor(R.color.dark_gray)
                binding.btnFolhas.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnFolhas.setTextColor(R.color.dark_gray)
                // binding.recyclerViewProducts.visibility = View.VISIBLE
                // binding.textListTitle.text = "Pizza"

            }
        }

        binding.btnFolhas.setOnClickListener {
            clicked = true
            if (clicked) {
                binding.btnFolhas.setBackgroundResource(R.drawable.bd_button_enabled)
                binding.btnFolhas.setTextColor(Color.WHITE)
                binding.btnVerduras.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnVerduras.setTextColor(R.color.dark_gray)
                binding.btnFrutas.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnFrutas.setTextColor(R.color.dark_gray)
                binding.btnAll.setBackgroundResource(R.drawable.bg_button_disabled)
                binding.btnAll.setTextColor(R.color.dark_gray)
                // binding.recyclerViewProducts.visibility = View.INVISIBLE
                // binding.textListTitle.text = "Kebab"

            }
        }
    }
}
