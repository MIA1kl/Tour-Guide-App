package com.android.tourguideapp

import android.app.Application
import com.android.tourguideapp.models.CardsService

class App : Application() {
    val cardsService= CardsService()
}