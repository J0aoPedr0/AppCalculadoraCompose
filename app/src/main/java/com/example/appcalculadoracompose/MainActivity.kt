package com.example.appcalculadoracompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var number1 by remember {
                mutableStateOf("")
            }
            var number2 by remember {
                mutableStateOf("")
            }
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
                ){
                Text(text = "Calculadora",
                    fontSize = 50.sp,
                    modifier = Modifier.padding(32.dp))

                TextField(
                    value = number1,
                    onValueChange = {
                        number1 = it
                    },
                    label = {
                        Text(text = "Digite um número:")
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = number2,
                    onValueChange = {
                        number2 = it
                    },
                    label = {
                        Text(text = "Digite um número:")
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                )
                Row (modifier = Modifier.padding(16.dp)) {

                    Button(onClick = {
                        var sum = number1.toInt() + number2.toInt()
                        Toast.makeText(applicationContext, "O resultado é $sum", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "+",
                            fontSize = 25.sp)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(onClick = {
                        var sub = number1.toInt() - number2.toInt()
                        Toast.makeText(applicationContext, "O resultado é $sub", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "-",
                            fontSize = 25.sp)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(onClick = {
                        var multiply = number1.toInt() * number2.toInt()
                        Toast.makeText(applicationContext, "O resultado é $multiply", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "-",
                            fontSize = 25.sp)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(onClick = {
                        var divide = number1.toInt() / number2.toInt()
                        Toast.makeText(applicationContext, "O resultado é $divide", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "/",
                            fontSize = 25.sp)
                    }
                }

            }
        }
    }
}
