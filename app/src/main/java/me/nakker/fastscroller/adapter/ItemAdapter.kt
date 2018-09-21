package me.nakker.fastscroller.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import me.nakker.fastscroller.R
import me.nakker.fastscroller.customview.ItemCellView
import me.nakker.fastscroller.customview.RecyclerFastScroller

/**
 * @author nakker
 */
class ItemAdapter(private val context: Context, list: List<String>? = null) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(), RecyclerFastScroller.FastScrollable {
    override fun setBubbleText(position: Int): String {
        return items[position]
    }

    private val items: MutableList<String> = mutableListOf()

    init {
        list?.let {
            items.addAll(it)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_item_cell, parent, false) as ItemCellView
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.itemCellView.build(item)
    }

    override fun getItemViewType(position: Int): Int = ViewType.ITEM.type

    override fun getItemCount(): Int = items.size

    class ViewHolder(val itemCellView: ItemCellView) : RecyclerView.ViewHolder(itemCellView)

    private enum class ViewType(val type: Int) {
        ITEM(0)
    }
}