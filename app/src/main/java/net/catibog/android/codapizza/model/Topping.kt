package net.catibog.android.codapizza.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import net.catibog.android.codapizza.R

enum class Topping(
    @StringRes val toppingName: Int,
    @DrawableRes val pizzaOverlayImage: Int
) {
    Basil(
        toppingName = R.string.topping_basil,
        pizzaOverlayImage = R.drawable.topping_basil
    ),
    Mushroom(
        toppingName = R.string.topping_mushroom,
        pizzaOverlayImage = R.drawable.topping_mushroom
    ),
    Olive(
        toppingName = R.string.topping_olive,
        pizzaOverlayImage = R.drawable.topping_olive
    ),
    Pepperoni(
        toppingName = R.string.topping_pepperoni,
        pizzaOverlayImage = R.drawable.topping_pepperoni
    ),
    Peppers(
        toppingName = R.string.topping_peppers,
        pizzaOverlayImage = R.drawable.topping_peppers
    ),
    Pineapple(
        toppingName = R.string.topping_pineapple,
        pizzaOverlayImage = R.drawable.topping_pineapple
    )
}