package com.teddy.compactor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.teddy.compactor.databinding.ActivityMainBinding
import load

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivTest.load("https://picsum.photos/200")
    }
}