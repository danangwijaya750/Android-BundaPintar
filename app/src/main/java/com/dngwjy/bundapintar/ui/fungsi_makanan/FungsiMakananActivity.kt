package com.dngwjy.bundapintar.ui.fungsi_makanan

import android.os.Bundle
import android.view.View
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
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
            if(!isExpanded1){
                tv_zat_pembangun.visibility= View.VISIBLE
            }else{
                tv_zat_pembangun.visibility= View.GONE
            }
            isExpanded1=!isExpanded1
        }
        btn_pengatur.setOnClickListener {
            if(!isExpanded2){
                tv_zat_pengatur.visibility= View.VISIBLE
            }else{
                tv_zat_pengatur.visibility= View.GONE
            }
            isExpanded2=!isExpanded2
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