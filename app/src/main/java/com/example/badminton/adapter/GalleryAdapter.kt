package com.example.badminton.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.badminton.R
import com.example.badminton.model.DataGallery
import com.example.badminton.ui.gallery.GalleryActivity
import com.example.badminton.ui.gallery.GalleryViewModel

class GalleryAdapter(
    private val context: Context,
    private val dataset: List<DataGallery>
): RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    private val viewModel = GalleryViewModel()


    class GalleryViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.gambar_gallery)
        val judulText: TextView = view.findViewById(R.id.judul_gambar_gallery)
        val genreText: TextView = view.findViewById(R.id.genre_gambar_gallery)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.gallery_item, parent,false)
        return GalleryViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = dataset[position]
        holder.judulText.text = context.resources.getString(item.judulResourceId)
        holder.genreText.text = context.resources.getString(item.genreResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

        holder.view.setOnClickListener{
            viewModel.setData(item, context)
            val intent = Intent(context, GalleryActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("judul", viewModel.judul.value)
                putExtra("genre", viewModel.genre.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size


}