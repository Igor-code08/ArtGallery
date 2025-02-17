package com.example.artgallery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PicturePagerAdapter(
    fragmentActivity: FragmentActivity,
    private val pictures: List<Picture>
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = pictures.size

    override fun createFragment(position: Int): Fragment {
        val picture = pictures[position]
        return PictureFragment.newInstance(picture.title, picture.author, picture.imageResId)
    }
}