package com.androidperu.peopleapp.feature_users.domain.repository

import com.androidperu.peopleapp.feature_users.domain.model.Gimnasio
import com.androidperu.peopleapp.feature_users.domain.model.User
import kotlinx.coroutines.flow.Flow

interface GimnasioRepository {
    fun getGimnasios(): Flow<List<Gimnasio>>

    suspend fun getGimnasioById(id: Int): Gimnasio?

    suspend fun insertGimnasio(gimnasio: Gimnasio)

    suspend fun deleteGimnasio(gimnasio: Gimnasio)
}