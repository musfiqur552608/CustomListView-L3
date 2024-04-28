package org.freedu.customlistview

import android.content.Intent
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
    val longDesc = arrayOf(
        "Mushfiqur Rahim is a prominent Bangladeshi cricketer who has left a significant mark on the country's cricketing landscape. Born on June 9, 1987, in Bogura, Bangladesh, Rahim is primarily known for his role as a wicketkeeper-batsman. He made his debut for the Bangladesh national cricket team in 2005, at the young age of 16, becoming the youngest wicketkeeper in Test cricket history. Rahim quickly established himself as a key player in the Bangladeshi side, known for his solid batting technique and reliable wicketkeeping skills. Throughout his career, Rahim has been one of Bangladesh's most consistent performers, contributing crucial runs in the middle order and often bailing the team out of difficult situations. He has played a vital role in numerous memorable victories for Bangladesh, both in Test cricket and the shorter formats of the game. Rahim's accomplishments include becoming the first Bangladeshi cricketer to score a double century in Test cricket. He achieved this milestone in February 2018 against Sri Lanka. Additionally, he has registered numerous centuries and half-centuries across all formats of the game. As a wicketkeeper, Rahim has been known for his agility behind the stumps and his ability to marshal the fielding unit effectively. He has also captained the Bangladesh team on various occasions, showcasing his leadership qualities and tactical acumen. Off the field, Rahim is known for his humble demeanor and dedication to the sport. He has been a role model for aspiring cricketers in Bangladesh and has played a significant role in raising the profile of Bangladeshi cricket on the global stage. Overall, Mushfiqur Rahim is a highly respected figure in Bangladeshi cricket, admired for his skill, resilience, and commitment to the game.",
        "Sakib Al Hasan is a prominent Bangladeshi cricketer who has left a significant mark on the country's cricketing landscape. Born on June 9, 1987, in Bogura, Bangladesh, Rahim is primarily known for his role as a wicketkeeper-batsman. He made his debut for the Bangladesh national cricket team in 2005, at the young age of 16, becoming the youngest wicketkeeper in Test cricket history. Rahim quickly established himself as a key player in the Bangladeshi side, known for his solid batting technique and reliable wicketkeeping skills. Throughout his career, Rahim has been one of Bangladesh's most consistent performers, contributing crucial runs in the middle order and often bailing the team out of difficult situations. He has played a vital role in numerous memorable victories for Bangladesh, both in Test cricket and the shorter formats of the game. Rahim's accomplishments include becoming the first Bangladeshi cricketer to score a double century in Test cricket. He achieved this milestone in February 2018 against Sri Lanka. Additionally, he has registered numerous centuries and half-centuries across all formats of the game. As a wicketkeeper, Rahim has been known for his agility behind the stumps and his ability to marshal the fielding unit effectively. He has also captained the Bangladesh team on various occasions, showcasing his leadership qualities and tactical acumen. Off the field, Rahim is known for his humble demeanor and dedication to the sport. He has been a role model for aspiring cricketers in Bangladesh and has played a significant role in raising the profile of Bangladeshi cricket on the global stage. Overall, Mushfiqur Rahim is a highly respected figure in Bangladeshi cricket, admired for his skill, resilience, and commitment to the game.",
        "Tamim Iqbal is a prominent Bangladeshi cricketer who has left a significant mark on the country's cricketing landscape. Born on June 9, 1987, in Bogura, Bangladesh, Rahim is primarily known for his role as a wicketkeeper-batsman. He made his debut for the Bangladesh national cricket team in 2005, at the young age of 16, becoming the youngest wicketkeeper in Test cricket history. Rahim quickly established himself as a key player in the Bangladeshi side, known for his solid batting technique and reliable wicketkeeping skills. Throughout his career, Rahim has been one of Bangladesh's most consistent performers, contributing crucial runs in the middle order and often bailing the team out of difficult situations. He has played a vital role in numerous memorable victories for Bangladesh, both in Test cricket and the shorter formats of the game. Rahim's accomplishments include becoming the first Bangladeshi cricketer to score a double century in Test cricket. He achieved this milestone in February 2018 against Sri Lanka. Additionally, he has registered numerous centuries and half-centuries across all formats of the game. As a wicketkeeper, Rahim has been known for his agility behind the stumps and his ability to marshal the fielding unit effectively. He has also captained the Bangladesh team on various occasions, showcasing his leadership qualities and tactical acumen. Off the field, Rahim is known for his humble demeanor and dedication to the sport. He has been a role model for aspiring cricketers in Bangladesh and has played a significant role in raising the profile of Bangladeshi cricket on the global stage. Overall, Mushfiqur Rahim is a highly respected figure in Bangladeshi cricket, admired for his skill, resilience, and commitment to the game.",
        "Mahmudullah Riyad is a prominent Bangladeshi cricketer who has left a significant mark on the country's cricketing landscape. Born on June 9, 1987, in Bogura, Bangladesh, Rahim is primarily known for his role as a wicketkeeper-batsman. He made his debut for the Bangladesh national cricket team in 2005, at the young age of 16, becoming the youngest wicketkeeper in Test cricket history. Rahim quickly established himself as a key player in the Bangladeshi side, known for his solid batting technique and reliable wicketkeeping skills. Throughout his career, Rahim has been one of Bangladesh's most consistent performers, contributing crucial runs in the middle order and often bailing the team out of difficult situations. He has played a vital role in numerous memorable victories for Bangladesh, both in Test cricket and the shorter formats of the game. Rahim's accomplishments include becoming the first Bangladeshi cricketer to score a double century in Test cricket. He achieved this milestone in February 2018 against Sri Lanka. Additionally, he has registered numerous centuries and half-centuries across all formats of the game. As a wicketkeeper, Rahim has been known for his agility behind the stumps and his ability to marshal the fielding unit effectively. He has also captained the Bangladesh team on various occasions, showcasing his leadership qualities and tactical acumen. Off the field, Rahim is known for his humble demeanor and dedication to the sport. He has been a role model for aspiring cricketers in Bangladesh and has played a significant role in raising the profile of Bangladeshi cricket on the global stage. Overall, Mushfiqur Rahim is a highly respected figure in Bangladeshi cricket, admired for his skill, resilience, and commitment to the game.",
        "Mashrafe Bin Mortaza is a prominent Bangladeshi cricketer who has left a significant mark on the country's cricketing landscape. Born on June 9, 1987, in Bogura, Bangladesh, Rahim is primarily known for his role as a wicketkeeper-batsman. He made his debut for the Bangladesh national cricket team in 2005, at the young age of 16, becoming the youngest wicketkeeper in Test cricket history. Rahim quickly established himself as a key player in the Bangladeshi side, known for his solid batting technique and reliable wicketkeeping skills. Throughout his career, Rahim has been one of Bangladesh's most consistent performers, contributing crucial runs in the middle order and often bailing the team out of difficult situations. He has played a vital role in numerous memorable victories for Bangladesh, both in Test cricket and the shorter formats of the game. Rahim's accomplishments include becoming the first Bangladeshi cricketer to score a double century in Test cricket. He achieved this milestone in February 2018 against Sri Lanka. Additionally, he has registered numerous centuries and half-centuries across all formats of the game. As a wicketkeeper, Rahim has been known for his agility behind the stumps and his ability to marshal the fielding unit effectively. He has also captained the Bangladesh team on various occasions, showcasing his leadership qualities and tactical acumen. Off the field, Rahim is known for his humble demeanor and dedication to the sport. He has been a role model for aspiring cricketers in Bangladesh and has played a significant role in raising the profile of Bangladeshi cricket on the global stage. Overall, Mushfiqur Rahim is a highly respected figure in Bangladeshi cricket, admired for his skill, resilience, and commitment to the game.",

    )
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        val myListAdapter = MyListAdapter(this, profileName, profileDes, images)

        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this,
                "Clicked At ${parent.getItemAtPosition(position)}",
                android.widget.Toast.LENGTH_SHORT
            ).show()
            var intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("name",profileName[position])
            intent.putExtra("image",images[position])
            intent.putExtra("desc",longDesc[position])
            startActivity(intent)
        }
    }
}