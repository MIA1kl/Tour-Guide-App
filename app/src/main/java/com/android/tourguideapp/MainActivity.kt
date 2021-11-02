package com.android.tourguideapp

import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import com.android.tourguideapp.adapters.MyAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout.setSelectedTabIndicatorColor(getColor(R.color.purple))
        tabLayout.tabTextColors = ContextCompat.getColorStateList(this, R.color.purple)

        val numberOfTabs = 3

        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.isInlineLabel = true

        val adapter = MyAdapter(supportFragmentManager, lifecycle, numberOfTabs)
        viewPager.adapter = adapter

        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.setIcon(R.drawable.ic_sightseeings)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_restaurants)

                }
                2 -> {
                    tab.setIcon(R.drawable.ic_hotels)
                }

            }
            tab.icon?.colorFilter =
                BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    R.color.purple,
                    BlendModeCompat.SRC_ATOP
                )
        }.attach()


        setCustomTabTitles()
    }

    private fun setCustomTabTitles() {
        val vg = tabLayout.getChildAt(0) as ViewGroup
        val tabsCount = vg.childCount

        for (j in 0 until tabsCount) {
            val vgTab = vg.getChildAt(j) as ViewGroup

            val tabChildCount = vgTab.childCount

            for (i in 0 until tabChildCount) {
                val tabViewChild = vgTab.getChildAt(i)
                if (tabViewChild is TextView) {
                    tabViewChild.typeface = Typeface.DEFAULT_BOLD
                }
            }
        }
    }

}