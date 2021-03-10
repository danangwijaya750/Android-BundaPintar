package com.dngwjy.bundapintar.ui.menu_gizi_seimbang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.github.barteksc.pdfviewer.util.FitPolicy
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
            intent.hasExtra("test2") -> {
                tv_header.text="KEKURANGAN ENERGI PROTEIN (KEP)"
                try {
                    pdfView.fromAsset("test.pdf").pages(5,6,7,8)
                            .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(5,6,7,8)
                            .load()
                }
            }
            intent.hasExtra("kebutuhan") -> {
                tv_header.text="KEBUTUHAN GIZI BALITA"
//                try {
//                    pdfView.fromAsset("test.pdf").pages(9)
//                            .spacing(0)
//                            .load()
//                } catch (ex: Exception) {
//                    pdfView.fromAsset("test.pdf").pages(9)
//                            .spacing(0)
//                            .load()
//                }
            }
            intent.hasExtra("fungsi") -> {
                tv_header.text="FUNGSI MAKANAN"
//                try {
//                    pdfView.fromAsset("test.pdf").pages(9)
//                        .spacing(0)
//                        .load()
//                } catch (ex: Exception) {
//                    pdfView.fromAsset("test.pdf").pages(9)
//                        .spacing(0)
//                        .load()
//                }
            }
            intent.hasExtra("strategi") -> {
                tv_header.text="STRATEGI PMBA"
                try {
                    pdfView.fromAsset("test.pdf").pages(11,12,13,14)
                        .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(11,12,13,14)
                        .load()
                }
            }
            intent.hasExtra("pedoman") -> {
                tv_header.text="PEDOMAN PEMBERIAN MAKANAN YANG SEHAT"
                try {
                    pdfView.fromAsset("test.pdf").pages(15,16,17,18,19,20)
                        .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(15,16,17,18,19,20)
                        .load()
                }
            }
            intent.hasExtra("lumat") -> {
                tv_header.text="RESEP MPASI MAKANAN LUMAT"
                try {
                    pdfView.fromAsset("test.pdf").pages(23,24,25,26)
                        .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(23,24,25,26)
                        .load()
                }
            }
            intent.hasExtra("lembik") -> {
                tv_header.text="RESEP MPASI MAKANAN LEMBIK"
                try {
                    pdfView.fromAsset("test.pdf").pages(26,27,28,29,30,31)
                        .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(26,27,28,29,30,31)
                        .load()
                }
            }
            intent.hasExtra("keluarga") -> {
                tv_header.text="RESEP MPASI MAKANAN KELUARGA"
                try {
                    pdfView.fromAsset("test.pdf").pages(32,33,34,35,36,37,38,39)
                        .load()
                } catch (ex: Exception) {
                    pdfView.fromAsset("test.pdf").pages(32,33,34,35,36,37,38,39)
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