package br.com.alura.ceep.ui.consumindocoffee

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
class Coffee(
    var id: Int,
    var name: String,
    var capsules: Int,
    var description: String,
    var intensity: Int,
    var quantity: Int,
    var image: Int
)