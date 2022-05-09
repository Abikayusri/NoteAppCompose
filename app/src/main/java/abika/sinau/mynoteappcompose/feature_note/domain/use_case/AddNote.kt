package abika.sinau.mynoteappcompose.feature_note.domain.use_case

import abika.sinau.mynoteappcompose.feature_note.domain.model.InvalidNoteException
import abika.sinau.mynoteappcompose.feature_note.domain.model.Note
import abika.sinau.mynoteappcompose.feature_note.domain.repository.NoteRepository


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */
class AddNote (private val repository: NoteRepository) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}