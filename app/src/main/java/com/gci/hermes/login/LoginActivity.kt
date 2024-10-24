package com.gci.hermes.login

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gci.hermes.R
import com.gci.hermes.common.ui.BaseActivity
import com.gci.hermes.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
    }
}