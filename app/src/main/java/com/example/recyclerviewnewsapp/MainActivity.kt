package com.example.recyclerviewnewsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewnewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newImgArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
        )

        val newTitleArray = arrayOf(
            "Albert Einstein: The genius who redefined physics",
            "Nelson Mandela: A symbol of peace and justice",
            "Mother Teresa: The saint of the poor",
            "Muhammad Ali: The champion beyond the ring",
            "Leonardo da Vinci: The man ahead of his time",
            "Prophet Muhammad (PBUH): A mercy to mankind"
        )

        val newDescArray = arrayOf(
            "Known for the theory of relativity, Einstein’s revolutionary ideas reshaped modern science and earned him global recognition.",
            "The South African leader who fought against apartheid and became an icon of freedom, forgiveness, and human dignity.",
            "Renowned for her selfless service, Mother Teresa dedicated her life to helping the sick and needy across the world.",
            "More than just a boxer, Ali stood for courage, justice, and equality, inspiring millions with his words and actions.",
            "A true Renaissance genius, da Vinci excelled in art, science, and invention, leaving behind timeless masterpieces.",
            "The greatest reformer in history, whose teachings on justice, compassion, and humanity transformed the world forever."
        )

        // ✅ RecyclerView setup directly from binding
        binding.recview.layoutManager = LinearLayoutManager(this)
        binding.recview.setHasFixedSize(true)

        newsArrayList = ArrayList()
        for (i in newImgArray.indices) {
            val news = News(newTitleArray[i], newDescArray[i], newImgArray[i])
            newsArrayList.add(news)
        }

        binding.recview.adapter = NewsAdapter(newsArrayList)
    }
}
