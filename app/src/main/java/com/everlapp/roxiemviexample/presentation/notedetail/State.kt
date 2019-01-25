package com.everlapp.roxiemviexample.presentation.notedetail

import com.everlapp.roxiemviexample.domain.Note
import com.ww.roxie.BaseState

data class State(

    val note: Note? = null,
    val isIdle: Boolean = false,
    val isLoading: Boolean = false,
    val isLoadError: Boolean = false,
    val isNoteDeleted: Boolean = false,
    val isDeleteError: Boolean = false

) : BaseState