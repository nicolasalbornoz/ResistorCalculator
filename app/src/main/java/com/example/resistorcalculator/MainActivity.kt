package com.example.resistorcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var color1 = ""
    private var color2 = ""
    private var color3 = ""
    private var color4 = ""

    private var operando_color1 = ""
    private var operando_color2= ""
    private var operando_color3:Double = 0.0
    private var operando_color4 = ""
    private var resultado1= ""
    private var resultado2:Double= 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colores1 = arrayOf("Café" , "Rojo" ,  "Naranja" ,  "Amarillo" ,  "Verde" ,  "Azul" ,  "Morado" ,  "Gris" , "Blanco" )
        val colores2 = arrayOf("Negro" , "Café" , "Rojo" ,  "Naranja" ,  "Amarillo" ,  "Verde" ,  "Azul" ,  "Morado" ,  "Gris" , "Blanco" )
        val colores3 = arrayOf("Negro" , "Café" , "Rojo" ,  "Naranja" ,  "Amarillo" ,  "Verde" ,  "Azul" ,  "Morado" ,  "Gris" , "Blanco" , "Dorado" , "Plateado" )
        val colores4 = arrayOf("Café" , "Rojo" , "Dorado" , "Plateado" )

        val adapter1 = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, colores1
        )

        val adapter2 = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, colores2
        )

        val adapter3 = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, colores3
        )

        val adapter4 = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, colores4
        )

        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        sp_Color1.adapter = adapter1
        sp_Color2.adapter = adapter2
        sp_Color3.adapter = adapter3
        sp_Color4.adapter = adapter4

        sp_Color1.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                color1 = "${parent.getItemAtPosition(position).toString()}"

                when(color1 ){
                    "Café" ->{
                      bt_color1.setBackgroundResource(R.color.saddlebrown)
                      operando_color1 = "1"
                    }

                    "Rojo" ->{
                        bt_color1.setBackgroundResource(R.color.red)
                        operando_color1 = "2"
                    }

                    "Naranja" ->{
                        bt_color1.setBackgroundResource(R.color.orange)
                        operando_color1 = "3"
                    }

                    "Amarillo" ->{
                        bt_color1.setBackgroundResource(R.color.gold)
                        operando_color1 = "4"
                    }

                    "Verde" ->{
                        bt_color1.setBackgroundResource(R.color.lawngreen)
                        operando_color1 = "5"
                    }

                    "Azul" ->{
                        bt_color1.setBackgroundResource(R.color.midnightblue)
                        operando_color1 = "6"
                    }
                    "Morado" ->{
                        bt_color1.setBackgroundResource(R.color.purple)
                        operando_color1 = "7"
                    }

                    "Gris" ->{
                        bt_color1.setBackgroundResource(R.color.gray)
                        operando_color1 = "8"
                    }
                    else ->{
                        bt_color1.setBackgroundResource(R.color.white)
                        operando_color1 = "9"
                    }
                }



            }
        }

        sp_Color2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                color2 = "${parent.getItemAtPosition(position).toString()}"

                when(color2){

                    "Negro" ->{
                        bt_color2.setBackgroundResource(R.color.black)
                        operando_color2 = "0"
                    }

                    "Café" ->{
                        bt_color2.setBackgroundResource(R.color.saddlebrown)
                        operando_color2 = "1"
                    }

                    "Rojo" ->{
                        bt_color2.setBackgroundResource(R.color.red)
                        operando_color2 = "2"
                    }

                    "Naranja" ->{
                        bt_color2.setBackgroundResource(R.color.orange)
                        operando_color2 = "3"
                    }

                    "Amarillo" ->{
                        bt_color2.setBackgroundResource(R.color.gold)
                        operando_color2 = "4"
                    }

                    "Verde" ->{
                        bt_color2.setBackgroundResource(R.color.lawngreen)
                        operando_color2 = "5"
                    }

                    "Azul" ->{
                        bt_color2.setBackgroundResource(R.color.midnightblue)
                        operando_color2 = "6"
                    }
                    "Morado" ->{
                        bt_color2.setBackgroundResource(R.color.purple)
                        operando_color2 = "7"
                    }

                    "Gris" ->{
                        bt_color2.setBackgroundResource(R.color.gray)
                        operando_color2 = "8"
                    }
                    else ->{
                        bt_color2.setBackgroundResource(R.color.white)
                        operando_color2 = "9"
                    }
                }

            }
        }

        sp_Color3.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                color3 = "${parent.getItemAtPosition(position).toString()}"

                when(color3){

                    "Negro" ->{
                        bt_color3.setBackgroundResource(R.color.black)
                        operando_color3 = 1.0
                    }

                    "Café" ->{
                        bt_color3.setBackgroundResource(R.color.saddlebrown)
                        operando_color3 = 10.0
                    }

                    "Rojo" ->{
                        bt_color3.setBackgroundResource(R.color.red)
                        operando_color3 = 100.0
                    }

                    "Naranja" ->{
                        bt_color3.setBackgroundResource(R.color.orange)
                        operando_color3 = 1000.0
                    }

                    "Amarillo" ->{
                        bt_color3.setBackgroundResource(R.color.gold)
                        operando_color3 = 10000.0
                    }

                    "Verde" ->{
                        bt_color3.setBackgroundResource(R.color.lawngreen)
                        operando_color3 = 100000.0
                    }

                    "Azul" ->{
                        bt_color3.setBackgroundResource(R.color.midnightblue)
                        operando_color3 = 1000000.0
                    }
                    "Morado" ->{
                        bt_color3.setBackgroundResource(R.color.purple)
                        operando_color3 = 10000000.0
                    }

                    "Gris" ->{
                        bt_color3.setBackgroundResource(R.color.gray)
                        operando_color3 = 100000000.0
                    }

                    "Blanco" ->{
                        bt_color3.setBackgroundResource(R.color.white)
                        operando_color3 = 1000000000.0
                    }

                    "Dorado" ->{
                        bt_color3.setBackgroundResource(R.color.goldenrod)
                        operando_color3 = 0.1
                    }
                    else ->{
                        bt_color3.setBackgroundResource(R.color.silver)
                        operando_color3 = 0.01
                    }
                }

            }
        }

        sp_Color4.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                color4 = "${parent.getItemAtPosition(position).toString()}"

                when(color4){

                    "Café" ->{
                        bt_color4.setBackgroundResource(R.color.saddlebrown)
                        operando_color4 = "±1%"
                    }

                    "Rojo" ->{
                        bt_color4.setBackgroundResource(R.color.red)
                        operando_color4 = "±2%"
                    }

                    "Dorado" ->{
                        bt_color4.setBackgroundResource(R.color.goldenrod)
                        operando_color4 = "±5%"
                    }
                    else ->{
                        bt_color4.setBackgroundResource(R.color.silver)
                        operando_color4 = "±10%"
                    }
                }

            }
        }

        bt_calcular.setOnClickListener {
            resultado1 = operando_color1+operando_color2
            resultado2 = resultado1.toDouble() * operando_color3
            tvValor.text = resultado2.toString() + "Ω " + operando_color4
        }

    }
}
