package com.example.dialogalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    override fun onBackPressed() {
        var builder = AlertDialog.Builder(this)

        builder.setTitle("Alert!")

        builder.setMessage("do you want to exit")

        builder.setPositiveButton("yes"){
                dialog,which -> finish()
        }
        builder.setNegativeButton("No"){
                dialog, which -> dialog.cancel()
        }

        var alertDialog = builder.create()

        alertDialog.show()


    }

}