package v.abhijeet.retrofitapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*
import v.abhijeet.retrofitapi.data.MyDataItem

class MyAdapter(val context: Context,val userList : List<MyDataItem>):RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var id : TextView
        var title : TextView

        init {
            id = itemView.userid
            title = itemView.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var itemView = LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text = userList[position].id.toString()
        holder.title.text = userList[position].title
    }

    override fun getItemCount(): Int {
       return userList.size
    }
}