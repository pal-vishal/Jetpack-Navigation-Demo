package com.example.jetpacknavigationlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpacknavigationlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

       /*
       Each navhost has  its own nav controller.
       When we use navigation use, we use single activity architecture.
       We don't need to use fragment manager for fragment transactions.
       placeholder is just used for visual design.
       Only one navhostfragment should have true value for app:defaultNavHost
        */
    }
}