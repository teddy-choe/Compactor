package fetch

interface Fetcher<T: Any> {
    fun fetch(data: T): FetchResult
}