package net.catibog.android.codapizza.model

import androidx.annotation.StringRes
import net.catibog.android.codapizza.R

enum class Topping(
    @StringRes val toppingName: Int
) {
    Basil(toppingName = R.string.topping_basil),
    Mushroom(toppingName = R.string.topping_mushroom),
    Olive(toppingName = R.string.topping_olive),
    Pepperoni(toppingName = R.string.topping_pepperoni),
    Peppers(toppingName = R.string.topping_peppers),
    Pineapple(toppingName = R.string.topping_pineapple)
}