package com.example.mokel_on.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mokel_on.Login.LoginActivity
import com.example.mokel_on.R
import com.example.mokel_on.databinding.ActivityRegistBinding

class RegistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.txtButton2.setOnClickListener{
            val intent = Intent(this@RegistActivity,LoginActivity::class.java)
            startActivity(intent)
        }

    }
}