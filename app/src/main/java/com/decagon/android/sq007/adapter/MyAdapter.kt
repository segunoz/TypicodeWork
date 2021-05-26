package com.decagon.android.sq007.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.decagon.android.sq007.R
import com.decagon.android.sq007.model.Post

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private var myList = emptyList<Post>()

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var bindId = itemView.findViewById<TextView>(R.id.id_txt)
        var bindUserId = itemView.findViewById<TextView>(R.id.userId_txt)
        var bindTitle = itemView.findViewById<TextView>(R.id.title_txt)
        var bindBody = itemView.findViewById<TextView>(R.id.body_txt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))

    }

    override fun getItemCount(): Int {
        return  myList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bindId.text = myList[position].id.toString()
        holder.bindUserId.text = myList[position].userId.toString()
        holder.bindTitle.text = myList[position].title.toString()
        holder.bindBody .text = myList[position].body.toString()
    }

    fun setData(newList : List<Post>) {
        myList = newList
        notifyDataSetChanged()
    }


}