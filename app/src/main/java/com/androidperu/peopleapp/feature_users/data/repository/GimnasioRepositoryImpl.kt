package com.androidperu.peopleapp.feature_users.data.repository

import com.androidperu.peopleapp.feature_users.data.source.local.dao.GimnasioDao
import com.androidperu.peopleapp.feature_users.data.source.local.dao.UserDao
import com.androidperu.peopleapp.feature_users.domain.model.Gimnasio
import com.androidperu.peopleapp.feature_users.domain.model.User
import com.androidperu.peopleapp.feature_users.domain.repository.GimnasioRepository
import com.androidperu.peopleapp.feature_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GimnasioRepositoryImpl @Inject constructor(
    private val dao: GimnasioDao
): GimnasioRepository {
    override fun getGimnasios(): Flow<List<Gimnasio>> {
        return dao.getGimnasios()
    }

    override suspend fun getGimnasioById(id: Int): Gimnasio? {
       return dao.getGimnasioById(id)
    }

    override suspend fun insertGimnasio(gimnasio: Gimnasio) {
        dao.insertGimnasio(gimnasio)
    }

    override suspend fun deleteGimnasio(gimnasio: Gimnasio) {
        dao.deleteGimnasio(gimnasio)
    }
}