package com.dngwjy.bundapintar.ui.bunda_harus_tahu

import android.os.Bundle
import android.view.View
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import kotlinx.android.synthetic.main.activity_bunda_harus_tahu.*

class BundaHarusTahuActivity : BaseActivity() {
    private var isExpanded1=false
    private var isExpanded2=false
    private var isExpanded3=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bunda_harus_tahu)
        btn_periode_emas.setOnClickListener {
            if(!isExpanded1){
                tv_periode_emas.visibility= View.VISIBLE
            }else{
                tv_periode_emas.visibility=View.GONE
            }
            isExpanded1=!isExpanded1
        }
        btn_syarat.setOnClickListener {
            if(!isExpanded2){
                tv_syarat.visibility= View.VISIBLE
            }else{
                tv_syarat.visibility=View.GONE
            }
            isExpanded2=!isExpanded2
        }
        btn_tumbuh.setOnClickListener {
            if(!isExpanded3){
                tv_tumbuh.visibility= View.VISIBLE
            }else{
                tv_tumbuh.visibility=View.GONE
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