package com.rn.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rn.navigationapi.databinding.FragmentCompleteBinding

class CompleteFragment : Fragment() {
    private lateinit var binding: FragmentCompleteBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCompleteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.run {
            val fullName = getString("full_name")
            val age = getInt("age")
            binding.txtMessage.text = "$fullName-$age"
        }
    }
}