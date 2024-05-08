package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val r = findViewById<RecyclerView>(R.id.recycler1)
        val personasList = mutableListOf<Persona>(
            Persona("RAFA","GORGORI","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("MARIBEL","CONDORI","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("JUANA","AGUIRRE","74859632",
                "https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("GUADALUPE","MEJIA","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("SILVANA","GUTIERREZ","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("MARIO","MARTINEZ","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
        )
        val personasAdapter = PersonasAdapter(applicationContext,personasList)
        r.adapter = personasAdapter
        val layout = LinearLayoutManager(applicationContext)
        layout.orientation = LinearLayoutManager.VERTICAL
        r.layoutManager = layout
    }
}
