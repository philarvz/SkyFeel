package mx.edu.utez.skyfeel.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import mx.edu.utez.skyfeel.R
import mx.edu.utez.skyfeel.models.Location

class FavoritesAdapter(private val favoritesList: List<Location>) : RecyclerView.Adapter<FavoritesAdapter.FavoriteViewHolder>() {

    // Este ViewHolder se encarga de referenciar las vistas de cada ítem de la lista.
    inner class FavoriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val placeTextView: TextView = itemView.findViewById(R.id.recPlace)
        val tempTextView: TextView = itemView.findViewById(R.id.recTemp)
        val descriptionTextView: TextView = itemView.findViewById(R.id.recDesc)
        val imageView: ShapeableImageView = itemView.findViewById(R.id.recImage)
    }

    // Esta función se llama para crear nuevas vistas
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_favorite, parent, false) // Asegúrate de usar el nombre correcto de tu archivo XML
        return FavoriteViewHolder(itemView)
    }

    // Esta función se llama para vincular los datos con las vistas
    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        val location = favoritesList[position]
        holder.placeTextView.text = location.placeName
        holder.tempTextView.text = "${location.temperature} °C"
        holder.descriptionTextView.text = location.description


    }

    // Esta función devuelve la cantidad de elementos en la lista
    override fun getItemCount(): Int {
        return favoritesList.size
    }
}
