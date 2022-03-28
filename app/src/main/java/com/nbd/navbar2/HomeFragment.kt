package com.nbd.navbar2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.nbd.navbar2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)

        //onclick
        //action_homeFragment_to_insideHomeFragment2
        val navController= findNavController()
        binding.buttonHomeToInside.setOnClickListener{
            //Toast.makeText(context, "prueba", Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHomeFragment2)
        val directions=HomeFragmentDirections.actionHomeFragmentToInsideHomeFragment2("desde el home")
        navController.navigate(directions)
        }

        return binding.root

    }


}