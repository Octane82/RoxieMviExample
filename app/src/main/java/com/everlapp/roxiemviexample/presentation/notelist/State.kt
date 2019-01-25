package com.everlapp.roxiemviexample.presentation.notelist

import com.everlapp.roxiemviexample.domain.Note
import com.ww.roxie.BaseState

data class State(

    val notes: List<Note> = listOf(),
    val isIdle: Boolean = false,
    val isLoading: Boolean = false,
    val isError: Boolean = false

) : BaseState