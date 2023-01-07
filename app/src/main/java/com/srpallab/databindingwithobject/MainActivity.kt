package com.srpallab.databindingwithobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.srpallab.databindingwithobject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student(1, "Shafiqur Rahman", "pallab.alif@gmail.com")
    }
}