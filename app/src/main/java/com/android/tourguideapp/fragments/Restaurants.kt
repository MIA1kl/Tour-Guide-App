package com.android.tourguideapp.fragments

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.tourguideapp.R
import com.android.tourguideapp.adapters.CardsAdapter
import com.android.tourguideapp.databinding.FragmentSightseeingsBinding
import com.android.tourguideapp.models.Card
import kotlinx.android.synthetic.main.item_card.*

class Restaurants : Fragment() {
    private lateinit var binding: FragmentSightseeingsBinding
    private lateinit var adapter1: CardsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSightseeingsBinding.inflate(layoutInflater)
        val placeList = mutableListOf<Card>(
            Card(2,"https://photos.wikimapia.org/p/00/07/58/88/16_big.jpg","jdhgakjhkjhkjhkj","akjshfdkjhkjfhkhjhjkhjh")
        )

        adapter1 = CardsAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter1



        return binding.root
    }

}