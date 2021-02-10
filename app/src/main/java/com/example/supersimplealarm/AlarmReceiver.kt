import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast
import com.example.supersimplealarm.AlarmFunctions

internal class AlarmReceiver : BroadcastReceiver() {
    var mp: MediaPlayer? = null
    override fun onReceive(context: Context, intent: Intent) {
        //mp = MediaPlayer.create(context, R.raw.alarm)
        //mp!!.start()
        //Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show()
        AlarmFunctions.soundTheAlarm(context)
    }
}