package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
class AddShopElementUseCase(private val shopListRepository: ShopListRepository) {
    fun addElement(shopElement: ShopElement) {
        shopListRepository.addElement(shopElement)
    }
}