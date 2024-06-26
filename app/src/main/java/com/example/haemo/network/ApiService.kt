package com.example.haemo.network

import com.example.haemo.model.LoginModel
import com.example.haemo.model.PostModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("post")
    suspend fun getPost(): Response<List<PostModel>>

    @GET("post/{id}")
    suspend fun getOnePost(@Path("id") idx: Int): Response<PostModel>

    @POST("/user")
    suspend fun tryLogin(@Body loginModel: LoginModel) : Response<Boolean>
}