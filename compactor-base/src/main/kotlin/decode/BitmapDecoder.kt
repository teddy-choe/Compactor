package decode

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toDrawable
import fetch.FetchResult

class BitmapDecoder: Decoder {
    override fun decode(fetchResult: FetchResult, context: Context): Drawable {
        val options = BitmapFactory.Options()
        val bitmap = BitmapFactory.decodeStream(fetchResult.source.peek().inputStream(), null, options)
        checkNotNull(bitmap) { "bitmap is null." }
        return bitmap.toDrawable(context.resources)
    }
}