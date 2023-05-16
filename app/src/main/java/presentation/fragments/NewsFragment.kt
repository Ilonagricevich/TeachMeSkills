package presentation.fragments

import presentation.adapters.RecyclerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.application.R
import com.example.application.databinding.NewsFragmentBinding
import domain.models.DomainPostsList
import presentation.view_elements.ViewModelNews


class NewsFragment : Fragment() {

    private lateinit var binding: NewsFragmentBinding
    private var viewModel: ViewModelNews? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(owner = this)[ViewModelNews::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = NewsFragmentBinding.inflate(inflater, container, false)
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
        val posts = viewModel?.postList?.value ?: DomainPostsList()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(
                items = posts){
                findNavController().apply {
                    navigate(R.id.action_NewsFragment_to_FeedFragment)
                }}
            }
        }
    }


