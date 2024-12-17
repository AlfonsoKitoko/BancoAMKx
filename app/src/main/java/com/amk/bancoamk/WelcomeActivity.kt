package com.amk.bancoamk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_welcome)
		val entrar: Button = findViewById(R.id.btIntro)
		entrar.setOnClickListener {
			val intent = Intent(this, LoginActivity::class.java)
			startActivity(intent)
		}
	}
}