package com.gci.hermes.common.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    open fun showScreen(destiny: Class<*>?, deleteStack: Boolean = false, params: Bundle? = null) {
        val intent = Intent(this, destiny)
        if (params != null) {
            intent.putExtras(params)
        }
        if (deleteStack) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        startActivity(intent)
    }

}