package com.example.android.hilt.di.database

import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.data.LoggerInMemoryDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

/**
 * Created by Uddhav P. Gautam <upgautam@ualr.edu> on 6/4/2021.
 */

//injects (collects) dependencies inside ActivityComponent closure (or class)
// this kind of collection of dependencies is done by module. hence @Module annotation

@InstallIn(ActivityComponent::class)
@Module
abstract class LoggingInMemoryModule {


    //bindInMemoryLogger is an arbitrary name, you can give your own function name here
    //in method you pass instance that returns Interface Type, that passed impl of type
    //LoggerDataSource is bound to Hilt framework, which lifecycle is ActivityScoped, and is
    //InMemoryLogger -- InMemoryLogger is one of among two types of LoggerDataSource, so we
    //provided arbitrary name InMemoryLogger to distinguish them inside Hilt framework because
    // there could be other LoggerDataSource instance

    //for abstract method having one parameter, you must use @Binds
    //In @Binds you don't need to know whatever way the return instance (loggerDataSource) is instantiated
    //@Binds is fully being dependent on Hilt framework, requesting like whatever is there I need that

    @ActivityScoped
    @InMemoryLogger
    @Binds
    abstract fun bindInMemoryLogger(impl: LoggerInMemoryDataSource): LoggerDataSource
}