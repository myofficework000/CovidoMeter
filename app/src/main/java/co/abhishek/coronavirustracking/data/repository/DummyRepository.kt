package co.abhishek.coronavirustracking.data.repository

import androidx.lifecycle.LiveData
import co.abhishek.coronavirustracking.data.database.model.DummyEntity
import co.abhishek.coronavirustracking.data.database.dao.DummyDao
import co.abhishek.coronavirustracking.data.network.category.DummyApi

class DummyRepository(
    private val dummyDao: DummyDao,
    private val dummyService: DummyApi
) {

    fun getAll(): LiveData<List<DummyEntity>> = dummyDao.getAll()

    suspend fun fetchAll(): List<DummyEntity> {
        val list = mutableListOf<DummyEntity>()

        val response = dummyService.fetchAll()

        if (response.isSuccessful) {
            response.body()?.let {
                list.addAll(it)
            }
        }

        return list
    }

    suspend fun save(entities: List<DummyEntity>) = dummyDao.save(entities)
}
