package com.kroger.classdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SurvivorAdapter(private val survivors: List<Survivor>) : RecyclerView.Adapter<SurvivorAdapter.SurvivorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SurvivorViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.survivor_card_view, parent, false)
    )

    override fun getItemCount() = survivors.size

    override fun onBindViewHolder(holder: SurvivorViewHolder, position: Int) {
        val survivor = survivors[position]
        holder.survivorImage.setImageResource(survivor.image)
        holder.survivorName.text = survivor.name
        holder.survivorAge.text = survivor.health.toString()
        holder.survivorRegen.text = survivor.regen.toString()
    }

    class SurvivorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val survivorImage: ImageView = itemView.findViewById(R.id.survivor_image)
        val survivorName: TextView = itemView.findViewById(R.id.survivor_name)
        val survivorAge: TextView = itemView.findViewById(R.id.survivor_health)
        val survivorRegen: TextView = itemView.findViewById(R.id.survivor_regen)
    }
}
