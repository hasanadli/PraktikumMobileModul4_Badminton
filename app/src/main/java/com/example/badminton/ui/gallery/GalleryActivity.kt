package com.example.badminton.ui.gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.badminton.databinding.ActivityGalleryBinding

class GalleryActivity : AppCompatActivity() {
    private var _binding: ActivityGalleryBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val activityImage = "image"
        const val activityJudul = "judul"
        const val activityGenre = "genre"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityGalleryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.gambarActivityGallery
        image.setImageResource(intent.getIntExtra(activityImage, 0))

        val name = binding.judulActivityGallery
        name.text = intent.getStringExtra(activityJudul)

        val date = binding.genreActivityGallery
        date.text = intent.getStringExtra(activityGenre)
    }
}