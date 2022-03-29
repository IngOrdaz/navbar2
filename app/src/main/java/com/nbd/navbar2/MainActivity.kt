package com.nbd.navbar2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nbd.navbar2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        //val navHostFrag=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //binding.bottomNavigationView.setupWithNavController(navHostFrag.navController)

        val navView: BottomNavigationView=findViewById(R.id.bottomNavigationView)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController=navHostFragment.navController
        navView.setupWithNavController(navController)
    }
}