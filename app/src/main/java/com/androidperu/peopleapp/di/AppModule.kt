package com.androidperu.peopleapp.di

import android.app.Application
import androidx.room.Room
import com.androidperu.peopleapp.feature_users.data.repository.GimnasioRepositoryImpl
import com.androidperu.peopleapp.feature_users.data.repository.LugarRepositoryImpl
import com.androidperu.peopleapp.feature_users.data.repository.UserRepositoryImpl
import com.androidperu.peopleapp.feature_users.data.source.local.GimnasioDatabase
import com.androidperu.peopleapp.feature_users.data.source.local.LugarDatabase
import com.androidperu.peopleapp.feature_users.data.source.local.UserDatabase
import com.androidperu.peopleapp.feature_users.domain.repository.GimnasioRepository
import com.androidperu.peopleapp.feature_users.domain.repository.LugarRepository
import com.androidperu.peopleapp.feature_users.domain.repository.UserRepository
import com.androidperu.peopleapp.utils.DATABASE_GIMNASIO
import com.androidperu.peopleapp.utils.DATABASE_LUGAR
import com.androidperu.peopleapp.utils.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserDatabase(app: Application) = Room.databaseBuilder(
        app,
        UserDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRepository(db: UserDatabase): UserRepository {
        return UserRepositoryImpl(db.userDao)
    }

    @Provides
    @Singleton
    fun provideLugarDatabase(app: Application) = Room.databaseBuilder(
        app,
        LugarDatabase::class.java,
        DATABASE_LUGAR
    ).build()

    @Provides
    @Singleton
    fun provideLugarRepository(db: LugarDatabase): LugarRepository {
        return LugarRepositoryImpl(db.lugarDao)
    }

    @Provides
    @Singleton
    fun provideGimnasioDatabase(app: Application) = Room.databaseBuilder(
        app,
        GimnasioDatabase::class.java,
        DATABASE_GIMNASIO
    ).build()

    @Provides
    @Singleton
    fun provideGimnasioRepository(db: GimnasioDatabase): GimnasioRepository {
        return GimnasioRepositoryImpl(db.gimnasioDao)
    }
}