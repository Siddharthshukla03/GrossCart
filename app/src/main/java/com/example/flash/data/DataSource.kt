package com.example.flash.data
import androidx.annotation.StringRes
import com.example.flash.R
object DataSource {
    fun loadCategories(): List<Categories>{
        return listOf<Categories>(
            Categories(stringResourceId= R.string.fresh_fruits, R.drawable.fruits),
            Categories(R.string.bath_body, R.drawable.bath_body),
            Categories(R.string.munchies, R.drawable.munchies),
            Categories(R.string.bread_biscuits, R.drawable.bread),
            Categories(R.string.cleaning_essentials, R.drawable.bath_body),
            Categories(R.string.beverages, R.drawable.beverages),
            Categories(R.string.kitchen_essentials,R.drawable.kitchen),
            Categories(R.string.stationary,R.drawable.stationaries),
            Categories(R.string.pet_food,R.drawable.pet_food),
            Categories(R.string.packaged_food,R.drawable.packaged_food),
            Categories(R.string.sweet_tooth,R.drawable.sweets),
            Categories(R.string.vegetables,R.drawable.vegetables)
        )
    }
    fun loadItems(
        @StringRes categoryName: Int
    ): List<Item> {
        return listOf(
            Item(R.string.banana_robusta,R.string.fresh_fruits, "1 kg", 100, R.drawable.banana),
            Item(R.string.papaya_semi_ripe,R.string.fresh_fruits,"1 kg", 250,R.drawable.papaya),
            Item(R.string.shimla_apple,R.string.fresh_fruits,"1 kg",140,R.drawable.apples),
            Item(R.string.pineapple,R.string.fresh_fruits,"1 kg",200,R.drawable.pineapple),
            Item(R.string.pomgranate,R.string.fresh_fruits,"1 kg",120,R.drawable.pomgranate),
            Item(R.string.pepsi_can,R.string.beverages,"1",40,R.drawable.pepsi)
        ).filter{
            it.itemCategoryId == categoryName
        }

    }
}