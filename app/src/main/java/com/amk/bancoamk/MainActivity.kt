package com.amk.bancoamk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val bienvenido : TextView = findViewById(R.id.tvWelcome)
		val nomUsuario = intent.getStringExtra("USUARIO").toString()
		bienvenido.text = "${bienvenido.text.toString()} $nomUsuario"
		val cambiarContra : Button = findViewById(R.id.ChangePass)
		cambiarContra.setOnClickListener{
			val intent = Intent(this,ChangePassActivity::class.java)
			startActivity(intent)
		}
	}
}