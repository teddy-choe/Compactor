package loader

import android.widget.ImageView

interface ImageLoader {
    fun load(view: ImageView, data: String)
}