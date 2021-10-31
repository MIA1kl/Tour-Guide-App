package com.android.tourguideapp.adapters

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.android.tourguideapp.fragments.RestaurantsFragment
import com.android.tourguideapp.fragments.MallsFragment

class MyAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {

    override fun createFragment(position: Int): androidx.fragment.app.Fragment {
        when (position) {
            0 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Sights")
                val sightseengs = MallsFragment()
                sightseengs.arguments = bundle
                return sightseengs
            }
            1 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Restaurants")
                val restaurants = RestaurantsFragment()
                restaurants.arguments = bundle
                return restaurants
            }
            2 -> {
                val bundle = Bundle()
                bundle.putString("fragmentName", "Hotels")
                val hotels = com.android.tourguideapp.fragments.HotelsFragment()
                hotels.arguments = bundle
                return hotels
            }
            else -> return MallsFragment()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}