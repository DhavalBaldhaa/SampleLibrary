package com.kdinfotech.samplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kdinfotech.messagelibrary.AlertMessage
import com.kdinfotech.samplelibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClick(v:View){
        when(v){
            binding.btnShowMessage->{
                AlertMessage.showMessage(this,getString(R.string.app_name), "Heyy...This is my library alert"
                ) {
                    Toast.makeText(this, "Dismiss callback", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}