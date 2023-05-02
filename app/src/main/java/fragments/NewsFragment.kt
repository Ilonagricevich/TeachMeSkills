package fragments

import adapters.RecyclerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.application.R
import com.example.application.databinding.NewsFragmentBinding
import elements.Elements


class NewsFragment : Fragment() {

    private var _binding: NewsFragmentBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = NewsFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_NewsFragment_to_FeedFragment)
        }
    }

    private fun initViews() {
        initRecycler()
    }

    private fun  initRecycler() {

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(
                Elements().elements(),
                event = {
                    findNavController().apply {
                        navigate(R.id.action_NewsFragment_to_FeedFragment)
                    }
                }
            )
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}