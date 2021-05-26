package com.decagon.android.sq007.model

import com.google.gson.annotations.SerializedName

data class Post(

    val id : Int,
    val userId : Int,
    val title: String,
    val body: String,

) {
    val isSuccessful: Boolean = true
}