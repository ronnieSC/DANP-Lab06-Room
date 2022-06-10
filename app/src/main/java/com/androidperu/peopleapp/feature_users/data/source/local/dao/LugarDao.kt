package com.androidperu.peopleapp.feature_users.data.source.local.dao

import androidx.room.*
import com.androidperu.peopleapp.feature_users.domain.model.Lugar
import com.androidperu.peopleapp.feature_users.domain.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface LugarDao {
    @Query("SELECT * FROM Lugar")
    fun getLugares(): Flow<List<Lugar>>

    @Query("SELECT * FROM Lugar WHERE id = :id")
    suspend fun getLugarById(id: Int): Lugar?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLugar(lugar: Lugar)

    @Delete
    suspend fun deleteLugar(lugar: Lugar)
}