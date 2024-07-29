package com.example.myapplicationfregments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.splashscreen.R
import com.example.splashscreen.databinding.ActivityMainBinding
import com.example.myapplicationfregments.fregment.InteractionInterface

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var Intrection_interface:InteractionInterface?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.buttonPanel.setOnClickListener{
        }

    }
    @SuppressLint("SetTextI18n")
    fun changetext(){
        binding.buttonPanel.setText("Change by fragment")
    }
}

interface InteractionInterface {

}

