package com.example.simplelogin.di.modules

import androidx.room.Room
import com.example.simplelogin.App
import com.example.simplelogin.di.RoomSimple
import com.example.simplelogin.room.SimpleRoom

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {

    @Provides
    @Singleton
    @RoomSimple
    fun provideSimpleDatabase(): SimpleRoom {
        return Room.databaseBuilder(
            App.appContext,
            SimpleRoom::class.java,
            "simple_database"
        ).build()
    }

    @Provides
    fun provideDatabase(@RoomSimple database: SimpleRoom): SimpleRoom = database
}