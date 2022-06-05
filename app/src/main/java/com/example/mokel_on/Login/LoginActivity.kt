package com.example.mokel_on.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mokel_on.databinding.ActivityLoginBinding
import com.example.mokel_on.register.RegistActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.txtButton1.setOnClickListener{
            val intent = Intent(this@LoginActivity,RegistActivity::class.java)
            startActivity(intent)
        }







    }
}