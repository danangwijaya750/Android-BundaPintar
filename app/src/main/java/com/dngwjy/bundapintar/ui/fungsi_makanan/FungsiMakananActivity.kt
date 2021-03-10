package com.dngwjy.bundapintar.ui.fungsi_makanan

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.dngwjy.bundapintar.ui.menu_gizi_seimbang.DetailMenuActivity
import kotlinx.android.synthetic.main.activity_fungsi_makanan.*
import kotlinx.android.synthetic.main.activity_fungsi_makanan.iv_back

class FungsiMakananActivity : BaseActivity() {
    private var isExpanded1=false
    private var isExpanded2=false
    private var isExpanded3=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fungsi_makanan)
        btn_pembangun.setOnClickListener {
            val intent= Intent(this, DetailMenuActivity::class.java)
            intent.putExtra("strategi","strategi")
            startActivity(intent)
        }
        btn_pengatur.setOnClickListener {
            val intent=Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("pedoman","pedoman")
            startActivity(intent)
        }
        btn_tenaga.setOnClickListener {
            if(!isExpanded3){
                tv_zat_tenaga.visibility= View.VISIBLE
            }else{
                tv_zat_tenaga.visibility= View.GONE
            }
            isExpanded3=!isExpanded3
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