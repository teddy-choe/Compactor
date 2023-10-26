package fetch

import android.graphics.drawable.Drawable
import android.net.Uri
import okhttp3.OkHttpClient
import okhttp3.Request

internal class UriFetcher(
    val okHttpClient: OkHttpClient
): Fetcher<String> {
    override fun fetch(data: String): Drawable {
        val request = Request.Builder()
            .url(data)
            .build()

        val result = runCatching {
            okHttpClient.newCall(request).execute()
        }.getOrThrow()

        return
    }
}