package com.dngwjy.bundapintar.ui.kebutuhan_gizi

import android.content.Intent
import android.os.Bundle
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import kotlinx.android.synthetic.main.activity_kebutuhan_gizi_balita.*
import kotlinx.android.synthetic.main.activity_kebutuhan_gizi_balita.iv_back

class KebutuhanGiziBalita : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kebutuhan_gizi_balita)
        bt1.setOnClickListener {
            startAct(bt1.text.toString(),R.drawable.energi)
        }
        bt2.setOnClickListener {
            startAct(bt2.text.toString(),R.drawable.protein)
        }
        bt3.setOnClickListener {
            startAct(bt3.text.toString(),R.drawable.karbohidrat)
        }
        bt4.setOnClickListener {
            startAct(bt4.text.toString(),R.drawable.lemak)
        }
        bt5.setOnClickListener {
            startAct(bt5.text.toString(),R.drawable.vitamin_mineral)
        }
        bt6.setOnClickListener {
            startAct(bt6.text.toString(),R.drawable.cairan)
        }
        iv_back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
    private fun startAct(msg:String,doc:Int){
        val intent=Intent(this,DetailKebutuhanGiziActivity::class.java)
        intent.putExtra("title",msg)
        intent.putExtra("doc",doc)
        startActivity(intent)
    }
}