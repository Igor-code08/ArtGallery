package com.example.artgallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class PictureFragment : Fragment() {

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_AUTHOR = "author"
        private const val ARG_IMAGE_RES_ID = "imageResId"

        fun newInstance(title: String, author: String, imageResId: Int): PictureFragment {
            val fragment = PictureFragment()
            val args = Bundle()
            args.putString(ARG_TITLE, title)
            args.putString(ARG_AUTHOR, author)
            args.putInt(ARG_IMAGE_RES_ID, imageResId)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_picture, container, false)

        val titleTextView: TextView = view.findViewById(R.id.titleTextView)
        val authorTextView: TextView = view.findViewById(R.id.authorTextView)
        val imageView: ImageView = view.findViewById(R.id.imageView)

        // Получение данных из аргументов
        val title = arguments?.getString(ARG_TITLE)
        val author = arguments?.getString(ARG_AUTHOR)
        val imageResId = arguments?.getInt(ARG_IMAGE_RES_ID)

        titleTextView.text = title
        authorTextView.text = author
        imageView.setImageResource(imageResId ?: 0)

        return view
    }
}