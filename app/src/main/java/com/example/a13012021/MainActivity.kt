package com.example.a13012021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Button as Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nastepne = findViewById<Button>(R.id.nzdj)
        val poprzednie = findViewById<Button>(R.id.pzdj)
        var i = 0

        findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.przezr)

        nastepne.setOnClickListener {
            i++
            if(i==1){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez1)
            }
            else if(i==2){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez2)
            }
            else if(i==3){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez3)
            }
            else if(i==4){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiexz4)
            }
            else if(i==5 || i==0){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez1)
                i=1
            }
        }
        poprzednie.setOnClickListener{
            i--
            if(i==-1 || i==0){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiexz4)
                i=4
            }
            else if(i==1){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez1)
            }
            else if(i==2){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez2)
            }
            else if(i==3){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiez3)
            }
            else if(i==4){
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.papiexz4)
            }
        }

        findViewById<Button>(R.id.owlbtn).setOnClickListener {
            val obrot = findViewById<EditText>(R.id.tbobrot).text.toString()
            findViewById<ImageView>(R.id.zdjecie).rotationX = obrot.toFloat()
        }

        findViewById<Button>(R.id.owpbtn).setOnClickListener {
            val obrot = findViewById<EditText>(R.id.tbobrot).text.toString()
            findViewById<ImageView>(R.id.zdjecie).rotationY = obrot.toFloat()
        }

        findViewById<Button>(R.id.skalabtn).setOnClickListener {
            val skala = findViewById<EditText>(R.id.tbskala).toString()
            findViewById<ImageView>(R.id.zdjecie).setScaleX(skala.toFloat())
        }
    }
}