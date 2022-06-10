package com.androidperu.peopleapp.feature_users.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androidperu.peopleapp.feature_users.data.source.local.dao.LugarDao
import com.androidperu.peopleapp.feature_users.data.source.local.dao.UserDao
import com.androidperu.peopleapp.feature_users.domain.model.Lugar
import com.androidperu.peopleapp.feature_users.domain.model.User

@Database(
    entities = [Lugar::class],
    version = 1,
    exportSchema = false
)
abstract class LugarDatabase: RoomDatabase() {
    abstract val lugarDao: LugarDao
}