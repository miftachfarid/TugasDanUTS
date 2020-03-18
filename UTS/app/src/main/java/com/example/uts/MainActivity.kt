package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lihat()
        tambah()
        pengumuman()
    }

    fun lihat(){
        lihat.setOnClickListener(){
            val lihat = Intent(context,LihatActivity::class.java)
            startActivity(lihat)
            finish()
        }
    }
    fun tambah(){
        lihat.setOnClickListener(){
            val tambah = Intent(context,TambahActivity::class.java)
            startActivity(tambah)
            finish()
        }
    }
    fun pengumuman(){
        pengumuman.setOnClickListener(){
            val pengumuman = Intent(context,PengumumanActivity::class.java)
            startActivity(pengumuman)
            finish()
        }
    }
}
