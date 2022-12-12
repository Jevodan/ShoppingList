package ru.jevo.shoppinglist.domain

/**
 * Created by Alex on 12.12.2022.
 */
class ShowShopElementUseCase(private val shopListRepository: ShopListRepository) {
    fun showElement(id: Int): ShopElement {
        return shopListRepository.showElement(id)
    }
}