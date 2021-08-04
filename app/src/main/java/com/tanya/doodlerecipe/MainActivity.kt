package com.tanya.doodlerecipe

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Image(painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "happy meal",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop)
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Happy Meal",
                         style = TextStyle(
                             fontSize = 26.sp
                         )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "Burger and Fries")
                }
            }
        }
    }
}

