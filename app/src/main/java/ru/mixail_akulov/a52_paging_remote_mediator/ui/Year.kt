package ru.mixail_akulov.a52_paging_remote_mediator.ui

import android.content.Context
import ru.mixail_akulov.a52_paging_remote_mediator.R

class Year(
    val value: Int?,
    private val message: String
) {

    constructor(context: Context, year: Int?) : this(
        value = year,
        message = year?.toString() ?: context.getString(R.string.all)
    )

    override fun toString(): String {
        return message
    }
}
