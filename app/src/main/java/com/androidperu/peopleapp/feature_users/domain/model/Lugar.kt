package com.androidperu.peopleapp.feature_users.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Lugar(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "region") val LugReg: String,
    @ColumnInfo(name = "departamento") val LugDep: String,
    @ColumnInfo(name= "provincia") val LugPro: String,
    @ColumnInfo(name = "distrito") val LugDis: String,
)
