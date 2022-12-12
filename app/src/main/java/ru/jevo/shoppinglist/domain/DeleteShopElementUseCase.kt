package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
class DeleteShopElementUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteElement(shopElement: ShopElement) {
        shopListRepository.deleteElement(shopElement)
    }
}