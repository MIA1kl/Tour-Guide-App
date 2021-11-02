package com.android.tourguideapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.tourguideapp.adapters.CardsAdapter
import com.android.tourguideapp.databinding.FragmentSightseeingsBinding
import com.android.tourguideapp.models.Card

class MallsFragment : Fragment() {

    private lateinit var binding: FragmentSightseeingsBinding
    private lateinit var adapter1: CardsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSightseeingsBinding.inflate(layoutInflater)
        val placeList = mutableListOf<Card>(
            Card(1,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDxX7INknbnzfnktEu6fbTWrWqNPkfAfE8eh0LELvkIeoedGPhMAsgYrI8t4nkOZH3oT8&usqp=CAU","Bishkek Park","With a range of European and Turkish stores plus a decent top-floor food court and bowling alley, this is a popular hangout for local families.","0312 312 031","148 Киевская Бишкек","42.87482001787244, 74.59043576870998"),
            Card(2,"https://vesti.kg/media/k2/items/cache/420a20bfb35ba956ca4ec4e4ca2df67b_XL.jpg?t=20190506_092827","Asia Mall","Lively shopping and entertainment complex: clothing boutiques, supermarket, food court, cinema and indoor playground.","0551 890 040","3 просп. Мира, Бишкек","42.85585471352556, 74.58512651103794"),
            Card(3,"https://data.vb.kg/image/big/2016-06-22_09-53-31_329205.jpg","Tsum Center","A large shopping center with shops for cell phones and other electronics, as well as a food court.","0312 909 279","155 просп. Чуй, Бишкек","42.87622700874288, 74.61452269569605"),
            Card(4,"https://www.akchabar.kg/media/news/1d018325-bb5a-41db-8e32-46dce8bd3e0f.jpg.850x445_q82_crop.jpg","Dordoi-Plaza","Dordoi Plaza is a department store in Bishkek. Dordoi Plaza is situated northwest of Tokoldosh, close to Kyrgyz Opera and Ballet Theater.","0312 623 000","VJF9+XHV, Бишкек","42.87507510429466, 74.61894282638136"),
            Card(5,"https://media-cdn.tripadvisor.com/media/photo-s/12/a0/14/25/getlstd-property-photo.jpg","Vefa","VEFA is a modern comfortable business center for your business and leisure located in the very heart of the city.","0772 554 090","27, 1 Горький көчөсү, Бишкек","42.85777269729432, 74.60952502638071"),
            Card(6,"https://www.retailspace.kz/storage/objects/201712/1325031.1.1471946238.jpg","GUM Chynar Mall","Fancy place to go shopping - See traveler reviews, candid photos, and great deals for Bishkek, Kyrgyzstan, at Tripadvisor. ","0555 875 500","92 просп. Чуй, Бишкек","42.87571114057387, 74.61448992638138"),

        )



        adapter1 = CardsAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter1
        return binding.root

    }




}