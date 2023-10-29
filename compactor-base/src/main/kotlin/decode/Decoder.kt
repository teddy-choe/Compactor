package decode

import android.content.Context
import android.graphics.drawable.Drawable
import fetch.FetchResult

interface Decoder {
    fun decode(fetchResult: FetchResult, context: Context): Drawable
}