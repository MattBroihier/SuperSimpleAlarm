import android.app.AlarmManager
import android.app.Dialog
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.text.format.DateFormat.is24HourFormat
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.supersimplealarm.AlarmFunctions
import java.util.*


class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    private var SelectedHour = 0
    private var SelectedMinute = 0

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        // Create a new instance of TimePickerDialog and return it
        return TimePickerDialog(activity, this, hour, minute, is24HourFormat(activity))
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        // Do something with the time chosen by the user
        SelectedMinute = hourOfDay
        SelectedMinute = minute

        AlarmFunctions.soundTheAlarm(getActivity()?.getApplicationContext())

        FireOffAlarm ()
    }

    private fun FireOffAlarm() {
        var alarmMgr: AlarmManager? = null
        lateinit var alarmIntent: PendingIntent
        alarmMgr = context?.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        //alarmIntent = Intent(context, com.example.supersimplealarm.AlarmReceiver::class.java).let { intent ->
        alarmIntent = Intent(context, AlarmReceiver::class.java).let { intent ->
            PendingIntent.getBroadcast(context, 0, intent, 0)
        }

        alarmMgr?.set(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            SystemClock.elapsedRealtime() + 15 * 1000,
//            AlarmManager.OnAlarmListener {
//                                         SoundTheAlarm()
//            },
            //AlarmManager.OnAlarmListener {
            //    SoundTheAlarm()
            //}
            alarmIntent
        )
//        alarmMgr?.OnAlarmListener(){
//            SoundTheAlarm()
//        }
    }

    public fun SoundTheAlarm() {
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(getActivity()?.getApplicationContext(), text, duration)
        toast.show()
    }

//    private var com.example.supersimplealarm.AlarmReceiver: BroadcastReceiver = object : BroadcastReceiver() {
//    //private var com.example.supersimplealarm.AlarmReceiver: BroadcastReceiver{
//        override fun onReceive(context: Context, intent: Intent) {
//            // Repeat the scheduled task
//            //super.onReceive (context, intent)
////            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
////                alarmManager.setExactAndAllowWhileIdle(
////                    AlarmManager.ELAPSED_REALTIME_WAKEUP,
////                    SystemClock.elapsedRealtime() + TIME_INTERVAL,
////                    pendingIntent
////                )
////            } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
////                alarmManager.setExact(
////                    AlarmManager.ELAPSED_REALTIME_WAKEUP,
////                    SystemClock.elapsedRealtime() + TIME_INTERVAL,
////                    pendingIntent
////                )
//            }
//            // to do something
//            //doSomething()
//        }
//    }
}