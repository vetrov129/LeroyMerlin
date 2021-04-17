package hi.dude.leroymerlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hi.dude.leroymerlin.R
import hi.dude.leroymerlin.entities.Product

class ProductsRecyclerAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.item_product_image).setImageBitmap(products[position].image)
            findViewById<TextView>(R.id.item_product_price).text = products[position].price
            findViewById<TextView>(R.id.item_product_description).text =
                if (products[position].description.length > 20)
                    products[position].description.substring(0, 20) + "..."
                else
                    products[position].description
        }
    }

    override fun getItemCount(): Int = products.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}