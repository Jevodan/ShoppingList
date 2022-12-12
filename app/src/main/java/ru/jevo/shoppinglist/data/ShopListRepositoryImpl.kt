package ru.jevo.shoppinglist.data

import ru.jevo.shoppinglist.domain.ShopElement
import ru.jevo.shoppinglist.domain.ShopListRepository

/**
 * Created by Alex on 12.12.2022.
 */
object ShopListRepositoryImpl : ShopListRepository {

    private val listShop = mutableListOf<ShopElement>()
    private var id = 0

    override fun addElement(shopElement: ShopElement) {
        if (shopElement.id == ShopElement.UNDEFINED_ID)
            shopElement.id = id++
        listShop.add(shopElement)
    }

    override fun editElement(shopElement: ShopElement) {
        val oldElement = showElement(shopElement.id)
        listShop.add(shopElement)
        addElement(shopElement)
    }

    override fun deleteElement(shopElement: ShopElement) {
        listShop.remove(shopElement)
    }

    override fun showElement(id: Int): ShopElement {
        return listShop.find {
            it.id == id
        } ?: throw Exception("айди $id не найден")
    }

    override fun showListElements(): List<ShopElement> {
        return listShop.toList()
    }
}