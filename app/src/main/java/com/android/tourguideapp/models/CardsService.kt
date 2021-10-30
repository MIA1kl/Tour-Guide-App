package com.android.tourguideapp.models
import com.github.javafaker.Faker
import java.util.*

typealias CardsListener = (cards: List<Card>) -> Unit

class CardsService {
    private var cards = mutableListOf<Card>()
    private val listeners = mutableSetOf<CardsListener>()


    fun getCards(): List<Card>{
        return cards
    }

    fun addListener(listener: CardsListener) {
        listeners.add(listener)
        listener.invoke(cards)
    }

    fun removeListener(listener: CardsListener) {
        listeners.remove(listener)
    }

    private fun notifyChanges() {
        listeners.forEach { it.invoke(cards) }
    }

}