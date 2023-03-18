package fr.iutgon.suballigatorsapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import fr.iutgon.suballigatorsapp.entities.Formation
import fr.iutgon.suballigatorsapp.entities.Initiator
import fr.iutgon.suballigatorsapp.entities.Session
import fr.iutgon.suballigatorsapp.entities.Student

@Database(
    entities = [Student::class, Session::class, Formation::class, Initiator::class],
    version = 1
)
abstract class AppBDD : RoomDatabase() {
    abstract fun studentDAO(): StudentDAO

    companion object {
        private var instance: AppBDD? = null

        fun getInstance(context: Context): AppBDD {
            if (instance == null)
                instance = Room.databaseBuilder(
                    context,
                    AppBDD::class.java, "modules.sqlite"
                ).build()
            return instance!!
        }
    }
}