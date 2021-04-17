package hi.dude.leroymerlin.entities

import android.graphics.Bitmap

data class Product(
    val image: Bitmap,
    val price: String,
    val description: String
)