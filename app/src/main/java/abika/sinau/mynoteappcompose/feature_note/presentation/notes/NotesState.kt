package abika.sinau.mynoteappcompose.feature_note.presentation.notes

import abika.sinau.mynoteappcompose.feature_note.domain.model.Note
import abika.sinau.mynoteappcompose.feature_note.domain.util.NoteOrder
import abika.sinau.mynoteappcompose.feature_note.domain.util.OrderType


/**
 * @author by Abika Chairul Yusri on 5/10/2022
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)