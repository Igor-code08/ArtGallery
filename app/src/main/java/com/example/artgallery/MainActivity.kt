package com.example.artgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        // Список картин
        val pictures = listOf(
            Picture("Мона Лиза", "Леонардо да Винчи", R.drawable.painting1),
            Picture("Звёздная ночь", "Винсент ван Гог", R.drawable.painting2),
            Picture("Крик", "Эдвард Мунк", R.drawable.painting3),
            Picture("Девушка с жемчужной серёжкой", "Ян Вермеер", R.drawable.painting4),
            Picture("Тайная вечеря", "Леонардо да Винчи", R.drawable.painting5),
            Picture("Рождение Венеры", "Сандро Боттичелли", R.drawable.painting6),
            Picture("Сотворение Адама", "Микеланджело", R.drawable.painting7),
            Picture("Ночной дозор", "Рембрандт", R.drawable.painting8),
            Picture("Герника", "Пабло Пикассо", R.drawable.painting9),
            Picture("Сад земных наслаждений", "Иероним Босх", R.drawable.painting10)
        )

        // Установка адаптера
        viewPager.adapter = PicturePagerAdapter(this, pictures)
    }
}