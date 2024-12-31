package com.example.happybirthday

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val videoView1 = findViewById<VideoView>(R.id.splashVideoView1)

        // Set video path
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.splash_video1)
        videoView1.setVideoURI(videoUri)

        // Initialize MediaPlayer and start audio playback
        mediaPlayer = MediaPlayer.create(this, R.raw.audio1)
        mediaPlayer?.start()
        // Start the video
        videoView1.setOnCompletionListener { mp: MediaPlayer? ->
            // Redirect to MainActivity when the video finishes
            val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        videoView1.setOnPreparedListener { mp: MediaPlayer ->
            mp.isLooping = false // Play the video once
            videoView1.start() // Start video playback
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        // Stop and release MediaPlayer resources
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
