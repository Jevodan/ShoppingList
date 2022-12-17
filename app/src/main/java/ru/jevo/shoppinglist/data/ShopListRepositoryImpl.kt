package ru.jevo.shoppinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.jevo.shoppinglist.domain.ShopElement
import ru.jevo.shoppinglist.domain.ShopListRepository

/**
 * Created by Alex on 12.12.2022.
 */
object ShopListRepositoryImpl : ShopListRepository {

    val listLD = MutableLiveData<List<ShopElement>>()
    val listShop = mutableListOf<ShopElement>()
    private var id = 0

    init {
        for (i in 0 until 10) {
            val el = ShopElement("товар $i", 1, true, i)
            listShop.add(el)
        }
    }

    override fun addElement(shopElement: ShopElement) {
        if (shopElement.id == ShopElement.UNDEFINED_ID)
            shopElement.id = id++
        listShop.add(shopElement)
        updateListLD()
    }

    override fun editElement(shopElement: ShopElement) {
        val oldElement = showElement(shopElement.id)
        listShop.remove(shopElement)
        addElement(shopElement)
    }

    override fun deleteElement(shopElement: ShopElement) {
        listShop.remove(shopElement)
        updateListLD()
    }

    override fun showElement(id: Int): ShopElement {
        return listShop.find {
            it.id == id
        } ?: throw Exception("айди $id не найден")
    }

    override fun showListElements(): LiveData<List<ShopElement>> {
        updateListLD()
        return listLD
    }

    fun updateListLD() {
        listLD.value = listShop.toList()
    }
}