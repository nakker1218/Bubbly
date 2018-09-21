package me.nakker.fastscroller.customview

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import kotlinx.android.synthetic.main.view_item_cell.view.*

/**
 * @author nakker
 */
class ItemCellView @JvmOverloads constructor(context: Context,
                                             attrs: AttributeSet? = null,
                                             defStyleAttr: Int = 0)
    : ConstraintLayout(context, attrs, defStyleAttr) {

    fun build(text: String) {
        text_view.text = text
    }
}