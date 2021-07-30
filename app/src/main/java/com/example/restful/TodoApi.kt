package com.example.restful

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {


    @GET(value = "/todos")
     suspend fun getTodos(): Response<List<Todo>>

}