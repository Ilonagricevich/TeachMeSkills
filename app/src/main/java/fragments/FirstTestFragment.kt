package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.application.R
import com.example.application.databinding.FirstTestFragmentBinding

class FirstTestFragment : Fragment() {

        private lateinit var binding: FirstTestFragmentBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FirstTestFragmentBinding.inflate(inflater, container, false)
            binding.firstButton.setOnClickListener {
                launchNextFragment()
            }
            return binding.root
        }


        private fun launchNextFragment() {
            val bundle = Bundle()

            bundle.putInt("TestArg", 1)

            val fragment = SecondTestFragment()
            fragment.arguments = bundle

            parentFragmentManager
                .beginTransaction()
                .add(R.id.main_fragment_container_test, fragment)
                .commit()
        }

}