package com.gci.hermes.splash.ui

import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.gci.hermes.R
import com.gci.hermes.common.ui.BaseActivity
import com.gci.hermes.databinding.ActivitySplashBinding
import com.gci.hermes.login.LoginActivity

class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Handler().postDelayed({
            goToHome()
        }, 1500)
    }

    private fun goToHome() {
        showScreen(LoginActivity::class.java, true)
    }
}