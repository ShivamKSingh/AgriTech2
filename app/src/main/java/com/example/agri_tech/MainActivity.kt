package com.example.agri_tech

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getStartedBtnClicked(view: View) {
        val chooseActivity = Intent(this, ChooseActivity::class.java)
        startActivity(chooseActivity)
    }
}
