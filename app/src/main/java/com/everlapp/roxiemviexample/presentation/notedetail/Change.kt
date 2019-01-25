package com.everlapp.roxiemviexample.presentation.notedetail

import com.everlapp.roxiemviexample.domain.Note

sealed class Change {

    object Loading : Change()
    data class NoteDetail(val note: Note) : Change()
    data class NoteLoadError(val throwable: Throwable?) : Change()
    object NoteDeleted : Change()
    data class NoteDeleteError(val throwable: Throwable?) : Change()

}