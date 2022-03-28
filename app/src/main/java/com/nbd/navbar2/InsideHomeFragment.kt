package com.nbd.navbar2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nbd.navbar2.databinding.FragmentInsideHomeBinding

class InsideHomeFragment : Fragment() {
    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentInsideHomeBinding.inflate(layoutInflater)
        val argumentoRecibido=arguments?.getString("argumentoPasado")
        return binding.root
    }

}