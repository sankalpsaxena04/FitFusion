package com.sandeveloper.fitfusion.ui.MainScreens

import android.util.Size
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlin.math.min

@Composable
fun home(navController: NavController){
    var stepsCompleted by remember { mutableStateOf(0) }


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressBar(
                modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp),
                progress = stepsCompleted / 6000f
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Steps: $stepsCompleted / 6000",
                style = MaterialTheme.typography.bodySmall
            )


        }
    }


    fun DrawScope.drawCircularProgressBar(
        size: Size,
        progress: Float,
        color: Color
    ) {
        val strokeWidth = 12.dp.toPx()
        val radius = min(size.width / 2, size.height / 2) - strokeWidth / 2
        val arcAngle = 360 * progress

        drawArc(
            color = color,
            startAngle = 0f,
            sweepAngle = arcAngle,
            useCenter = false,
            style = Stroke(strokeWidth)
        )
    }
}

@Composable
fun CircularProgressBar(modifier: Modifier, progress: Float) {
   androidx.compose.foundation.Canvas(modifier = modifier, onDraw = {
       drawCircularProgressBar(size,progress, color = Color.DarkGray)
   })
}

fun DrawScope.drawCircularProgressBar(size: androidx.compose.ui.geometry.Size, progress: Float, color: Color) {
    val strokeWidth = 12.dp.toPx()
    val radius = min(size.width / 2, size.height / 2) - strokeWidth / 2
    val arcAngle = 360 * progress

    drawArc(
        color = color,
        startAngle = 0f,
        sweepAngle = arcAngle,
        useCenter = false,
        style = Stroke(strokeWidth)
    )
}

//@Preview
//@Composable
//fun StepCounterScreenPreview() {
//    home()
//}
//
//@Preview
//@Composable
//fun CircularProgressBarPreview() {
//    CircularProgressBar(
//        modifier = Modifier.size(200.dp),
//        progress = 0.7f
//    )
//}
