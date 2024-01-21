package com.sandeveloper.fitfusion.ui.authui

import android.widget.ScrollView
import android.widget.Scroller
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.repeatable
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sandeveloper.fitfusion.R
@Preview(showBackground = true)
@Composable
fun firstPage(){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(MaterialTheme.colorScheme.inversePrimary),

        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = painterResource(id = R.drawable.firstpage),
            contentDescription = "image description",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .padding(10.dp, 20.dp, 10.dp, 25.dp)
                .fillMaxSize()

        )
    Image(
        painter = painterResource(id = R.drawable.mainlogo),
        contentDescription = "image description",
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth()


    )
    FilledTonalButton(onClick = {  },
        modifier = Modifier
            .padding(45.dp, 40.dp, 45.dp, 25.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)


    ) {
        Text(
            text = "Register",
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight(600),
                color = MaterialTheme.colorScheme.inversePrimary,
                textAlign = TextAlign.Center
            )
           )
    }
        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(8.dp),

            modifier = Modifier
                .padding(45.dp, 10.dp, 45.dp, 30.dp)
                .fillMaxWidth()
                ,
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            content = {

                Text(text = "Login",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        color = MaterialTheme.colorScheme.primary,
                        textAlign = TextAlign.Center
                    ))
            }
        )


    }

}