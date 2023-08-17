package com.example.feiraapp.model

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appfeira.Payment
import com.example.appfeira.databinding.ActivityProductDetailsBinding
import kotlinx.coroutines.newFixedThreadPoolContext
import java.text.DecimalFormat

class ProductDetails : AppCompatActivity() {

    private lateinit var binding : ActivityProductDetailsBinding
    var amount = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("E0E0E0")

        val imgProduct = intent.extras!!.getInt("imgProduct")
        val name = intent.extras!!.getString("name")
        var price = intent.extras!!.getString("price")!!.toDouble()
        var newPrice = price
        val decimalFormat = DecimalFormat.getCurrencyInstance()

        binding.imgProduct.setBackgroundResource(imgProduct)
        binding.txtProductName.text = "$name"
        binding.txtPrice.text = decimalFormat.format(price)

        binding.btIncrease.setOnClickListener{
            if (amount == 1){
                binding.txtAmount.text = "2"
                newPrice += price
                amount = 2
            }else if (amount == 2){
                binding.txtAmount.text = "3"
                newPrice += price
                amount = 3
            }
            binding.txtPrice.text = decimalFormat.format(newPrice)
        }
        binding.btToDecrease.setOnClickListener{
            if (amount == 3){
                binding.txtAmount.text = "2"
                newPrice -= price
                amount = 2
            }else if (amount == 2){
                binding.txtAmount.text = "1"
                newPrice -= price
                amount = 1
            }
            binding.txtPrice.text = decimalFormat.format(newPrice)
        }

        binding.btConfirmar.setOnClickListener{

            val caldoDeCana = binding.btCaldoDeCana
            val queijo = binding.btQueijo
            val pimenta = binding.btPimenta
            val sucoNatural = binding.btSucoNatural

            val produtos = when {
                caldoDeCana.isChecked -> {
                    "Caldo de cana"
                }
                queijo.isChecked -> {
                    "Queijo"
                }
                pimenta.isChecked -> {
                    "Pimenta"
                }
                sucoNatural.isChecked ->{
                    "Suco natural"
                }
                else -> {
                    ""
                }
            }
            val intent = Intent(this, Payment::class.java)
            intent.putExtra("Nome", name)
            intent.putExtra("amont", amount)
            intent.putExtra("Total", newPrice)
            intent.putExtra("Produtos", produtos)

            startActivity(intent)
        }
    }
}