package com.dngwjy.bundapintar.ui.edukasi

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.dngwjy.bundapintar.ui.menu_gizi_seimbang.DetailMenuActivity
import kotlinx.android.synthetic.main.activity_edukasi_gizi_seimbang.*
import kotlinx.android.synthetic.main.activity_edukasi_gizi_seimbang.iv_back

class EdukasiGiziSeimbangActivity : BaseActivity() {
    private var isBt1Expand =false
    private var isBt2Expand =false
    private var isBt3Expand =false
    private var isBt4Expand =false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edukasi_gizi_seimbang)
        btn_gizi_seimbang.setOnClickListener{
//            if(!isBt1Expand){
//                tv_gizi_seimbang.visibility= View.VISIBLE
//            }else{
//                tv_gizi_seimbang.visibility= View.GONE
//            }
//            isBt1Expand=!isBt1Expand
            val intent= Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("test","test")
            startActivity(intent)
        }
        btn_penyebab.setOnClickListener {
//            if(!isBt2Expand){
//                tv_penyebab.visibility= View.VISIBLE
//            }else{
//                tv_penyebab.visibility= View.GONE
//            }
//            isBt2Expand=!isBt2Expand
            val intent= Intent(this,DetailMenuActivity::class.java)
            intent.putExtra("test2","test2")
            startActivity(intent)
        }
        btn_tanda.setOnClickListener {
            if(!isBt3Expand){
                tv_tanda.visibility= View.VISIBLE
            }else{
                tv_tanda.visibility= View.GONE
            }
            isBt3Expand=!isBt3Expand
        }
        btn_akibat.setOnClickListener {
            if(!isBt4Expand){
                tv_akibat.visibility= View.VISIBLE
            }else{
                tv_akibat.visibility= View.GONE
            }
            isBt4Expand=!isBt4Expand
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