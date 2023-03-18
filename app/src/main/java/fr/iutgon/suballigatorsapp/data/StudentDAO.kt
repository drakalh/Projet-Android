package fr.iutgon.suballigatorsapp.data

import androidx.room.Dao
import androidx.room.Insert
import fr.iutgon.suballigatorsapp.entities.Student

@Dao
interface StudentDAO {
    @Insert
    fun insert(vararg student: Student)

    @Insert
    fun insertOne(student: Student): Int
}