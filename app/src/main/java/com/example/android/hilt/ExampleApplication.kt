package com.example.android.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel

//hilt is all static and compile time (compile time code generation) framework unlike Google Guice
// which is runtime (reflection based) framework

@HiltAndroidApp
class ExampleApplication : Application() {}
