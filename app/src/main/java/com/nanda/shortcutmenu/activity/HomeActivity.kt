package com.nanda.shortcutmenu.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.nanda.shortcutmenu.R
import com.nanda.shortcutmenu.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : BaseActivity(), View.OnClickListener {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pview_workorder.setOnClickListener(this)
        pview_asset.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pview_workorder -> {
                startActivity(WorkOrderActivity.getCallingIntent(this))
            }
            R.id.pview_asset -> {
                startActivity(AssetEventActivity.getCallingIntent(this))
            }
        }
    }
}
