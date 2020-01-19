package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import android.content.Intent
import android.widget.EditText

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }


    override fun onClick(v: View) {
      if (editText1.getText().toString().equals("")==true||
              editText2.getText().toString().equals("")==true)
      {
          editText1.setError("何か数値を入力してください")
          editText2.setError("何か数値を入力してください")


      }else {
          val intent = Intent(this, SecondActivity::class.java)

          intent.putExtra("VALUE1", editText1.text.toString().toFloat())
          intent.putExtra("VALUE2", editText2.text.toString().toFloat())

          if (v.id == R.id.button1) {
              intent.putExtra("operator", "+")
          } else if (v.id == R.id.button2) {
              intent.putExtra("operator", "-")
          } else if (v.id == R.id.button3) {
              intent.putExtra("operator", "*")
          } else if (v.id == R.id.button4) {
              intent.putExtra("operator", "/")
          }

          startActivity(intent)
      }
    }




}
