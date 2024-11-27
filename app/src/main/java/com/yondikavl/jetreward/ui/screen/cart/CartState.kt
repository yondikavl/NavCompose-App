package com.yondikavl.jetreward.ui.screen.cart

import com.yondikavl.jetreward.model.OrderReward

data class CartState(
    val orderReward: List<OrderReward>,
    val totalRequiredPoint: Int
)