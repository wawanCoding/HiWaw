package com.bgwn.hiwaw.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.bgwn.hiwaw.R
import com.bgwn.hiwaw.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var fragmentContainer: NavHostFragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentContainer = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = fragmentContainer.navController
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        setupWithNavController(bottomNavigationView,navController)
    }
}