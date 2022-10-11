package com.davidson.rockpaperscissor

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.davidson.rockpaperscissor.databinding.ActivityGameBinding
import kotlin.random.Random

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    var playerScore = 0
    var computerScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.statsButton.setOnClickListener{
            val intent = Intent(this, StatsActivity::class.java)
            startActivity(intent)
        }


    }

    private fun getImageId(choice:Int):Int{
        return when(choice){
            1->R.drawable.rock
            2 -> R.drawable.paper
            else -> R.drawable.scissor
        }
    }
    fun gameBegin(view:View){
        val playerChoice:Int = when(view){
            binding.rockButton->1
            binding.paperButton->2
            else->3
        }
        binding.playerChoiceImage.setImageBitmap(BitmapFactory.decodeResource(resources,getImageId(playerChoice)))

        val computerChoice = getCompChoice()
        binding.compChoiceImage.setImageBitmap(BitmapFactory.decodeResource(resources,getImageId(computerChoice)))


        val result :String = displayResult(playerChoice,computerChoice)
        binding.resultTextView.text = result
        binding.playerScoreTextView.text = playerScore.toString()
        binding.compScoreTextView.text = computerScore.toString()


    }

    private fun displayResult(playerChoice:Int, computerChoice:Int):String{
        return if(computerChoice == playerChoice) {
            binding.resultImage.setImageResource(R.drawable.state_draw)
            "Match Draw!!!"
        }
        else if(playerChoice == 1 && computerChoice == 3) {
            binding.resultImage.setImageResource(R.drawable.state_win)
            playerScore++
            "You Won!!!"
        } else if(playerChoice == 3 && computerChoice == 1) {
            binding.resultImage.setImageResource(R.drawable.state_lose)
            computerScore++
            "Computer Won!!!"
        } else if(playerChoice < computerChoice) {
            binding.resultImage.setImageResource(R.drawable.state_lose)
            computerScore++
            "Computer Won!!!"
        } else {
            binding.resultImage.setImageResource(R.drawable.state_win)
            playerScore++
            "You Won!!!"
        }
    }

    private fun getCompChoice():Int{
        return Random.nextInt(1 , 4)
    }
}