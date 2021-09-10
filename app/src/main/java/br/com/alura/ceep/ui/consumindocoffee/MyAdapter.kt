package br.com.alura.ceep.ui.consumindocoffee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val coffeList: List<Coffee>) :
    RecyclerView.Adapter<CoffeViewHolder>() {
    var list = ArrayList<Coffee>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.coffes, parent, false)
        return CoffeViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: CoffeViewHolder, position: Int) {
        holder.bind(list.get(position))

    }

    override fun getItemCount(): Int {
        return coffeList.size
    }

}