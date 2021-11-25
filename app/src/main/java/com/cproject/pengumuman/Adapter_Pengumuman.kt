package com.cproject.pengumuman

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_pengumuman.view.*


class Adapter_Pengumuman (private val listjudul :List<String>, private val tgl :List<String>,
                          private val img :IntArray, private  var onclick : (Int)->Unit)
    :RecyclerView.Adapter<Adapter_Pengumuman.ViewHolder> () {
    class ViewHolder (view: View) :RecyclerView.ViewHolder(view){
        val judul = view.item_judul
        val tanggal = view.tgl
        val image = view.img

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Pengumuman.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_pengumuman,parent, false)
        )
    }

    override fun onBindViewHolder(holder: Adapter_Pengumuman.ViewHolder, position: Int) {
        holder.judul.text = listjudul[position]
        holder.tanggal.text =tgl[position]
        holder.image.setImageResource(img[position])

        //set holder klik detail menu
        holder.itemView.setOnClickListener{
            onclick(position)
        }
    }

    override fun getItemCount(): Int {
        return listjudul.size
    }
}