package com.example.restful

import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {


   val  api: TodoApi by lazy {
         Builder()
             .baseUrl("https://jsonplaceholder.typicode.com")
             .addConverterFactory(GsonConverterFactory.create())
             .build()
             .create(TodoApi::class.java)
   }

}
