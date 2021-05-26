package com.decagon.android.sq007.repository

import com.decagon.android.sq007.api.RetrofitInstance
import com.decagon.android.sq007.model.Post
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun getPost(): Response<Post> {

        return RetrofitInstance.api.getPost()

    }

    suspend fun getPost2(): Response<Post> {

        return RetrofitInstance.api.getPost()
    }

    suspend fun getCustomPosts(): Response<Post> {

        return RetrofitInstance.api.getCustomPosts()
    }

    suspend fun getCustomPosts2(): Response<Post> {

        return RetrofitInstance.api.getPost2()
    }
}