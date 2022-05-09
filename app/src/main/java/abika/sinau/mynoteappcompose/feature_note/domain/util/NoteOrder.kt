package abika.sinau.mynoteappcompose.feature_note.domain.util


/**
 * @author by Abika Chairul Yusri on 5/10/2022
 */
sealed class NoteOrder (val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)
}
