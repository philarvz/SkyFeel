package mx.edu.utez.skyfeel

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Usamos un Handler para hacer el retraso de 3 segundos
        Handler().postDelayed({
            // Aquí rediriges a la DashboardActivity después de 3 segundos
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()  // Termina la MainActivity (si no la quieres en la pila)
        }, 10000)  // 3000 milisegundos = 3 segundos
    }
}
