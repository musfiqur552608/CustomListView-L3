package org.freedu.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsActivity : AppCompatActivity() {
    lateinit var profileName:TextView
    lateinit var profileDesc:TextView
    lateinit var profileImg:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        profileName = findViewById(R.id.profileName)
        profileDesc = findViewById(R.id.profileDesc)
        profileImg = findViewById(R.id.profileImg)

        var name = intent.getStringExtra("name")
        var desc = intent.getStringExtra("desc")
        var img = intent.getIntExtra("image",R.drawable.musfiq)

        profileName.text = name
        profileDesc.text = desc
        profileImg.setImageResource(img)

    }
}