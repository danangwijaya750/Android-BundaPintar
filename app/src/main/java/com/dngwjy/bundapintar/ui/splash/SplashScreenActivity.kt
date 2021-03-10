package com.dngwjy.bundapintar.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.dngwjy.bundapintar.R
import com.dngwjy.bundapintar.base.BaseActivity
import com.dngwjy.bundapintar.ui.main.MainActivity

class SplashScreenActivity : BaseActivity() {
    private var handler: Handler? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()
        doSplash()
    }

    private fun doSplash(){
        handler!!.postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },2000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler=null
    }
}