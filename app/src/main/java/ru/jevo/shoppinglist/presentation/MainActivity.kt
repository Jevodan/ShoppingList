package ru.jevo.shoppinglist.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import ru.jevo.shoppinglist.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this) {
            Log.d("Прилет", it.toString())
            if (count == 0) {
                count++
                viewModel.deleteElement(it[0])
                viewModel.editElement(it[1])
            }
        }
        //  viewModel.getShopList()
        // viewModel.deleteElement(el11)

    }
}