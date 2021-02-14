package com.example.supersimplealarm

import android.media.RingtoneManager.ACTION_RINGTONE_PICKER
import androidx.fragment.app.DialogFragment

class ChooseSoundPickerFragment : DialogFragment(), RingtonePickerDialog{

    val ringtoneManager: RingtoneManager = RingtoneManager(this)




}
