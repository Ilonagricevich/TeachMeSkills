package presentation.fragments

import presentation.adapters.RecyclerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import domain.models.DomainPosts
import androidx.navigation.fragment.findNavController
import com.example.application.R
import com.example.application.databinding.FeedFragmentBinding
import presentation.view_elements.NewViewModelInfo
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FeedFragment : Fragment() {

    private lateinit var binding: FeedFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FeedFragmentBinding.inflate(inflater, container, false);
        return binding.root
    }
}