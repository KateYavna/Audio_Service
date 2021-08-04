package com.example.audio_service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class AudioService : Service() {

    private lateinit var player: MediaPlayer


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        var player = MediaPlayer.create(this,R.raw.shubert)
        player.isLooping = true
        player.start()

        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}