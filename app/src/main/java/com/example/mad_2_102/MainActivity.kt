package com.example.mad_2_102

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val Tag:String ="MainActivity"
    fun displayMessage(msg:String){
        Toast.makeText(this, "$msg is running", Toast.LENGTH_SHORT).show()
        Log.i(Tag,"This is $msg")
        Snackbar.make(
            findViewById(R.id.jp1),
            R.string.app_name,
            Snackbar.LENGTH_SHORT ).show()


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("OnCreate")

    }

    override fun onStart() {
        super.onStart()
        displayMessage("OnStart")
    }

    override fun onResume() {
        super.onResume()
        displayMessage("OnResume")
    }
    override fun onPause() {
        super.onPause()
        displayMessage("OnPause")
    }

    override fun onStop() {
        super.onStop()
        displayMessage("OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("OnDestroy")
    }
}
