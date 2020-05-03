package co.abhishek.coronavirustracking.injection

import org.koin.dsl.module
import java.util.*

val appModule = module {
    single { provideCalendar() }
}

private fun provideCalendar() = Calendar.getInstance()
