package com.everlapp.roxiemviexample.presentation.notelist

import com.everlapp.roxiemviexample.domain.Note

sealed class Change {

    object Loading : Change()
    data class Notes(val notes: List<Note>) : Change()
    data class Error(val throwable: Throwable?) : Change()

}