package com.everlapp.roxiemviexample.domain

import com.everlapp.roxiemviexample.data.NoteRepository
import io.reactivex.Single


class GetNoteListUseCase {
    fun loadAll(): Single<List<Note>> = Single.just(NoteRepository.loadAll())
}