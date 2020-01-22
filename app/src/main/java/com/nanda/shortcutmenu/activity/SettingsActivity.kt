package com.nanda.shortcutmenu.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.nanda.shortcutmenu.R
import com.nanda.shortcutmenu.base.BaseActivity

/**
 * Created by Nandagopal on 2020-01-22.
 */
class SettingsActivity : BaseActivity() {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, SettingsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

}