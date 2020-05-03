package co.abhishek.coronavirustracking.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import co.abhishek.coronavirustracking.data.database.model.DummyEntity

@Dao
interface DummyDao : BaseDao<DummyEntity> {

    @Query("SELECT * FROM DummyEntity")
    fun getAll(): LiveData<List<DummyEntity>>

}