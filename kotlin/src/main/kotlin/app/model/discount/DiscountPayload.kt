package app.model.discount

import app.model.Item
import app.model.User

data class DiscountPayload(val user: User, val item: Item)