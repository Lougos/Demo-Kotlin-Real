package gautier.lilian.zibossofdemo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell.view.*
import gautier.lilian.zibossofdemo.User
import gautier.lilian.zibossofdemo.Post


class MyListAdapter : RecyclerView.Adapter<MyListAdapter.ViewHolder>(){

    var posts: List<Post> = emptyList()
    var users: List<User> = emptyList()

    override fun getItemCount(): Int = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.cell, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts[position]
        val user = users[post.userId-1]
        holder.itemView.postText.text = post.title
        holder.itemView.userText.text =  users.first{it.id == post.userId} .name

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, PostActivity::class.java)

            intent.putExtra("post", post)
            intent.putExtra("user", user)
            holder.itemView.context.startActivity(intent)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}