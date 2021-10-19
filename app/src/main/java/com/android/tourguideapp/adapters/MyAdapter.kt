package com.android.tourguideapp.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.android.tourguideapp.fragments.Nature
import com.android.tourguideapp.fragments.Restaurants
import com.android.tourguideapp.fragments.Sightseeings

internal class MyAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){


    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                Sightseeings()
            }
            1 -> {
                Restaurants()
            }
            2 -> {
                Nature()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}