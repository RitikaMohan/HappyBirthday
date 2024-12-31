package com.example.happybirthday

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        val videoView = findViewById<VideoView>(R.id.birthdayVideoView)
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.main_video)
        videoView.setVideoURI(videoUri)

        // Initialize MediaPlayer and start audio playback
        mediaPlayer = MediaPlayer.create(this, R.raw.audio2)
        mediaPlayer?.start()
        // Start the video
        videoView.setOnCompletionListener { mp: MediaPlayer? ->
            finish()
        }

        videoView.setOnPreparedListener { mp: MediaPlayer ->
            mp.isLooping = false // Play the video once
            videoView.start() // Start video playback
        }
        // ATTENTION: This was auto-generated to handle app links.
        val appLinkIntent = intent
        val appLinkAction = appLinkIntent.action
        val appLinkData = appLinkIntent.data
        val intent = Intent(this@MainActivity, MainActivity::class.java)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Stop and release MediaPlayer resources
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}