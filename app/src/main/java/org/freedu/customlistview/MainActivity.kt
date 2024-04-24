package org.freedu.customlistview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val profileName = arrayOf<String>(
        "Musfiqur Rahim",
        "Sakib AL Hasan",
        "Tamim Iqbal",
        "Mahmudullah Riyad",
        "Masrafe Bin Mortaza"
    )
    val profileDes = arrayOf<String>(
        "Right hand wicketkeeper and batsman",
        "No 1 al rounder",
        "Left hand opener batsman",
        "Al rounder finisher",
        "Fast medium bowler and captain"
    )

    val images = arrayOf<Int>(
        R.drawable.musfiq,
        R.drawable.sakib,
        R.drawable.tamim,
        R.drawable.mahmudullah,
        R.drawable.mashrafe
    )
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        val myListAdapter = MyListAdapter(this,profileName, profileDes, images)

        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked At ${parent.getItemAtPosition(position)}", android.widget.Toast.LENGTH_SHORT).show()
        }
    }
}