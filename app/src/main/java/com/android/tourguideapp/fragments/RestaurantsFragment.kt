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

class RestaurantsFragment : Fragment() {
    private lateinit var binding: FragmentSightseeingsBinding
    private lateinit var adapter1: CardsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSightseeingsBinding.inflate(layoutInflater)
        val placeList = mutableListOf<Card>(
            Card(1,"https://media-cdn.tripadvisor.com/media/photo-s/19/f2/b7/cd/the-entrance.jpg","La Maison","The extraordinary atmosphere, high-quality service, and delicious foods made La Maison the top restaurant in Bishkek. From the French beef burger to wild smoked salmon, you can find the well-prepared meals there. The restaurant welcomes guests every day, mostly from 12.00 PM to 9.45 PM.","+996312884621","67/4 ул. Матросова, Бишкек","42.847097070358224, 74.61857973987327"),
            Card(2,"https://media-cdn.tripadvisor.com/media/photo-s/14/8f/59/35/interiors.jpg","Furusato","Best restaurant in Bishkek and the best japanese I have been. It seems to be in Japan and food is delicious. There a great variety of Sushi and ramen. Waiters speak english so it is easy to order. This is a must in Bishkek.","0554 400 633","132 ул. Боконбаева, Бишкек","42.86710256859816, 74.60112832453135"),
            Card(3,"https://supara.kg/wp-content/uploads/2017/03/slide-last.png","Ethno-Complex Supara","What a lovely restaurant, good food and service and atmosphere. This delightful though somewhat contrived 'ethno' complex is a rapid-fire presentation of all things traditionally Kyrgyz, attracting mainly well-heeled urban locals.","0312 465 051","1 ул. Карагул Акмат, Бишкек","42.79730030000632, 74.64959482822813"),
            Card(4,"https://navat.kg/wp-content/uploads/2017/12/NAVAT4-1.jpg","NAVAT","This is a great restaurant to taste traditional Kyrgysz food. Food is really tasty and staff is kind and speaks english. ","0551 531 111","55 ул. Байтик баатыра, Бишкек","42.85779413249116, 74.61058735521637"),
            Card(5,"https://arzu.kg/static/images/content/restaurant-1.jpg","Arzu","Great service, great food!!Located in the city center next to a large building, and a football field. A very calm place, you can relax in it after a hard day.","+996550696697","VHHW+8HW, Бишкек","42.878508658692986, 74.59648605521721"),
            Card(6,"https://www.faiza.kg/media/info/gallery/about-us-banner_vnzHtUh.jpg","Cafe Faiza","Faiza is like a local diner. The place is not trying to impress anyone with its interior decor. It is everything that you get for the price that you are paying. Average food but it is always consistent in its quality.","+996555324921","Жибек Жолу 555 Бишкек, 720033","42.88454040541194, 74.58712911103905"),
        )

        adapter1 = CardsAdapter(placeList)

        val layoutManager = LinearLayoutManager(view?.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter1



        return binding.root
    }

}