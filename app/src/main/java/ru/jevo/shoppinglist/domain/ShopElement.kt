package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
data class ShopElement(
    val name: String,
    val count: Int,
    val active: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
