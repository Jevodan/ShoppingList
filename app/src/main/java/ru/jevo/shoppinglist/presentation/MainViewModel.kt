package ru.jevo.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import ru.jevo.shoppinglist.data.ShopListRepositoryImpl
import ru.jevo.shoppinglist.domain.DeleteShopElementUseCase
import ru.jevo.shoppinglist.domain.EditShopElementUseCase
import ru.jevo.shoppinglist.domain.ShopElement
import ru.jevo.shoppinglist.domain.ShowShopListElementsUseCase

/**
 * Created by Alex on 15.12.2022.
 */
class MainViewModel : ViewModel() {

    private val shopListRepository = ShopListRepositoryImpl
    val shopList = MutableLiveData<List<ShopElement>>()

    val showList = ShowShopListElementsUseCase(shopListRepository)
    val editElement = EditShopElementUseCase(shopListRepository)
    val deleteElement = DeleteShopElementUseCase(shopListRepository)

    fun getShopList() {
        val list = showList.showListElements()
        shopList.setValue(list)
    }

    fun deleteElement(element: ShopElement) {
        deleteElement.deleteElement(element)
        getShopList()
    }

    fun editElement(element: ShopElement) {
        val newElement = element.copy(active = !element.active)
        editElement.editElement(newElement)
        getShopList()
    }
}