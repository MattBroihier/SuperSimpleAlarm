package com.example.supersimplealarm

import android.media.RingtoneManager
import android.media.RingtoneManager.ACTION_RINGTONE_PICKER
import androidx.fragment.app.DialogFragment
import java.net.URI

class ChooseSoundPickerFragment : DialogFragment(), RingtonePickerDialog{

    val ringtoneManager: RingtoneManager = RingtoneManager(this)

    var alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
    //builder.setSound(alarmSound)

    var ringtones : List<URI>
    ringtones.add = alarmSound




}
