package com.hofh.hitonfivehamsters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hofh.hitonfivehamsters.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var aHit = 0
    var aScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     //   GlobalScope.async { hamsterShowAndHide1() }
        binding.button.setOnClickListener {
            GlobalScope.async { hamsterShowAndHide1() }
            GlobalScope.async { hamsterShowAndHide2() }
            GlobalScope.async { hamsterShowAndHide3() }
            GlobalScope.async { hamsterShowAndHide4() }
            GlobalScope.async { hamsterShowAndHide5() }
        }

        binding.imageView.setOnClickListener{
            if (aHit == 1) aScore++
            binding.textViewHitOn.text = "Hamsters HIT: " + aScore.toString()
        }
        binding.imageView2.setOnClickListener{
            if (aHit == 1) aScore++
            binding.textViewHitOn.text = "Hamsters HIT: " + aScore.toString()
        }
        binding.imageView3.setOnClickListener{
            if (aHit == 1) aScore++
            binding.textViewHitOn.text = "Hamsters HIT: " + aScore.toString()
        }
        binding.imageView4.setOnClickListener{
            if (aHit == 1) aScore++
            binding.textViewHitOn.text = "Hamsters HIT: " + aScore.toString()
        }
        binding.imageView5.setOnClickListener{
            if (aHit == 1) aScore++
            binding.textViewHitOn.text = "Hamsters HIT: " + aScore.toString()
        }




    }

    suspend fun hamsterShowAndHide1(){
        delay((3000..5000).random().toLong())
        binding.imageView.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView.setImageResource(R.drawable.angry_hom_empty) ; aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
    }

    suspend fun hamsterShowAndHide2(){
        delay((3000..5000).random().toLong())
        binding.imageView2.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView2.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView2.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView2.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView2.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView2.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
    }
    suspend fun hamsterShowAndHide3(){
        delay((3000..5000).random().toLong())
        binding.imageView3.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView3.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView3.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView3.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView3.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView3.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
    }
    suspend fun hamsterShowAndHide4(){
        delay((3000..5000).random().toLong())
        binding.imageView4.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView4.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView4.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView4.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView4.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView4.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
    }
    suspend fun hamsterShowAndHide5(){
        delay((3000..5000).random().toLong())
        binding.imageView5.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView5.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView5.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView5.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
        binding.imageView5.setImageResource(R.drawable.angry_hom_bum) ; aHit = 1
        delay((500..5000).random().toLong())
        binding.imageView5.setImageResource(R.drawable.angry_hom_empty); aHit = 0
        delay((500..5000).random().toLong())
    }

}