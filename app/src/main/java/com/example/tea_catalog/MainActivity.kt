package com.example.tea_catalog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)
        var likedBtn = findViewById<ImageButton>(R.id.likedBtn);
        var teatimeBtn = findViewById<ImageButton>(R.id.teatimeBtn);
        var addHomeTeaBtn = findViewById<ImageView>(R.id.addTeaHomeBtn);
        var filtersHomeBtn = findViewById<ImageView>(R.id.filtersHomeBtn);
        var aboutUsBtn = findViewById<ImageView>(R.id.aboutUsBtn);

        likedBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

        teatimeBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, DiaryActivity::class.java)
            startActivity(intent)
        }

        addHomeTeaBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, AddTeaActivity::class.java)
            startActivity(intent)
        }

        filtersHomeBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, SearchFiltersActivity::class.java)
            startActivity(intent)
        }

        aboutUsBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutUsActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}