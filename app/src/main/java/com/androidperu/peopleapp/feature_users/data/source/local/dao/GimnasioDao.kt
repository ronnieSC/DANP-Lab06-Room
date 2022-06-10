package com.androidperu.peopleapp.feature_users.data.source.local.dao

import androidx.room.*
import com.androidperu.peopleapp.feature_users.domain.model.Gimnasio
import com.androidperu.peopleapp.feature_users.domain.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface GimnasioDao {
    @Query("SELECT * FROM Gimnasio")
    fun getGimnasios(): Flow<List<Gimnasio>>

    @Query("SELECT * FROM Gimnasio WHERE id = :id")
    suspend fun getGimnasioById(id: Int): Gimnasio?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGimnasio(gimnasio: Gimnasio)

    @Delete
    suspend fun deleteGimnasio(gimnasio: Gimnasio)
}