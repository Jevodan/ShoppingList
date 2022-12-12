package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
class EditShopElementUseCase(private val shopListRepository: ShopListRepository) {
    fun editElement(shopElement: ShopElement) {
        shopListRepository.editElement(shopElement)
    }
}