package com.example.application

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.application.databinding.RegistrationBinding

class Registration : Fragment() {
    private var _binding: RegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = RegistrationBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            Toast.makeText(context,"Please, fill in the fields",Toast.LENGTH_SHORT).show()
            buttonEnabled()
        }
}

    private fun buttonEnabled() {
        if (binding.passwordText.text.length >=8) {
            binding.button1.isEnabled = true
            findNavController().navigate(R.id.action_registration_to_FirstFragment)}
        else {
            binding.button1.isEnabled = false
        }}

    override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}}

