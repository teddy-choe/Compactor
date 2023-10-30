import android.graphics.Bitmap
import android.widget.ImageView
import loader.ImageLoader
import loader.ImageLoaderImpl

fun ImageView.load(
    uri: String,
    imageLoader: ImageLoader = Compactor.imageLoader()
) {
    imageLoader.load(this, uri)
}