import decode.BitmapDecoder
import fetch.UriFetcher
import loader.ImageLoaderImpl
import okhttp3.OkHttpClient

object Compactor {
    private val okHttpClient = OkHttpClient.Builder().build()
    private val imageLoader by lazy {
        ImageLoaderImpl(
            fetcher = UriFetcher(okHttpClient),
            decoder = BitmapDecoder()
        )
    }

    fun imageLoader() = imageLoader
}