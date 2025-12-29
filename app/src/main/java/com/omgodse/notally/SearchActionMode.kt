package com.omgodse.notally

import com.omgodse.notally.preferences.BetterLiveData

class SearchActionMode {

    val enabled = BetterLiveData(false)

    fun close() {
        enabled.value = false
    }
}