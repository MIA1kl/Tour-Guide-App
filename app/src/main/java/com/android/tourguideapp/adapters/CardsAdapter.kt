package com.android.tourguideapp.adapters

import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.tourguideapp.R
import com.android.tourguideapp.databinding.ItemCardBinding
import com.android.tourguideapp.models.Card
import com.bumptech.glide.Glide
import android.content.Intent
import android.net.Uri


class CardsAdapter(private val cards: List<Card>) : RecyclerView.Adapter<CardsAdapter.CardsViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCardBinding.inflate(inflater, parent,false)

        binding.moreImageViewButton.setOnClickListener {
            if (binding.expandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(binding.categoryItem, AutoTransition())
                binding.moreImageViewButton.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24)
                binding.expandableLayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(binding.categoryItem, AutoTransition())
                binding.moreImageViewButton.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
                binding.expandableLayout.visibility = View.GONE
            }

        binding.number.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + binding.number.text)
            it.context.startActivity(dialIntent)
        }

        binding.address.setOnClickListener{
            val gmmIntentUri = Uri.parse("geo:"+binding.geo.text)
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            it.context.startActivity(mapIntent)
        }

        }


        return CardsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardsViewHolder, position: Int) {
        val card = cards[position]
        with(holder.binding){
            holder.itemView.tag = card
            moreImageViewButton.tag = card
            cardId.tag = card
            expandableLayout.tag = card
            categoryItem.tag = card
            cardNameTextView.text = card.name
            info.text = card.info
            number.text = card.phone
            address.text = card.address
            geo.text = card.geo


            if (card.photo.isNotBlank()){
                Glide.with(photoImageView.context)
                    .load(card.photo)
                    .placeholder(R.drawable.ic_baseline_image_24)
                    .error(R.drawable.ic_baseline_image_24)
                    .into(photoImageView)
            }else{
                Glide.with(photoImageView.context).clear(photoImageView)
                photoImageView.setImageResource(R.drawable.ic_baseline_image_24)
            }
        }
    }

    override fun getItemCount(): Int = cards.size

    class CardsViewHolder(
        val binding: ItemCardBinding
    ) : RecyclerView.ViewHolder(binding.root)

}