package com.example.recyclerview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val newsList:ArrayList<News>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val titleImage:ShapeableImageView=itemView.findViewById(R.id.title_image_id)
        val heading:TextView=itemView.findViewById(R.id.text_in_item_design_id)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.heading.text=currentItem.heading
    }
    override fun getItemCount(): Int {
        return newsList.size
    }
}