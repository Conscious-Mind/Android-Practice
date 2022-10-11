package com.davidson.rockpaperscissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.davidson.rockpaperscissor.databinding.ActivityLifeBinding
import com.davidson.rockpaperscissor.databinding.ActivityOptionsBinding
import com.davidson.rockpaperscissor.databinding.FragmentLife2Binding

class LifeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLifeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i("lc", "started onCreate activity")
        Toast.makeText(this, "started onCreate activity", Toast.LENGTH_SHORT).show()

        binding.lifeMainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lc", "started onStart activity")
        Toast.makeText(this, "started onStart activity", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("lc", "started onResume activity")
        Toast.makeText(this, "started onResume activity", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("lc", "started onPause activity")
        Toast.makeText(this, "started onPause activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("lc", "started onStop activity")
        Toast.makeText(this, "started onStop activity", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lc", "started onDestroy activity")
        Toast.makeText(this, "started onDestroy activity", Toast.LENGTH_SHORT).show()
    }
}