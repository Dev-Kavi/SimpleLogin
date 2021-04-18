package com.example.simplelogin.di

import android.content.Context
import com.example.simplelogin.di.modules.RoomModule
import com.example.simplelogin.di.modules.ViewModelModule
import com.example.simplelogin.viewmodel.ViewModelBuilder
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelModule::class,
        RoomModule::class,
        ViewModelBuilder::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }


}