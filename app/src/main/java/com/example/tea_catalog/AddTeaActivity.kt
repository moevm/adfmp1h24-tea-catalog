package com.example.tea_catalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AddTeaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_tea)
        var homeBtn = findViewById<ImageButton>(R.id.homeBtn);
        var likedBtn = findViewById<ImageButton>(R.id.likedBtn);
        var teatimeBtn = findViewById<ImageButton>(R.id.teatimeBtn);

        var back = findViewById<Button>(R.id.imageButton1Back);
        homeBtn.setOnClickListener {
            val intent = Intent(this@AddTeaActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

        likedBtn.setOnClickListener {
            val intent = Intent(this@AddTeaActivity, FavoriteTeaListActivity::class.java)
            startActivity(intent)
        }

        teatimeBtn.setOnClickListener {
            val intent = Intent(this@AddTeaActivity, DiaryActivity::class.java)
            startActivity(intent)
        }
        back.setOnClickListener {
            val intent = Intent(this@AddTeaActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }

    }
}