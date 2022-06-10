package com.androidperu.peopleapp.feature_users.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Gimnasio(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "gim_nombre")val GimNom: String,
    @ColumnInfo(name = "gim_distrito") val GimDis: String,
    @ColumnInfo(name = "horario_disponible") val GimHorDis: String,
    @ColumnInfo(name = "contacto") val GimCon: String,
)
