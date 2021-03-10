package com.dngwjy.bundapintar.ui.kebutuhan_gizi

import android.os.Bundle
import com.bumptech.glide.Glide
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import kotlinx.android.synthetic.main.activity_detail_kebutuhan_gizi.*
import kotlinx.android.synthetic.main.activity_detail_kebutuhan_gizi.iv_back

class DetailKebutuhanGiziActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kebutuhan_gizi)
        val title=intent.extras!!.getString("title")
        val doc=intent.extras!!.getInt("doc")
        tv_header.text=title!!.toUpperCase()
        Glide.with(this).load(doc).into(iv_detail)
        iv_back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}