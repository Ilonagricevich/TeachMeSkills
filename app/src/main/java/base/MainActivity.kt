package base

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.application.R
import com.example.application.databinding.ActivityMainTestBinding
import fragments.FirstTestFragment
import fragments.SecondTestFragment

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainTestBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.forward.setOnClickListener {
            replaceFragment(fragment = FirstTestFragment())
        }

        binding.back.setOnClickListener {
            replaceFragment(fragment = SecondTestFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        fragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment_container_test, fragment)
            .commit()
    }
}
