package com.example.tea_catalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class FavoriteTeaListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_tea_list)
        var homeBtn = findViewById<ImageButton>(R.id.homeBtn);
        var teatimeBtn = findViewById<ImageButton>(R.id.teatimeBtn);

        homeBtn.setOnClickListener {
            val intent = Intent(this@FavoriteTeaListActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        teatimeBtn.setOnClickListener {
            val intent = Intent(this@FavoriteTeaListActivity, DiaryActivity::class.java)
            startActivity(intent)
        }

    }
}