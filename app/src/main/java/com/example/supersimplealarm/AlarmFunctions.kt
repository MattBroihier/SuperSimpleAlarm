package com.example.supersimplealarm

import android.app.Activity
import android.content.Context
import android.widget.Toast

static class AlarmFunctions {
    class SoundTheAlarm(applicationContext: Context?) {
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    public fun SoundTheAlarm(activity: Activity) {
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(activity, text, duration)
        toast.show()
    }
}