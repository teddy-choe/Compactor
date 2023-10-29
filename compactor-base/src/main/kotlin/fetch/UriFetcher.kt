package fetch

import okhttp3.OkHttpClient
import okhttp3.Request

internal class UriFetcher(
    val okHttpClient: OkHttpClient
): Fetcher<String> {
    override fun fetch(data: String): FetchResult {
        val request = Request.Builder()
            .url(data)
            .build()

        val result = runCatching {
            okHttpClient.newCall(request).execute()
        }.getOrThrow()

        val response = result.body

        checkNotNull(response) {"response body == null"}
        return FetchResult(source = response.source())
    }
}