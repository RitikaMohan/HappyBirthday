package com.example.happybirthday

import android.app.Application
import android.media.MediaPlayer
import android.util.Log

class AppMedia : Application() {

    var mediaPlayer: MediaPlayer? = null

    override fun onCreate() {
        super.onCreate()
        try {
            mediaPlayer = MediaPlayer.create(this, R.raw.audio_splash)
            mediaPlayer?.isLooping = true
            Log.d("AppMedia", "MediaPlayer initialized successfully")
        } catch (e: Exception) {
            Log.e("AppMedia", "Error initializing MediaPlayer", e)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        mediaPlayer?.release()
        mediaPlayer = null
        Log.d("AppMedia", "MediaPlayer released")
    }
}