package com.kroger.classdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val survivors = mutableListOf<Survivor>()

        for (i in 0..30) {
            survivors.add(createSurvivor())
        }

        val adapter = SurvivorAdapter(survivors)
        recyclerView.adapter = adapter
    }

    private fun createSurvivor() = Survivor(
        name = "Commando",
        health = Random.nextInt(10, 99),
        image = R.drawable.baseline_10k_24,
        damage = Random.nextInt(10, 99),
        regen = Random.nextInt(10, 99),
        recItems = listOf()
    )
}
