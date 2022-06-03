package com.example.badminton.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DataGallery (
    @DrawableRes val imageResourceId: Int,
    @StringRes val judulResourceId: Int,
    @StringRes val genreResourceId: Int
)