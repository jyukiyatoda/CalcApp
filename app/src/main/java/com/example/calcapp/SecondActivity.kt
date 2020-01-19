package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import android.view.View

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1=intent.getIntExtra("VALUE1",0)
        val value2=intent.getIntExtra("VALUE2",0)
        val value3=intent.getStringExtra("operator")

        var value1text=value1
        var value2text=value2
        var operator1=value3

        if(operator1=="+"){
            var add=value1+value2
            textView.text=add.toString()
        }else if(operator1=="-"){
            var sub=value1-value2
            textView.text=sub.toString()
        }else if(operator1=="*"){
            var multi=value1*value2
            textView.text=multi.toString()
        }else if (operator1=="/"){
            var div=value1/value2
            textView.text=div.toString()
        }


    }
}
