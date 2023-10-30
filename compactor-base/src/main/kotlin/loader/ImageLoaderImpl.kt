package loader

import android.widget.ImageView
import decode.Decoder
import fetch.Fetcher

class ImageLoaderImpl(
    val fetcher: Fetcher<String>,
    val decoder: Decoder
) : ImageLoader{
    override fun load(view: ImageView, data: String) {
        val fetchResult = fetcher.fetch(data)
        val drawable = decoder.decode(fetchResult, view.context)
        view.setImageDrawable(drawable)
    }
}