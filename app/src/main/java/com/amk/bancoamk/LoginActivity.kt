package com.amk.bancoamk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_login)
		val login : Button = findViewById(R.id.btLogin)
		val nomUsuario : EditText = findViewById(R.id.etUsuario)
		login.setOnClickListener {
			val intent = Intent(this, MainActivity::class.java)
			val usuario = nomUsuario.text.toString()
			intent.putExtra("USUARIO",usuario)
			startActivity(intent)
		}
	}
}