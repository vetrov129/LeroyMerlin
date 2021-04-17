package hi.dude.leroymerlin.fragments.main

import android.app.Application
import android.content.res.Resources
import android.graphics.BitmapFactory
import androidx.lifecycle.AndroidViewModel
import hi.dude.leroymerlin.entities.Category
import hi.dude.leroymerlin.entities.Product
import hi.dude.leroymerlin.R

class MainFragmentViewModel(app: Application, private val resources: Resources) : AndroidViewModel(app) {

    fun getCategories() = listOf(
        Category("first", null),
        Category("Сад", BitmapFactory.decodeResource(resources, R.drawable.bush)),
        Category("Освещение", BitmapFactory.decodeResource(resources, R.drawable.lamp)),
        Category("Инструмент", BitmapFactory.decodeResource(resources, R.drawable.drill)),
        Category("Строймате-\nриалы", BitmapFactory.decodeResource(resources, R.drawable.brick)),
        Category("Декор", BitmapFactory.decodeResource(resources, R.drawable.roll)),
        Category("last", null)
    )

    fun getProducts() = listOf(
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.drill),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.brick),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.drill),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.lamp),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.roll),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.drill),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.bush),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        ),
        Product(
            BitmapFactory.decodeResource(resources, R.drawable.drill),
            resources.getString(R.string.price),
            resources.getString(R.string.product_description)
        )
    )
}