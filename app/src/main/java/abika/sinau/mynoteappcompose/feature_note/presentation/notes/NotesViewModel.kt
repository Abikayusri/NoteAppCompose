package abika.sinau.mynoteappcompose.feature_note.presentation.notes

import abika.sinau.mynoteappcompose.feature_note.domain.use_case.NoteUseCase
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * @author by Abika Chairul Yusri on 5/10/2022
 */

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
) : ViewModel() {

}