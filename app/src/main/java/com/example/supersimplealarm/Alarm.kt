package com.example.supersimplealarm

import android.content.Context
import android.media.RingtoneManager
import android.net.Uri
import android.widget.Toast

class Alarm {
    companion object {
        fun soundTheAlarm(applicationContext: Context?) {
            val text = "Alarm! Alarm!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            PlayASound(applicationContext)
        }

        fun PlayASound(applicationContext: Context?)
        {
            try {
                val notification: Uri =
                    RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
                val r = RingtoneManager.getRingtone(applicationContext,
                    notification
                )
                r.play()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
//        fun soundTheAlarm(activity: Activity) {
//
//            val text = "Alarm! Alarm!"
//            val duration = Toast.LENGTH_SHORT
//
//            val toast = Toast.makeText(activity, text, duration)
//            toast.show()
//        }
    }
}