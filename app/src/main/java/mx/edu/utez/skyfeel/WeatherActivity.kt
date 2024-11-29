package mx.edu.utez.skyfeel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class WeatherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val latitude = intent.getDoubleExtra("LATITUDE", 0.0)
        val longitude = intent.getDoubleExtra("LONGITUDE", 0.0)

        // Mostrar latitud y longitud (solo como prueba)
        val locationTextView: TextView = findViewById(R.id.location_text_view)
        locationTextView.text = "Latitud: $latitude, Longitud: $longitude"

        // Consumo del api
    }
}