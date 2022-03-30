package com.example.a20_sensors

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.content.getSystemService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sensors :SensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val list = sensors.getSensorList(Sensor.TYPE_ALL)


        for (i in list.indices) {
            textView.append("${list.get(i).name} \n")
        }
    }
}