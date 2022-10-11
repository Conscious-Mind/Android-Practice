package com.davidson.rockpaperscissor

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.davidson.rockpaperscissor.databinding.FragmentFirstBinding
import com.davidson.rockpaperscissor.databinding.FragmentLife1Binding


class LifeFragment1 : Fragment() {

    private lateinit var binding: FragmentLife1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("lc", "started onCreate activity")
        Toast.makeText(this.activity, "started onCreate activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLife1Binding.inflate(inflater, container, false)
        Log.i("lc", "started onCreateView activity")
        Toast.makeText(this.activity, "started onCreateView activity on first fragment", Toast.LENGTH_SHORT).show()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.firstLifeFragButton.setOnClickListener {
            findNavController().navigate(R.id.action_lifeFragment1_to_lifeFragment2)
        }
        Log.i("lc", "started onViewCreated activity")
        Toast.makeText(this.activity, "started onViewCreated activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.i("lc", "started onViewStateRestored activity")
        Toast.makeText(this.activity, "started onViewStateRestored activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("lc", "started onStart activity")
        Toast.makeText(this.activity, "started onStart activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("lc", "started onResume activity")
        Toast.makeText(this.activity, "started onResume activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("lc", "started onStop activity")
        Toast.makeText(this.activity, "started onStop activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.i("lc", "started onSaveInstanceState activity")
        Toast.makeText(this.activity, "started onSaveInstanceState activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("lc", "started onDestroyView activity")
        Toast.makeText(this.activity, "started onDestroyView activity on first fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lc", "started onDestroy activity")
        Toast.makeText(this.activity, "started onDestroy activity on first fragment", Toast.LENGTH_SHORT).show()
    }
}