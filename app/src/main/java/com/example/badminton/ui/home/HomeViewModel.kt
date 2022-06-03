package com.example.badminton.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selamat datang di aplikasi olahraga\n" +
                "Silahkan klik menu yang ada di pojok kiri atas"
    }
    val text: LiveData<String> = _text
}