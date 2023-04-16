package com.example.application

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.application.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    private fun initViews() {
        initSpinner()
        initListView()
    }

    private fun initSpinner() {

        val selected = binding.spinner.selectedItem.toString()
        Toast.makeText(context, selected, Toast.LENGTH_SHORT).show()}

    private fun initListView() {
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.simple_list_item_1,  resources.getStringArray(com.example.application.R.array.animals_list_View))
        binding.listView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, itemClicked, position, id ->
            Toast.makeText(
                requireContext(),
                (itemClicked as TextView).text,
                Toast.LENGTH_SHORT
            ).show()
        })
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}