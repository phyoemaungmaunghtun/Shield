package mm.com.phyoeMaung.frameStructure

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application:Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
         lateinit var context: Context
    }
}