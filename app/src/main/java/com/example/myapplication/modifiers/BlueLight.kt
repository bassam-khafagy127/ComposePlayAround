package com.example.myapplication.modifiers

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun Modifier.blueLight():Modifier{
    return then(shadow(10.dp, spotColor = Color.Green))
}