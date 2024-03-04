package com.example.tea_catalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class DiaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary)

        var homeBtn = findViewById<ImageButton>(R.id.homeBtn);
        var likedBtn = findViewById<ImageButton>(R.id.likedBtn);
        var backBtn = findViewById<ImageView>(R.id.teatimeBackBtn);
        var addBtn = findViewById<ImageView>(R.id.addTeatimeBtn);

        homeBtn.setOnClickListener {
            val intent = Intent(this@DiaryActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        likedBtn.setOnClickListener {
            val intent = Intent(this@DiaryActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

        addBtn.setOnClickListener {
            val intent = Intent(this@DiaryActivity, NewTeaTimeActivity::class.java)
            startActivity(intent)
        }

        backBtn.setOnClickListener {
            val intent = Intent(this@DiaryActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

    }
}