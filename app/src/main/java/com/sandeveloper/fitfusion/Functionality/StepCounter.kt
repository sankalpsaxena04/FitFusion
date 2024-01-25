package com.sandeveloper.fitfusion.Functionality

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager

class StepCounter:SensorEventListener {
    private var sensorManager:SensorManager? = null
    private var running = false
    private var totalSteps = 0f
    private var prevTotalStep =0f
    
    override fun onSensorChanged(event: SensorEvent?) {
        TODO("Not yet implemented")
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("Not yet implemented")
    }


}