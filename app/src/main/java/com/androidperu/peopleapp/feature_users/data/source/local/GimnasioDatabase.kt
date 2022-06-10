package com.androidperu.peopleapp.feature_users.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androidperu.peopleapp.feature_users.data.source.local.dao.GimnasioDao
import com.androidperu.peopleapp.feature_users.data.source.local.dao.UserDao
import com.androidperu.peopleapp.feature_users.domain.model.Gimnasio
import com.androidperu.peopleapp.feature_users.domain.model.User

@Database(
    entities = [Gimnasio::class],
    version = 1,
    exportSchema = false
)
abstract class GimnasioDatabase: RoomDatabase() {
    abstract val gimnasioDao: GimnasioDao
}