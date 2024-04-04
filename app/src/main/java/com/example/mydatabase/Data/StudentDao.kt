package com.example.mydatabase.Data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {
    @Insert
    fun insertStudent(studentTable: StudentTable)

    @Query("Select * from 'StudentTable'")
    fun getAllStudents(): List<StudentTable>
}