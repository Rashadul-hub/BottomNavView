package com.example.bottomnavview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottomnavview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //BottomNavigationView
        binding.bottomNavBar.setOnItemSelectedListener {  item ->
            when(item.itemId) {
                R.id.home -> {
                    Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }

                R.id.inbox -> {
                    Toast.makeText(this, "Box clicked", Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }

                R.id.DashBoard -> {
                    Toast.makeText(this, "Stack clicked", Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}