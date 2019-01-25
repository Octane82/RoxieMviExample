package com.everlapp.roxiemviexample.presentation.notedetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.everlapp.roxiemviexample.domain.DeleteNoteUseCase
import com.everlapp.roxiemviexample.domain.GetNoteDetailUseCase

class NoteDetailViewModelFactory(
    private val initialState: State?,
    private val noteDetailUseCase: GetNoteDetailUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteDetailViewModel(initialState, noteDetailUseCase, deleteNoteUseCase) as T
    }
}