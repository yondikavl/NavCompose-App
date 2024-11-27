package com.yondikavl.jetreward.di

import com.yondikavl.jetreward.data.RewardRepository


object Injection {
    fun provideRepository(): RewardRepository {
        return RewardRepository.getInstance()
    }
}