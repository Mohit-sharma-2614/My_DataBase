package com.example.mydatabase.Data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [StudentTable::class],
    version = 1,
    exportSchema = false
)
abstract class StudentDB : RoomDatabase() {
    abstract val studentDao: StudentDao
}
//Now we have to make a singlatone class for managing the database so we have not to make instances of database
//every time we want