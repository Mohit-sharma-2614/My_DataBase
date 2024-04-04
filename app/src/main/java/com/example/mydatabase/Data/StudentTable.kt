package com.example.mydatabase.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentTable(
     var name: String,
     @PrimaryKey(autoGenerate = true)
     var id: Int = 0
 )