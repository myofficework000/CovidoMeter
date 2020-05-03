package co.abhishek.coronavirustracking.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import co.abhishek.coronavirustracking.data.database.converter.EntryConverter
import co.abhishek.coronavirustracking.data.database.converter.ListStringTypeConverter
import co.abhishek.coronavirustracking.data.database.dao.DummyDao
import co.abhishek.coronavirustracking.data.database.dao.arcgis.S3CoronaDao
import co.abhishek.coronavirustracking.data.database.dao.chnasia.S1CoronaDao
import co.abhishek.coronavirustracking.data.database.dao.jhu.S2CoronaDao
import co.abhishek.coronavirustracking.data.database.dao.worldometers.S4CoronaDao
import co.abhishek.coronavirustracking.data.database.model.DummyEntity
import co.abhishek.coronavirustracking.data.database.model.arcgis.S3CoronaEntity
import co.abhishek.coronavirustracking.data.database.model.chnasia.S1CoronaEntity
import co.abhishek.coronavirustracking.data.database.model.chnasia.S1CountryCoordEntity
import co.abhishek.coronavirustracking.data.database.model.jhu.S2CoronaEntity
import co.abhishek.coronavirustracking.data.database.model.worldometers.S4CoronaEntity

@Database(
    entities = [DummyEntity::class,
        S1CountryCoordEntity::class,
        S1CoronaEntity::class,
        S2CoronaEntity::class,
        S3CoronaEntity::class,
        S4CoronaEntity::class],
    version = 11,
    exportSchema = false
)
@TypeConverters(EntryConverter::class, ListStringTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dummyDao(): DummyDao
    abstract fun coronaDao1(): S1CoronaDao
    abstract fun coronaDao2(): S2CoronaDao
    abstract fun coronaDao3(): S3CoronaDao
    abstract fun coronaDao4(): S4CoronaDao
}