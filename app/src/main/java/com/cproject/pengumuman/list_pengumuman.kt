package com.cproject.pengumuman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_pengumuman.*
import kotlinx.android.synthetic.main.activity_list_pengumuman.*

class list_pengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pengumuman)

        val judul = listOf<String>(

            "Matematika",
            "Sejarah",
            "Kesenian dan Prakarya",
            "Ilmu Pengetahuan Alam",
            "Olahraga"


        )

        val tanggal = listOf<String>(
            "16 Agustus 2019",
            "16 Agustus 2019",
            "17 Agustus 2019",
            "18 Agustus 2019",
            "19 Agustus 2019"
        )

        val img = intArrayOf(
            R.drawable.matematika,
            R.drawable.sejarah,
            R.drawable.prakarya,
            R.drawable.ipa,
            R.drawable.olahraga
        )

        val adapterpengumuman = Adapter_Pengumuman(judul,tanggal,img){
            // detail pada saat klik di bawa ke detail pengumuman
            val data = Intent(this, detail_pengumuman::class.java)
            data.putExtra("detailjudul", judul.get(it))
            data.putExtra("detailtanggal", tanggal.get(it))
            data.putExtra("detailgambar", img.get(it))
            startActivity(data)
        }
        rvjudul.layoutManager = LinearLayoutManager(this)
        rvjudul.adapter = adapterpengumuman

    }
}