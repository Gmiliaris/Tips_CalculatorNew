package com.example.tipscalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipscalculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totaltable = intent.getFloatExtra("totalTable", 0.0F)
        val numpeople = intent.getIntExtra("nPeopleTemp", 0)
        val percentage = intent.getIntExtra("percentage", 0)
        val totalAmount = intent.getFloatExtra("totalAmount", 0.0f)


        binding.tvPercentage.text = percentage.toString()
        binding.tvTotalAmount.text = totalAmount.toString()
        binding.tvTotalTable.text = totaltable.toString()
        binding.tvTotalNpeopleTable.text = numpeople.toString()

        binding.btnRestart.setOnClickListener {
            finish()
        }
    }
}