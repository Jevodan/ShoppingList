package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
data class ShopElement(
    val id: Int,
    val name: String,
    val count: Int,
    val active: Boolean
)
