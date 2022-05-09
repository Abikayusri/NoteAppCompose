package abika.sinau.mynoteappcompose.feature_note.domain.use_case

import abika.sinau.mynoteappcompose.feature_note.domain.model.Note
import abika.sinau.mynoteappcompose.feature_note.domain.repository.NoteRepository


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */
class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}