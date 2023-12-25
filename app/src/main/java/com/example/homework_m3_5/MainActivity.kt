package com.example.homework_m3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_m3_5.databinding.ActivityMainBinding
import java.security.Key

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object key{
        const val KEY1 = "number"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(binding.container.id, FirstFragment()).commit()
    }

}