package fragments

import adapters.RecyclerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.application.databinding.FeedFragmentBinding



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