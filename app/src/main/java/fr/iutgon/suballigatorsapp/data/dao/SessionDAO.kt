package fr.iutgon.suballigatorsapp.data.dao

import android.database.Cursor
import androidx.room.*
import fr.iutgon.suballigatorsapp.entities.Session

@Dao
interface SessionDAO {
    @Insert
    fun insert(vararg session: Session)

    @Delete
    fun delete(vararg session: Session)

    @Update
    fun update(vararg session: Session)

    @Query("SELECT * FROM sessions")
    fun getAll(): Cursor
}