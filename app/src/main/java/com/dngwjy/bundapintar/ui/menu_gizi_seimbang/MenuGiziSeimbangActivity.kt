package com.dngwjy.bundapintar.ui.menu_gizi_seimbang

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.dngwjy.bundapintar.ui.kebutuhan_gizi.DetailKebutuhanGiziActivity
import kotlinx.android.synthetic.main.activity_menu_gizi_seimbang.*

class MenuGiziSeimbangActivity : BaseActivity() {
    private var isExpand1=false
    private var isExpand2=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_gizi_seimbang)
        btn_pemberian.setOnClickListener {
            val intent=Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("lumat","lumat")
            startActivity(intent)
        }
        btn_contoh.setOnClickListener {
            val intent=Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("lembik","lembik")
            startActivity(intent)
        }
        btn_contoh2.setOnClickListener {
            val intent=Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("keluarga","keluarga")
            startActivity(intent)
        }
        iv_back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}