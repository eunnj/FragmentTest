package com.example.hw2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RecyclerViewAdapter(val context:Context, val dataList:ArrayList<People>):RecyclerView.Adapter<RecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view:View=LayoutInflater.from(context).inflate(R.layout.rv_item,parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.name.text=dataList[position].name
        holder.birth.text=dataList[position].birth
        holder.phone.text=dataList[position].phone

        holder.item_btn.setOnClickListener{
            val intent = Intent(context, PeopleActivity::class.java)
            intent.putExtra("dname",dataList[position].name)
            intent.putExtra("dbirth",dataList[position].birth)
            intent.putExtra("dphone",dataList[position].phone)
            context.startActivity(intent)
        }
    }

    inner class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name: TextView =itemView.findViewById(R.id.rv_item_name) as TextView
        val birth: TextView =itemView.findViewById(R.id.rv_item_birth) as TextView
        val phone: TextView =itemView.findViewById(R.id.rv_item_phone) as TextView

        val item_btn : LinearLayout = itemView.findViewById(R.id.btn_rv_item) as LinearLayout
    }
}