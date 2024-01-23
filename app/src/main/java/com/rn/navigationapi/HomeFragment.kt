package com.rn.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.rn.navigationapi.databinding.FragmentHomeBinding

class HomeFragment : Fragment(){
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGo.setOnClickListener{

            val args = Bundle().apply {
                putString("full_name", "Rian Noronha")
                putInt("age", 22)
            }

            Navigation.findNavController(requireActivity(), R.id.navHostFragment)
                .navigate(R.id.action_homeFragment_to_completeFragment, args)
        }
    }
}