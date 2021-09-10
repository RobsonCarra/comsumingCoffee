package br.com.alura.ceep.ui.consumindocoffee

import retrofit2.Call
import retrofit2.http.GET

interface CoffeeInterface {
    @GET("2f832f7a-7788-4236-8634-a7f62aa5595c")
    fun getCoffes(): Call<List<Coffee>>
}
