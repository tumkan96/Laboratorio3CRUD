package com.example.laboratorio3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
class PersonasAdapter (ctx: Context, private val personasModel: List<Persona> ):RecyclerView.Adapter<PersonasAdapter.PersonasViewHolder>(){
    inner class PersonasViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var imageUrl = itemView.findViewById<ImageView>(R.id.imageLogo)
        var titulo = itemView.findViewById<TextView>(R.id.txtTitulo)
        var descripcion = itemView.findViewById<TextView>(R.id.txtDescripcion)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonasViewHolder {
        val v = LayoutInflater.from (parent.context).inflate(R.layout.item_persona,parent,false)
        return PersonasViewHolder(v)
    }
    override fun getItemCount(): Int {
        return personasModel.size
    }
    override fun onBindViewHolder(holder: PersonasViewHolder, position: Int) {
        val i = personasModel[position]
        holder.titulo.text = i.nombre
        holder.descripcion.text = i.apellido
        Glide.with(holder.itemView.context)
            .load(i.imagen
                ,)
            .centerCrop()
//.placeholder(R.drawable.loading_spinner)
            .into(holder.imageUrl)
    }
}