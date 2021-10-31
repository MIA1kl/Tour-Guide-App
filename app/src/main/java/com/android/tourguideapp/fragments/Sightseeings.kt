package com.android.tourguideapp.fragments

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.tourguideapp.R
import com.android.tourguideapp.adapters.CardsAdapter
import com.android.tourguideapp.databinding.FragmentSightseeingsBinding
import com.android.tourguideapp.models.CardsListener
import com.android.tourguideapp.models.CardsService
import com.android.tourguideapp.models.Card
import com.github.javafaker.App
import kotlinx.android.synthetic.main.item_card.*

class Sightseeings : Fragment() {

    private lateinit var binding: FragmentSightseeingsBinding
    private lateinit var adapter1: CardsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSightseeingsBinding.inflate(layoutInflater)
        val placeList = mutableListOf<Card>(
            Card(1,"https://photos.wikimapia.org/p/00/07/58/88/16_big.jpg","Manas's monument","khashdfkjhuehuwkhskjhfjadshfjkahjsdhfjhjahk jkajlksdjflkajlksjdkajfkajk","0555555555","Moskva st.234","42.87686384957963, 74.60375511319208"),
            Card(2,"https://dook-international.sgp1.cdn.digitaloceanspaces.com/dook/images/poi/xSQej1614581106.jpg","Osh Bazaar","Osh Bazaar is one of the largest bazaars in Bishkek Kyrgyzstan. It is located on the west side of town and is not far from the Western Bus Station. At Osh Bazaar one can buy food products almost any common household good clothes souvenirs and even musical instruments. ","+996555555555","Moskva st.234"),
            Card(3,"https://dook-international.sgp1.cdn.digitaloceanspaces.com/dook/images/poi/CDiGe7HI1625217146.jpg","Panfilov Park","khashdfkjhuehuwkhskjhfjadshfjkahjsdhfjhjahk jkajlksdjflkajlksjdkajfkajk","+996555555555","Moskva st.234"),

        )



        adapter1 = CardsAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter1
        return binding.root

    }




}