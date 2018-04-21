package com.kodeartisan.suelogutil

import android.util.Log

class LogDebug {

    companion object {
        val TAG = "KODEARTISAN"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }

}