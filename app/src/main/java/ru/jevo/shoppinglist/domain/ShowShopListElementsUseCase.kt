package ru.jevo.shoppinglist.domain

import androidx.lifecycle.LiveData

/**
 * Created by Alex on 12.12.2022.
 */
class ShowShopListElementsUseCase(private val shopListRepository: ShopListRepository) {

    fun showListElements(): LiveData<List<ShopElement>> {
       return shopListRepository.showListElements()
    }
}