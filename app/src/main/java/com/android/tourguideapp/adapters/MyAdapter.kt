package com.android.tourguideapp.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.android.tourguideapp.fragments.Nature
import com.android.tourguideapp.fragments.Restaurants
import com.android.tourguideapp.fragments.Sightseeings

class MyAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Sights")
                val sightseengs = Sightseeings()
                sightseengs.arguments = bundle
                return sightseengs
            }
            1 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Restaurants")
                val restaurants = Restaurants()
                restaurants.arguments = bundle
                return restaurants
            }
            2 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Nature")
                val nature = Nature()
                nature.arguments = bundle
                return nature
            }
            else -> return Sightseeings()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}