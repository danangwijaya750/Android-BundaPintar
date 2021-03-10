package com.dngwjy.bundapintar.ui.menu_gizi_seimbang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import kotlinx.android.synthetic.main.activity_detail_menu.*
import kotlinx.android.synthetic.main.activity_detail_menu.iv_back
import kotlinx.android.synthetic.main.activity_menu_gizi_seimbang.*

class DetailMenuActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)
        iv_back.setOnClickListener {
            onBackPressed()
        }
        when {
            intent.hasExtra("status") -> {
                tv_header.text="INDEKS STATUS GIZI"
                try {
                    pdfView.fromAsset("surat.pdf").load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("surat.pdf").load()
                }
            }
            intent.hasExtra("test") -> {
                tv_header.text="GIZI SEIMBANG"
                try {
                    pdfView.fromAsset("test.pdf").pages(3,4)
                            .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(3,4)
                            .load()
                }
            }
            else -> {
                try {
                    pdfView.fromAsset("menu_makanan.pdf").load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("menu_makanan.pdf").load()
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}