package esteban.g.ejercicio_kotline01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import esteban.g.ejercicio_kotline01.databinding.ViewMovieItemBinding


class MoviesAdapter (private val movies: List<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewMovieItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    class ViewHolder (private val binding: ViewMovieItemBinding) : RecyclerView.ViewHolder (binding.root){
        fun bind (movie: Movie){
            binding.textViewTitle.text = movie.title
            Glide.with(binding.root.context).load(movie.cover).into(binding.imageViewCover)
        }
    }

}