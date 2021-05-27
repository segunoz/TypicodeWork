package com.decagon.android.sq007.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.decagon.android.sq007.R
import com.decagon.android.sq007.model.PostsModel
import com.decagon.android.sq007.model.PostsModelItem

class PostsAdapter(var onPostClickListener: onPostClickListener) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

    var recyclerViewList : PostsModel = PostsModel()
    fun getApiPosts(postsList: PostsModel){
        this.recyclerViewList = postsList
    }
    /**
     * function to get comments being observed in the activity and setting it to the recyclerview adapter list
     */
    fun getNewPost(newPost: PostsModelItem){
        this.recyclerViewList.add(0,newPost)
    }
    /**
     * this initializes and holds the views
     */
    inner class PostsViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    {
        var posts = view.findViewById<TextView>(R.id.posts_textview)
        //val commentsBtn = view.findViewById<Button>(R.id.comments_btn)
        val title = view.findViewById<TextView>(R.id.title_posts_layout_textview)
        fun bind(post: PostsModel) {
            posts.text = post[position].body
            title.text = post[position].title
        }
    }
    /**
     * this inflate the recyclerview layout into the recyclerver
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent, false)
        return PostsViewHolder(inflater)
    }
    /**
     * this returns the size of the recyclerview list
     */
    override fun getItemCount(): Int {
        return recyclerViewList.size
    }
    /**
     * this binds the view to corresponding elements in the recyclerview list
     */
    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.bind(recyclerViewList)
        holder.view.setOnClickListener {
            onPostClickListener.onPostClickListener(position)
        }
    }
}