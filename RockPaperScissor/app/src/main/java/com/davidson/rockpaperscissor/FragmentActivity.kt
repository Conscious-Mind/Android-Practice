package com.davidson.rockpaperscissor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidson.rockpaperscissor.databinding.ActivityFragmentBinding
import com.davidson.rockpaperscissor.databinding.ActivityStatsBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}