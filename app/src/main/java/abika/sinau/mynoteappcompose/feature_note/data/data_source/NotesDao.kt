package abika.sinau.mynoteappcompose.feature_note.data.data_source

import abika.sinau.mynoteappcompose.feature_note.domain.model.Note
import androidx.room.*
import kotlinx.coroutines.flow.Flow


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */

@Dao
interface NotesDao {

    @Query("SELECT * FROM note")
    fun getNotes() : Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}