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

class HotelsFragment : Fragment() {

    private lateinit var binding: FragmentSightseeingsBinding
    private lateinit var adapter1: CardsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSightseeingsBinding.inflate(layoutInflater)
        val placeList = mutableListOf<Card>(
            Card(1,"https://content.r9cdn.net/rimg/himg/51/74/1b/ostrovok-6965648-9bb831e1091d70ff2e60166a0db6b2880c095090-899355.jpg?width=335&height=268&crop=true","Garden Hotel","Garden hotel Bishkek is a cozy hotel in the center of Bishkek. Convenient location of the hotel in a quiet area near the main street of the city of Baitik Baatyr, 15 minutes from the Central Department Store and central squares.","+996770978880","115 улица Медерова, Бишкек 720052","42.852468052538, 74.61474652638042"),
            Card(2,"https://cdn.hotels-scanner.com/224/22385/HI357455441.jpg","Hotel Futuro Bishkek","A find for those who are looking for comfortable hotels and hotels in Bishkek.","+996777986868","Удмуртская 13 Бишкек, 720022","42.87670844730842, 74.65446618405278"),
            Card(3,"https://content.r9cdn.net/rimg/himg/df/e2/ea/hotelsdotcom-910094976-0fcaff48_w-816079.jpg?width=335&height=268&crop=true&outputtype=webp","Club-Hotel Flagman","Best Price Guaranteed. Book Club Hotel Flagman, Bishkek. Instant confirmation. We speak your language. Free cancellation. Safe booking.","+996709670713","Логвиненко улице 139 Бишкек, 720000","42.89172752668679, 74.60022752638201"),
            Card(4,"https://media-cdn.tripadvisor.com/media/photo-s/03/9e/3d/39/golden-dragon-hotel.jpg","Golden Dragon Hotel","Welcome to the five-star hotel in Bishkek \"Golden Dragon\"! Located in close proximity to Manas airport and ten minutes from the city center, the hotel complex offers its clients a wide range of premium services.","+996312902771","60 ул. Мукая Элебаева, Бишкек 720005","42.851704485595846, 74.61296381103777"),
            Card(5,"https://media-cdn.tripadvisor.com/media/photo-s/10/6b/4d/5d/caption.jpg","Ambassador Hotel","\"Ambassador\" hotel is situated in the cultural and business center of Bishkek. In the immediate vicinity there are German, French, Japanese, Iranian, Turkish Embassies, a business center \"Russia\", BTA bank, offices of GIZ, UN, and many other international organizations. Ala-Too Square is just a 5-minute walk. ","+996312979898","32 ул. Орозбекова, Бишкек 720040","42.8693129809535, 74.60207765521683"),
            Card(6,"https://cf.bstatic.com/xdata/images/hotel/max1024x768/205835512.jpg?k=e8037f63739a56a2236757e11f0e7b8878a912635a48c4e2c27fd37fbc6d220f&o=&hp=1","Hotel Kausar","This peaceful hotel is located 2 km from the State Historical Museum and Panfilov Park, dating back to the 19th century. Manas International Airport is 26 km away.","+996550790850","51 Kurganskaya Street, Бишкек 720033","42.89469103956868, 74.5986227091897"),
        )

        adapter1 = CardsAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter1



        return binding.root
    }

}