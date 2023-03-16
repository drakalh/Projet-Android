package fr.iutgon.suballigatorsapp.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Student {
    @PrimaryKey var id: Int = 0

    var lastname: String = ""
    var firstname: String = ""
    var formationId: Int = 0
    var studentDeleted: Int = 0
}