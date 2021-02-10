package com.example.supersimplealarm

import android.app.Activity
import android.content.Context
import android.widget.Toast

class AlarmFunctions {
    companion object {
        fun soundTheAlarm(applicationContext: Context?) {
            val text = "Alarm! Alarm!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        fun soundTheAlarm(activity: Activity) {

            val text = "Alarm! Alarm!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(activity, text, duration)
            toast.show()
        }
    }
}