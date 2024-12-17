package com.amk.bancoamk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChangePassActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_changepass)
		val guardar : Button = findViewById(R.id.btSave)
		guardar.setOnClickListener{
			val intent = Intent(this,MainActivity::class.java)
			startActivity(intent)
		}
	}
}