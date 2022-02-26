package com.example.materialdesigntask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("SpongeBob", "patrick", "Sandy", "Squidward", "Mister Crab")

    private var details = arrayOf("Animal: Sponge", "Animal: Star fish", "Animal: Squirrel", "Animal: Octopus", "Animal: Crab")

    private var jobDetails = arrayOf("Job: chef", "Job: Professional unemployed", "Job: Scientist", "Job: Cashier", "Job: Manager")

    private var images = intArrayOf(R.drawable.spongebob, R.drawable.patrick_star, R.drawable.sandy_cheeks, R.drawable.squidward, R.drawable.mister_crab)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemJobDetail.text = jobDetails[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemJobDetail: TextView



        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemJobDetail = itemView.findViewById(R.id.item_job_detail)
        }
    }
}