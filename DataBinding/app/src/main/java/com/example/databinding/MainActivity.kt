package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    var text = "Hello!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding 세팅
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // 현재 binding시킨 xml의 variable name
        binding.main = this
        binding.btnChange.setOnClickListener{
            text = "Hello Binding!"
            binding.invalidateAll()
        }
        binding.btnOriginally.setOnClickListener {
            text = "Hello!"
            binding.invalidateAll()
        }

        //setContentView(R.layout.activity_main)
    }
}