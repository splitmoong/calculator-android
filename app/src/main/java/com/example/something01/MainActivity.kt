package com.example.something01

//for vibrator
import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Vibrator
import android.text.Html.ImageGetter
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //creating variables for the text boxes
        var text_temporary: TextView = findViewById(R.id.temp_text)


        //creating variables for the number buttons.
        var button00: ImageButton = findViewById(R.id.button00)
        var button01: ImageButton = findViewById(R.id.button01)
        var button02: ImageButton = findViewById(R.id.button02)
        var button03: ImageButton = findViewById(R.id.button03)
        var button04: ImageButton = findViewById(R.id.button04)
        var button05: ImageButton = findViewById(R.id.button05)
        var button06: ImageButton = findViewById(R.id.button06)
        var button07: ImageButton = findViewById(R.id.button07)
        var button08: ImageButton = findViewById(R.id.button08)
        var button09: ImageButton = findViewById(R.id.button09)

        //creating functionality for tapping the number
        button01.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "1"
                text_temporary.text = show
            }
            else{
                var show = data + "1"
                text_temporary.text = show
            }

        }
        button02.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "2"
                text_temporary.text = show
            }
            else{
                var show = data + "2"
                text_temporary.text = show
            }
        }
        button03.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "3"
                text_temporary.text = show
            }
            else{
                var show = data + "3"
                text_temporary.text = show
            }
        }
        button04.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "4"
                text_temporary.text = show
            }
            else{
                var show = data + "4"
                text_temporary.text = show
            }
        }
        button05.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "5"
                text_temporary.text = show
            }
            else{
                var show = data + "5"
                text_temporary.text = show
            }
        }
        button06.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "6"
                text_temporary.text = show
            }
            else{
                var show = data + "6"
                text_temporary.text = show
            }
        }
        button07.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "7"
                text_temporary.text = show
            }
            else{
                var show = data + "7"
                text_temporary.text = show
            }
        }
        button08.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "8"
                text_temporary.text = show
            }
            else{
                var show = data + "8"
                text_temporary.text = show
            }
        }
        button09.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                var show = "9"
                text_temporary.text = show
            }
            else{
                var show = data + "9"
                text_temporary.text = show
            }
        }

        //creating functionality for tapping 0
        button00.setOnClickListener {
            var data = text_temporary.text.toString()
            if (data == "0"){
                text_temporary.text = data
            }
            else{
                text_temporary.text = data + "0"
            }
        }

        //creating the variable for clear and the clear functionality
        var calc_clear: ImageButton = findViewById(R.id.button_clear)
        calc_clear.setOnClickListener {
            var data = text_temporary.text.toString()
            text_temporary.text = data.dropLast(1)
        }

        //creating the variable for period and the period functionality
        var calc_period: ImageButton = findViewById(R.id.button_period)
        calc_period.setOnClickListener(){
            var data = text_temporary.text.toString()
            if (data == ""){
                var show = "0."
                text_temporary.text = show
            }
            else{
                var show = "$data."
                text_temporary.text = show
            }
        }

        //creating the variable and the functionality for operator buttons
        var plus: ImageButton = findViewById(R.id.button_plus)
        plus.setOnClickListener(){
            var data = text_temporary.text.toString()
            if(data.isNotEmpty() && data.last().isDigit()){
                var show = "$data+"
                text_temporary.text = show

            }
            else{
                var show = data
                text_temporary.text = show
            }
        }
        var minus: ImageButton = findViewById(R.id.button_minus)
        minus.setOnClickListener(){
            var data = text_temporary.text.toString()
            if(data.isNotEmpty() && data.last().isDigit()){
                var show = "$data-"
                text_temporary.text = show

            }
            else{
                var show = data
                text_temporary.text = show
            }
        }
        var multiply: ImageButton = findViewById(R.id.calc_multiply)
        multiply.setOnClickListener(){
            var data = text_temporary.text.toString()
            if(data.isNotEmpty() && data.last().isDigit()){
                var show = "$data×"
                text_temporary.text = show

            }
            else{
                var show = data
                text_temporary.text = show
            }
        }
        var divide: ImageButton = findViewById(R.id.calc_divide)
        divide.setOnClickListener(){
            var data = text_temporary.text.toString()
            if(data.isNotEmpty() && data.last().isDigit()){
                var show = "$data÷"
                text_temporary.text = show

            }
            else{
                var show = data
                text_temporary.text = show
            }
        }


    }
}
