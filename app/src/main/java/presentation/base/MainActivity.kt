package presentation.base

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.application.R
import com.example.application.databinding.ActivityMainTestBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainTestBinding.inflate(layoutInflater)
        setContentView(binding.root)



}}
