package com.davidson.rockpaperscissor

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.davidson.rockpaperscissor.databinding.FragmentLife2Binding


class LifeFragment2 : Fragment() {

    private lateinit var binding: FragmentLife2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("lc", "started onCreate activity")
        Toast.makeText(this.activity, "started onCreate activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLife2Binding.inflate(inflater, container, false)
        Log.i("lc", "started onCreateView activity")
        Toast.makeText(this.activity, "started onCreateView activity on second fragment", Toast.LENGTH_SHORT).show()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.secondLifeFragButton.setOnClickListener {
            findNavController().navigate(R.id.action_lifeFragment2_to_lifeFragment3)
        }
        Log.i("lc", "started onViewCreated activity")
        Toast.makeText(this.activity, "started onViewCreated activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.i("lc", "started onViewStateRestored activity")
        Toast.makeText(this.activity, "started onViewStateRestored activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("lc", "started onStart activity")
        Toast.makeText(this.activity, "started onStart activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("lc", "started onResume activity")
        Toast.makeText(this.activity, "started onResume activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("lc", "started onStop activity")
        Toast.makeText(this.activity, "started onStop activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.i("lc", "started onSaveInstanceState activity")
        Toast.makeText(this.activity, "started onSaveInstanceState activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("lc", "started onDestroyView activity")
        Toast.makeText(this.activity, "started onDestroyView activity on second fragment", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lc", "started onDestroy activity")
        Toast.makeText(this.activity, "started onDestroy activity on second fragment", Toast.LENGTH_SHORT).show()
    }

}