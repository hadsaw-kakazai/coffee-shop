package com.example.coffeeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ordernow(view : View){
        var cream = findViewById<CheckBox>(R.id.cream)
        var choco = findViewById<CheckBox>(R.id.choco)
        var summ = findViewById<TextView>(R.id.summary)
        val qty = findViewById<TextView>(R.id.qty)
        var num:Int = Integer.parseInt(qty.text.toString())
        var message = "ORDER SUMMARY \nAdd Whiped Cream:"

        if(cream.isChecked)
            message = "${message}"+" yes \n"
        else
            message = "${message}"+" no \n"

        if(choco.isChecked)
            message = "${message}"+"\n"+"Add Chocolate " +" yes\n"
        else
            message = "${message}"+"\n"+"Add Chocolate " +" no \n"

        message = "${message}" + "Quantity $"+" ${num*10}"
        summ.text = message



    }


    fun addQty(view:View){
        val qty = findViewById<TextView>(R.id.qty)
        var num:Int = Integer.parseInt(qty.text.toString())

        num++

        qty.text =  "${num}"

    }

    fun subQty(view:View){

        val qty = findViewById<TextView>(R.id.qty)
        var num:Int = Integer.parseInt(qty.text.toString())
        if(num > 0)
            num--
        else
            num = 0
        qty.text =  "${num}"
    }


}