package br.com.alura.ceep.ui.consumindocoffee

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoffeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image: ImageView
    var description: TextView
    var name: TextView
    var quantity: TextView
    var intensity: TextView
    var capsules: TextView

    init {
        image = itemView.findViewById(R.id.image_coffe)
        description = itemView.findViewById(R.id.description)
        name = itemView.findViewById(R.id.name)
        quantity = itemView.findViewById(R.id.quantity)
        intensity = itemView.findViewById(R.id.intensity)
        capsules = itemView.findViewById(R.id.capsules)
    }

    fun bind(coffee: Coffee) {
        image.setImageResource(coffee.image)
        description.text = coffee.description
        name.text = coffee.name
        quantity.text = coffee.quantity.toString()
        intensity.text = coffee.intensity.toString()
        capsules.text = coffee.capsules.toString()
    }
}