package co.abhishek.coronavirustracking.injection

import co.abhishek.coronavirustracking.ui.feature.mainscreen.MainActivityViewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory { MainActivityViewModel(get(), get(), get(), get()) }
}