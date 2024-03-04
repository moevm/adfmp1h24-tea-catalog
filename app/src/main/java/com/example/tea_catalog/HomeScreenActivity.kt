package com.example.tea_catalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        var likedBtn = findViewById<ImageButton>(R.id.likedBtn);
        var teatimeBtn = findViewById<ImageButton>(R.id.teatimeBtn);
        var addHomeTeaBtn = findViewById<ImageView>(R.id.addTeaHomeBtn);
        var filtersHomeBtn = findViewById<ImageView>(R.id.filtersHomeBtn);

        likedBtn.setOnClickListener {
            val intent = Intent(this@HomeScreenActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

        teatimeBtn.setOnClickListener {
            val intent = Intent(this@HomeScreenActivity, DiaryActivity::class.java)
            startActivity(intent)
        }

        addHomeTeaBtn.setOnClickListener {
            val intent = Intent(this@HomeScreenActivity, AddTeaActivity::class.java)
            startActivity(intent)
        }

        filtersHomeBtn.setOnClickListener {
            val intent = Intent(this@HomeScreenActivity, SearchFiltersActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}