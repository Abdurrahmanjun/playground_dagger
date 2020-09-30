package com.jun.playgrounddagger2.presentation.di.component

import android.app.Application
import android.content.Context
import com.jun.playgrounddagger2.presentation.PlaygroundDaggerApplication
import com.jun.playgrounddagger2.presentation.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent{

    fun inject(mPlaygroundDaggerApplication : PlaygroundDaggerApplication)
    fun context() : Context
    fun application() : Application

}