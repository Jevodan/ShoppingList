package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
class ShowShopListElementsUseCase(private val shopListRepository: ShopListRepository) {

    fun showListElements(): List<ShopElement> {
       return shopListRepository.showListElements()
    }
}