package mx.edu.utez.skyfeel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavBar = findViewById<ChipNavigationBar>(R.id.bottom_nav_bar)

        // Cargar el fragmento inicial (HomeFragment)
        loadFragment(HomeFragment())

        // Configurar navegación con el ChipNavigationBar
        bottomNavBar.setOnItemSelectedListener { id ->
            when (id) {
                R.id.home -> loadFragment(HomeFragment())
                R.id.map -> loadFragment(MapFragment())
                R.id.favorites -> loadFragment(FavoritesFragment())
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}