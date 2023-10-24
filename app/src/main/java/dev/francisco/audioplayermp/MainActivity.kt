package dev.francisco.audioplayermp

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variavel do tipo player responsavel por ler o ficheiro de audio
        val mediaPlayer = MediaPlayer.create(applicationContext,R.raw.amapianoangolana)
        // da inicio a reprodução do ficheiro de audio
        mediaPlayer.start()
    }
}