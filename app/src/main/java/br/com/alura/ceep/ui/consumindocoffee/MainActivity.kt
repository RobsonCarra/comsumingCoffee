package br.com.alura.ceep.ui.consumindocoffee

import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var MyAdapter: MyAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
        init()
        myData()
    }

    fun setup() {
        recyclerView = findViewById(R.id.recycler_view)
    }

    fun init() {
        recyclerView.hasFixedSize()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter
    }

    fun myData() {
        val retrofitClient = RetrofitConfig().getCoffe()
        val endpoint = retrofitClient.create(CoffeeInterface::class.java)
        val callback = endpoint.getCoffes()

        callback.enqueue(object : Callback<List<Coffee>> {

            override fun onResponse(
                call: Call<List<Coffee>>,
                response: Response<List<Coffee>>
            ) {
                val responseBody = response.body()!!
                MyAdapter = MyAdapter(baseContext, responseBody)
                MyAdapter.notifyDataSetChanged()
                recyclerView.adapter = MyAdapter
            }

            override fun onFailure(call: Call<List<Coffee>>, t: Throwable) {
                d("MainActivity", "onFailure: " + t.message)
            }
        })
    }
}
