package com.example.tea_catalog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TeaDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tea_description)

        var homeBtn = findViewById<ImageButton>(R.id.homeBtn);
        var likedBtn = findViewById<ImageButton>(R.id.likedBtn);
        var teatimeBtn = findViewById<ImageButton>(R.id.teatimeBtn);

        var back = findViewById<Button>(R.id.imageButton1Back);
        homeBtn.setOnClickListener {
            val intent = Intent(this@TeaDescriptionActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        likedBtn.setOnClickListener {
            val intent = Intent(this@TeaDescriptionActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

        teatimeBtn.setOnClickListener {
            val intent = Intent(this@TeaDescriptionActivity, DiaryActivity::class.java)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent = Intent(this@TeaDescriptionActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}