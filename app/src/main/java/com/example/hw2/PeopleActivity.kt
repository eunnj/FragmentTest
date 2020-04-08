package com.example.hw2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_people.*

class PeopleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_people)

        val intent = getIntent()
        val dname =intent.getStringExtra("dname").toString()
        val dbirth =intent.getStringExtra("dbirth").toString()
        val dphone =intent.getStringExtra("dphone").toString()

        p_name.setText(dname)
        p_birth.setText(dbirth)
        p_phone.setText(dphone)
    }
}