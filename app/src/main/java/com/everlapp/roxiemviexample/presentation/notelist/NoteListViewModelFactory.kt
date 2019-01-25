package com.everlapp.roxiemviexample.presentation.notelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.everlapp.roxiemviexample.domain.GetNoteListUseCase

class NoteListViewModelFactory(
    private val initialState: State?,
    private val noteListUseCase: GetNoteListUseCase
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteListViewModel(initialState, noteListUseCase) as T
    }
}