package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* setContentView(R.layout.activity_main)
        /val rcView = findViewById(R.id.rcv1) as RecyclerView

        /* val ms = ArrayList<Movies>()

        ms.add(Movies(1,"english","","3",60,2,"KGF","Violence"))
        ms.add(Movies(2,"english","","4",70,12,"SVSC","Violence"))
        ms.add(Movies(3,"english","","3",90,23,"GT","Violence"))
        ms.add(Movies(4,"english","","3",80,20,"DJ","Violence"))
        rcView.adapter = MoviesAdapter(ms)*/
        /*us.add(Users("sai1","kdp,AP"))
        us.add(Users("pavani Sontam","nlr,AP"))
        us.add(Users("potti sindhu","kdp,AP"))
        us.add(Users("Auto Pra","kdp,AP"))
        us.add(Users("niharika","nlr,AP"))
        val adp = RvAdapter(us)
        rcView.adapter = adp*/
    }
    private fun showMovies(movies: List<Movies>){
        rcView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        rcView.adapter = MoviesAdapter()
    }*/
    }
}