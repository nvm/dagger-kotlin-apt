package dev.unick

import android.app.Application
import dagger.Binds
import dagger.Module
import javax.inject.Inject

class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}

interface IA {
    val str: String
}

class A @Inject constructor() : IA {

    override val str: String
        get() = "test"
}

@Module
abstract class TestModule {

    @Binds
    abstract fun s(a: A): IA

}

