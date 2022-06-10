package com.androidperu.peopleapp.feature_users.domain.repository

import com.androidperu.peopleapp.feature_users.domain.model.Lugar
import com.androidperu.peopleapp.feature_users.domain.model.User
import kotlinx.coroutines.flow.Flow

interface LugarRepository {
    fun getLugares(): Flow<List<Lugar>>

    suspend fun getLugarById(id: Int): Lugar?

    suspend fun insertLugar(lugar: Lugar)

    suspend fun deleteLugar(lugar: Lugar)
}