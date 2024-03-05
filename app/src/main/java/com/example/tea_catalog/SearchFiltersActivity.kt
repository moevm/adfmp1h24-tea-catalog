package com.example.tea_catalog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchFiltersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_filters)

        var homeBtn = findViewById<ImageButton>(R.id.homeBtn);
        var likedBtn = findViewById<ImageButton>(R.id.likedBtn);
        var teatimeBtn = findViewById<ImageButton>(R.id.teatimeBtn);
        var backBtn = findViewById<ImageView>(R.id.searchFiltersBackBtn);

        homeBtn.setOnClickListener {
            val intent = Intent(this@SearchFiltersActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        likedBtn.setOnClickListener {
            val intent = Intent(this@SearchFiltersActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

        teatimeBtn.setOnClickListener {
            val intent = Intent(this@SearchFiltersActivity, DiaryActivity::class.java)
            startActivity(intent)
        }

        backBtn.setOnClickListener {
            val intent = Intent(this@SearchFiltersActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}