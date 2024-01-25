package com.sandeveloper.fitfusion.ui

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.sandeveloper.fitfusion.Functionality.Navigation
import com.sandeveloper.fitfusion.ui.MainScreens.mainPage
import com.sandeveloper.fitfusion.ui.theme.FitFusionTheme

class MainActivity : ComponentActivity(),SensorEventListener{
    lateinit var navHostController: NavHostController

    private var sensorManager: SensorManager? = null
    private var running = false
    private var totalSteps = 0f
    private var prevTotalStep =0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

            FitFusionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    navHostController = rememberNavController()
                    Navigation(navHostController)

                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        running=true
        val stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        if(stepSensor==null)Toast.makeText(this,"No sensor detected",Toast.LENGTH_SHORT).show()
        else sensorManager?.registerListener(this,stepSensor,SensorManager.SENSOR_DELAY_UI)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if(running){
            totalSteps = event!!.values[0]
            val currentSteps = totalSteps.toInt()-prevTotalStep.toInt()
            
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FitFusionTheme {
        Greeting("Android")
    }
}