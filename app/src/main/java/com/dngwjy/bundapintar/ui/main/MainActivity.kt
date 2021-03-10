package com.dngwjy.bundapintar.ui.main

import android.content.Intent
import android.os.Bundle
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.dngwjy.bundapintar.ui.bunda_harus_tahu.BundaHarusTahuActivity
import com.dngwjy.bundapintar.ui.edukasi.EdukasiGiziSeimbangActivity
import com.dngwjy.bundapintar.ui.fungsi_makanan.FungsiMakananActivity
import com.dngwjy.bundapintar.ui.kebutuhan_gizi.KebutuhanGiziBalita
import com.dngwjy.bundapintar.ui.menu_gizi_seimbang.DetailMenuActivity
import com.dngwjy.bundapintar.ui.menu_gizi_seimbang.MenuGiziSeimbangActivity
import com.dngwjy.bundapintar.ui.status_gizi.CekStatusGiziActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1.setOnClickListener {
            startActivity(Intent(this,EdukasiGiziSeimbangActivity::class.java))
        }
        bt2.setOnClickListener {
            val intent=Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("kebutuhan","kebutuhan")
            startActivity(intent)
        }
        bt3.setOnClickListener {
            startActivity(Intent(this,FungsiMakananActivity::class.java))
        }
        bt4.setOnClickListener {
            val intent=Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("fungsi","fungsi")
            startActivity(intent)
        }
        bt5.setOnClickListener {
            startActivity(Intent(this,MenuGiziSeimbangActivity::class.java))
        }
        bt6.setOnClickListener {
            startActivity(Intent(this,CekStatusGiziActivity::class.java))
        }
    }
}