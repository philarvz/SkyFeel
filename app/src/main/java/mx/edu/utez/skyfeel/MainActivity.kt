package mx.edu.utez.skyfeel

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Configura el Splash Screen del sistema
        val splashScreen = installSplashScreen()

        // Opcional: Mantén el Splash visible hasta completar alguna lógica
        splashScreen.setKeepOnScreenCondition {
            false // Cambiar a `true` si necesitas más tiempo
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}