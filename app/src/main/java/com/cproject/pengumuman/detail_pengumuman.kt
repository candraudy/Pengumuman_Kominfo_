package com.cproject.pengumuman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_pengumuman.*

class detail_pengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengumuman)

        val datajudul = intent.getStringExtra("detailjudul")
        val tanggal = intent.getStringExtra("detailtanggal")
        val datagambar = intent.getIntExtra("detailgambar", 0)


        detail_judul.text = datajudul.toString()
        tgl.text = tanggal.toString()
        gambar.setImageResource(datagambar)

    }
}