package abika.sinau.mynoteappcompose.feature_note.data.data_source

import abika.sinau.mynoteappcompose.feature_note.domain.model.Note
import androidx.room.Database
import androidx.room.RoomDatabase


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}