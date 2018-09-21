package me.nakker.fastscroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import me.nakker.fastscroller.adapter.ItemAdapter

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val items = mutableListOf<String>()
        for (item in 1..100) {
            items.add(item.toString())
        }

        val recyclerAdapter = ItemAdapter(this, items)
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = recyclerAdapter
        }

        fast_scroller.setRecyclerView(recycler_view)
    }
}
