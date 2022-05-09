package abika.sinau.mynoteappcompose.feature_note.domain.util


/**
 * @author by Abika Chairul Yusri on 5/10/2022
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
