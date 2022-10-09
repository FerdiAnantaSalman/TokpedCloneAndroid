package com.example.clonetokped.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.clonetokped.R
import com.example.clonetokped.databinding.ActivityLoginBinding
import com.example.clonetokped.databinding.FragmentDashboardBinding
import com.example.clonetokped.util.Prefs

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sP = Prefs(this)
        if (sP.getIsLogin()) {
            binding.tvStatus.setText("Sudah Login")
        } else {
            binding.tvStatus.setText("Belum Login")
        }

        binding.tvLogin.setOnClickListener {
            sP.setIsLogin(true)
            onBackPressed()
        }

        binding.tvLogout.setOnClickListener {
            sP.setIsLogin(false)
            onBackPressed()
        }

        Log.i("TAG", "TEST")
    }
}