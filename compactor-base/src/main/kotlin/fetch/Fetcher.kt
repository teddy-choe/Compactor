package fetch

import android.graphics.drawable.Drawable

interface Fetcher<T: Any> {
    fun fetch(data: T): Drawable
}