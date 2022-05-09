package abika.sinau.mynoteappcompose.feature_note.domain.use_case


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */
data class NoteUseCase(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)