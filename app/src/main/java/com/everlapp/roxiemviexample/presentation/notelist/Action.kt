package com.everlapp.roxiemviexample.presentation.notelist

import com.ww.roxie.BaseAction


sealed class Action : BaseAction {
    object LoadNotes : Action()
}