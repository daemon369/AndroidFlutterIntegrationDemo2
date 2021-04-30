package me.daemon.flutter.integration.library

import android.app.Activity
import io.flutter.embedding.android.FlutterActivity

/**
 * @author daemon
 * @since 2021/4/28 17:19
 */
object SDK {

    fun openFlutter(activity: Activity) {
        activity.startActivity(
                FlutterActivity.createDefaultIntent(activity)
        )
    }

}