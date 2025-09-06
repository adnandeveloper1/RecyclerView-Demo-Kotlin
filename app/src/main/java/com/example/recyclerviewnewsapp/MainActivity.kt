package com.example.recyclerviewnewsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewnewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var recyclerView: RecyclerView
    lateinit var newsarrylist: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var newImgArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
        )
var newheadingArray=arrayOf(
        "Pakistan: The five who shamed the brass\"\n" +
                "A provocative piece exploring acts of courage within Pakistan’s military and political establishments",

    "Egg hurled at Imran Khan’s sister outside jail in Pakistan for ‘not answering questions’\"\n" +
            "Aleema Khan, sister of former PM Imran Khan, was pelted with an egg while speaking to media outside Adiala Jail, raising questions about political tensions.",
    "China, Pakistan pledge stronger tech and trade cooperation amid US charm offensive\"\n" +
            "During PM Shehbaz Sharif’s visit to Beijing, both countries committed to enhanced collaboration in agriculture, space, and trade sectors",
    "Pakistan prime minister signs $8.5 billion in investment deals with China\"\n" +
            "As part of the same diplomatic visit, Prime Minister Shehbaz Sharif inked $8.5 billion worth of investment agreements with China.",
    "Labeling terrorists as disgruntled Balochs not appropriate: Bugti\"\n" +
            "Sarfraz Bugti spoke out against calling Baloch individuals “disgruntled terrorists",

    "Pakistan tones down Defence and Martyrs’ Day observation due to floods\"\n" +
            "In light of devastating floods, the government has decided to scale back national ceremonies for Defence and Martyrs’ Day as a mark of sensitivity to ongoing humanitarian crises."

)
    }
}