package com.example.agri_tech

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChooseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
    }

   fun chatPersonallyBtnClicked (view: View) {
       val launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.chatdat")
       if (launchIntent != null)
       {
           startActivity(launchIntent)
       }

   }

   fun viewDataBtnClicked (view: View) {

       val webActivity = Intent(this, WebActivity::class.java)
       startActivity(webActivity)
   }
//       val webIntent: Intent = Uri.parse("http://3.18.110.88/").let { webpage ->
//           Intent(Intent.ACTION_VIEW, webpage)
//       }
//       startActivity(webIntent)


   }
