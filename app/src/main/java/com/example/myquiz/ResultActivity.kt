package com.example.myquiz

import android.content.Intent
import android.graphics.Paint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

         val btnFinish:Button=findViewById(R.id.btn_finish)
        val tvName:TextView=findViewById(R.id.tv_name)
        val tvScore:TextView=findViewById(R.id.tv_score)

        tvName.text= intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions= intent.getIntExtra(Constants.TOTAL_QUESTIONS , 0)
        val correctQuestions=intent.getIntExtra(Constants.CORRECT_ANSWERS , 0)
         tvScore.text="your Score : $correctQuestions/$totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }






    }
}