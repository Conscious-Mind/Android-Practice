package com.davidson.rockpaperscissor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.davidson.rockpaperscissor.databinding.ActivityStatsBinding

class StatsActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityStatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}