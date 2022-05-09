package abika.sinau.mynoteappcompose.feature_note.domain.model

import abika.sinau.mynoteappcompose.ui.theme.*
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * @author by Abika Chairul Yusri on 5/9/2022
 */

@Entity
data class Note(
    @PrimaryKey
    val id: Int ? = null,

    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int
) {
    companion object {
        val notesColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
