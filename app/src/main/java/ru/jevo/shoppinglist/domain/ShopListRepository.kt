package ru.jevo.shoppinglist.domain

import androidx.lifecycle.LiveData

/**
 * Created by Alex on 12.12.2022.
 */
interface ShopListRepository {

    fun addElement(shopElement: ShopElement)
    fun editElement(shopElement: ShopElement)
    fun deleteElement(shopElement: ShopElement)
    fun showElement(id: Int): ShopElement
    fun showListElements(): LiveData<List<ShopElement>>

}