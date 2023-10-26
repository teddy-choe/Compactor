package loader

import android.widget.ImageView
import decode.Decoder
import fetch.Fetcher

internal class ImageLoaderImpl(
    val fetcher: Fetcher<String>,
    val decoder: Decoder
) : ImageLoader{
    override fun load(view: ImageView, data: String) {
        val fetchResult = fetcher.fetch(data)
        val drawable = decoder.decode()
        view.setImageDrawable(drawable)
    }
}