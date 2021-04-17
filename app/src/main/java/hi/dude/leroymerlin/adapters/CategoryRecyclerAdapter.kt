package hi.dude.leroymerlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hi.dude.leroymerlin.R
import hi.dude.leroymerlin.entities.Category

class CategoryRecyclerAdapter(private val categories: List<Category>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> 0
            categories.size - 1 -> 1
            else -> 2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val resourceId = when (viewType) {
            0 -> R.layout.item_category_first
            1 -> R.layout.item_category_last
            else -> R.layout.item_category
        }
        return ViewHolder(LayoutInflater.from(parent.context).inflate(resourceId, parent, false), viewType)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val mHolder = holder as ViewHolder
        if (mHolder.viewType != 2) return

        holder.itemView.apply {
            findViewById<TextView>(R.id.item_category_text).text = categories[position].name
            findViewById<ImageView>(R.id.item_category_image).setImageBitmap(categories[position].image)
        }
    }

    override fun getItemCount(): Int = categories.size

    class ViewHolder(itemView: View, val viewType: Int) : RecyclerView.ViewHolder(itemView)
}