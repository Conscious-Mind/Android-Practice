package com.davidson.rockpaperscissor

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.davidson.rockpaperscissor.databinding.FragmentLife3Binding


class LifeFragment3 : Fragment() {
    private lateinit var binding: FragmentLife3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("lc", "started onCreate activity")
        Toast.makeText(this.activity, "started onCreate activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLife3Binding.inflate(inflater, container, false)
        Log.i("lc", "started onCreateView activity")
        Toast.makeText(this.activity, "started onCreateView activity on third fragment", Toast.LENGTH_SHORT).show()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.thirdLifeFragButton.setOnClickListener {
            val intent = Intent(this.binding.root.context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
        Log.i("lc", "started onViewCreated activity")
        Toast.makeText(this.activity, "started onViewCreated activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.i("lc", "started onViewStateRestored activity")
        Toast.makeText(this.activity, "started onViewStateRestored activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("lc", "started onStart activity")
        Toast.makeText(this.activity, "started onStart activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("lc", "started onResume activity")
        Toast.makeText(this.activity, "started onResume activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("lc", "started onStop activity")
        Toast.makeText(this.activity, "started onStop activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.i("lc", "started onSaveInstanceState activity")
        Toast.makeText(this.activity, "started onSaveInstanceState activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("lc", "started onDestroyView activity")
        Toast.makeText(this.activity, "started onDestroyView activity on third fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lc", "started onDestroy activity")
        Toast.makeText(this.activity, "started onDestroy activity on third fragment", Toast.LENGTH_SHORT).show()
    }

}