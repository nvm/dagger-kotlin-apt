package dev.unick

import android.app.Application
import dagger.Binds
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Usage of component generated in apt through java ComponentProxy
        // val str = ComponentProxy().component.a().str

    }
}

interface IA {
    val str: String
}

class A @Inject constructor(
    override val str: String
) : IA

@Module
abstract class TestModule {

    @Singleton
    @Binds
    abstract fun s(a: A): IA

}

