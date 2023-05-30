package presentation.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


class HiltApplication {
    @HiltAndroidApp
    class HiltApplication : Application()
}