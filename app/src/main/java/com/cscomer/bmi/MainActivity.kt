package com.cscomer.bmi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cscomer.bmi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottom.setOnClickListener {

            val height=binding.hight.text.toString().toDouble()/100
            val weight=binding.wight.text.toString().toDouble()


            val bmi=weight/(height*height)


            binding.bmiTV.text= String.format("BMI is : %.2f",bmi)


           binding.result.text=  when(bmi){
                in 0.0..12.1 -> "BMI Type is : Under low"
                in 12.2..20.2 -> "BMI type is :Normal "
                in 20.2..30.1->"BMI Type is : Hight"
                in 30.2..40.3-> "BMI Type is : overHight"

                else-> "BMi Type is :Obesity "


            }

        }

    }
}