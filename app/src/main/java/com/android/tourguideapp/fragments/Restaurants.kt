package com.android.tourguideapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.tourguideapp.R
import com.android.tourguideapp.adapters.CardsAdapter
import com.android.tourguideapp.databinding.FragmentSightseeingsBinding
import com.android.tourguideapp.models.Card

class Restaurants : Fragment() {
    private lateinit var binding: FragmentSightseeingsBinding
    private lateinit var adapter1: CardsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSightseeingsBinding.inflate(layoutInflater)
        val placeList = mutableListOf<Card>(
            Card(2,"https://images.unsplash.com/photo-1600267185393-e158a98703de?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=600&ixid=MnwxfDB8MXxyYW5kb218fHx8fHx8fHwxNjI0MDE0NjQ0&ixlib=rb-1.2.1&q=80&utm_campaign=api-credit&utm_medium=referral&utm_source=unsplash_source&w=800","jdhgakjhkjhkjhkj")
        )

        adapter1 = CardsAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter1



        return binding.root
    }

}