package com.androidperu.peopleapp.feature_users.data.repository

import com.androidperu.peopleapp.feature_users.data.source.local.dao.LugarDao
import com.androidperu.peopleapp.feature_users.data.source.local.dao.UserDao
import com.androidperu.peopleapp.feature_users.domain.model.Lugar
import com.androidperu.peopleapp.feature_users.domain.model.User
import com.androidperu.peopleapp.feature_users.domain.repository.LugarRepository
import com.androidperu.peopleapp.feature_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LugarRepositoryImpl @Inject constructor(
    private val dao: LugarDao
): LugarRepository {
    override fun getLugares(): Flow<List<Lugar>> {
        return dao.getLugares()
    }

    override suspend fun getLugarById(id: Int): Lugar? {
        return dao.getLugarById(id)
    }

    override suspend fun insertLugar(lugar: Lugar) {
        dao.insertLugar(lugar)
    }

    override suspend fun deleteLugar(lugar: Lugar) {
        dao.deleteLugar(lugar)
    }
}