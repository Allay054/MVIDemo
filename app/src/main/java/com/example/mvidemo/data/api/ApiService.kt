package com.example.mvidemo.data.api

import com.example.mvidemo.data.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.POST

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

//   @POST("api/iptv/login")
//   suspend fun loginUser(
//      @HeaderMap headers: Map<String, String>,
//      @Body loginModel: LoginModel
//   ): Response<LoginResponseModel>
}