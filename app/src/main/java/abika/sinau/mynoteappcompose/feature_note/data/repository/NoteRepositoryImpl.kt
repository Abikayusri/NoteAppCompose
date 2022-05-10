package abika.sinau.mynoteappcompose.feature_note.data.repository

import abika.sinau.mynoteappcompose.feature_note.data.data_source.NoteDao
import abika.sinau.mynoteappcompose.feature_note.domain.model.Note
import abika.sinau.mynoteappcompose.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */
class NoteRepositoryImpl(private val dao: NoteDao) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}