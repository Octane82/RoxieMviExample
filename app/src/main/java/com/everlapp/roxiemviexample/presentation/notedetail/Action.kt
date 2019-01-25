package com.everlapp.roxiemviexample.presentation.notedetail

import com.ww.roxie.BaseAction

sealed class Action : BaseAction {

    data class LoadNoteDetail(val noteId: Long) : Action() {
        override fun toString() = obfuscatedString()
    }

    data class DeleteNote(val noteId: Long) : Action()
}