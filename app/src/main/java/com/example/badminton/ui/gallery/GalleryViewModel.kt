package com.example.badminton.ui.gallery

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.badminton.R
import com.example.badminton.model.DataGallery

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _judul = MutableLiveData<String>()
    val judul: LiveData<String> = _judul

    private val _genre = MutableLiveData<String>()
    val genre: LiveData<String> = _genre

    fun loadData(): List<DataGallery>{
        return listOf(
            DataGallery(R.drawable.raket1,R.string.yonex,R.string.badminton),
            DataGallery(R.drawable.raket2,R.string.adidas, R.string.badminton),
            DataGallery(R.drawable.raket3,R.string.proAce, R.string.badminton),
            DataGallery(R.drawable.raket4,R.string.wilson,R.string.badminton),
            DataGallery(R.drawable.raket5,R.string.lining, R.string.badminton),
        )
    }
    fun loadData2(): List<DataGallery>{
        return listOf(
            DataGallery(R.drawable.raket6,R.string.karakal, R.string.badminton),
            DataGallery(R.drawable.raket7,R.string.astec, R.string.badminton),
            DataGallery(R.drawable.raket8,R.string.ashaway,R.string.badminton),
            DataGallery(R.drawable.raket9,R.string.flypower, R.string.badminton),
            DataGallery(R.drawable.raket10,R.string.victor, R.string.badminton),
        )
    }


    fun setData(data: DataGallery, context: Context) {
        _judul.value = context.getString(data.judulResourceId)
        _image.value = data.imageResourceId
        _genre.value = context.getString(data.genreResourceId)
    }
}