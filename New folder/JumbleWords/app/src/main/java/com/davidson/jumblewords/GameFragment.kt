package com.davidson.jumblewords

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.davidson.jumblewords.databinding.FragmentGameBinding
//import com.google.android.material.dialog.MaterialAlertDialogBuilder


class GameFragment : Fragment() {

    private val viewModel: GameViewModel by viewModels()
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_game, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gameViewModel = viewModel
        binding.maxNoOfWords = MAX_NO_OF_WORDS
        binding.lifecycleOwner = viewLifecycleOwner

        binding.submit.setOnClickListener { onSubmitWord() }
        binding.skip.setOnClickListener { onSkipWord() }
        setErrorTextField(false)
    }


    private fun onSubmitWord() {
        val playerWord = binding.textInputEditText.text.toString()

        if (viewModel.isUserWordCorrect(playerWord)) {
            setErrorTextField(false)
            if (!viewModel.nextWord()) {
//                showFinalScoreDialog()
                findNavController().navigate(R.id.action_gameFragment_to_gameEndFragment)
            }
        } else {
            setErrorTextField(true)
        }
    }


    private fun onSkipWord() {
        if (viewModel.nextWord()) {
            setErrorTextField(false)
        } else {
//            showFinalScoreDialog()
            findNavController().navigate(R.id.action_gameFragment_to_gameEndFragment)
        }
    }


//    private fun showFinalScoreDialog() {
//        MaterialAlertDialogBuilder(requireContext())
//            .setTitle(getString(R.string.congratulations))
//            .setMessage(getString(R.string.you_scored, viewModel.score.value))
//            .setCancelable(false)
//            .setNegativeButton(getString(R.string.exit)) { _, _ ->
//                exitGame()
//            }
//            .setPositiveButton(getString(R.string.play_again)) { _, _ ->
//                restartGame()
//            }
//            .show()
//    }


//    private fun restartGame() {
//        viewModel.reinitializeData()
//        setErrorTextField(false)
//    }
//
//
//    private fun exitGame() {
//        activity?.finish()
//    }


    private fun setErrorTextField(error: Boolean) {
        if (error) {
            binding.textField.isErrorEnabled = true
            binding.textField.error = getString(R.string.try_again)
        } else {
            binding.textField.isErrorEnabled = false
            binding.textInputEditText.text = null
        }
    }
}