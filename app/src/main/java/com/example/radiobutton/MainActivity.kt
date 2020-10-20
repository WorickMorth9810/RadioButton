package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var txtnum1: EditText
    lateinit var txtnum2: EditText
    lateinit var  Suma: RadioButton
    lateinit var  Resta: RadioButton
    lateinit var  Multi: RadioButton
    lateinit var  Div: RadioButton
    lateinit var  Operacion: Button
    lateinit var  Resultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtnum1 = findViewById(R.id.txtnum1)
        txtnum2 = findViewById(R.id.txtnum2)
        Suma = findViewById(R.id.bSuma)
        Resta = findViewById(R.id.bResta)
        Multi = findViewById(R.id.bMulti)
        Div = findViewById(R.id.bDivision)
        Operacion = findViewById(R.id.Operacion)
        Resultado = findViewById(R.id.Resultado)

        Operacion.setOnClickListener {
            val num1:Int = txtnum1.text.toString().toInt()
            val num2:Int = txtnum2.text.toString().toInt()
            var res:Int=0
            if(Suma.isChecked)
                res= num1+num2
            else if (Resta.isChecked)
                res=num1-num2
            else if (Multi.isChecked)
                res=num1*num2
            else if (Div.isChecked)
                res=num1/num2
            Resultado.text="$res"
        }


    }
}