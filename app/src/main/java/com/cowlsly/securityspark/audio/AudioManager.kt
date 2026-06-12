package com.cowlsly.securityspark.audio

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool

/**
 * Simple AudioManager for Marla Security Spark.
 * Uses clean assets from Focused_Audio_Fix_C for suite consistency.
 */
object AudioManager {

    private var soundPool: SoundPool? = null
    private var buttonSoundId = 0
    private var successSoundId = 0

    private var isInitialized = false
    private var isMuted = false

    fun init(context: Context) {
        if (isInitialized) return

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(4)
            .setAudioAttributes(audioAttributes)
            .build()

        // Standardized clean sounds from Focused_Audio_Fix_C
        buttonSoundId = soundPool?.load(context, com.cowlsly.securityspark.R.raw.btn_tap_primary, 1) ?: 0
        successSoundId = soundPool?.load(context, com.cowlsly.securityspark.R.raw.sfx_success, 1) ?: 0

        isInitialized = true
    }

    fun playButtonSound() {
        if (isMuted || !isInitialized) return
        soundPool?.play(buttonSoundId, 0.8f, 0.8f, 1, 0, 1f)
    }

    fun playSuccessSound() {
        if (isMuted || !isInitialized) return
        soundPool?.play(successSoundId, 0.85f, 0.85f, 1, 0, 1f)
    }

    fun toggleMute() {
        isMuted = !isMuted
    }

    fun isMuted(): Boolean = isMuted

    fun release() {
        soundPool?.release()
        soundPool = null
        isInitialized = false
    }
}