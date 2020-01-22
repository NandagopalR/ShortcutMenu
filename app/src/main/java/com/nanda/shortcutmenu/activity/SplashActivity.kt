package com.nanda.shortcutmenu.activity

import android.os.Bundle
import android.os.Handler
import com.nanda.shortcutmenu.R
import com.nanda.shortcutmenu.base.BaseActivity

/**
 * Created by Nandagopal on 2020-01-22.
 */
class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(HomeActivity.getCallingIntent(this))
            finish()
        }, 1000)
    }

}