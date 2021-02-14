package com.example.supersimplealarm

import TimePickerFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showAlarmTimePicker(view: View) {
        TimePickerFragment().show(supportFragmentManager, "timePicker")
    }

    fun showChooseSoundPicker(view: View) {
        ChooseSoundPickerFragment().show(supportFragmentManager, "timePicker")
    }
}