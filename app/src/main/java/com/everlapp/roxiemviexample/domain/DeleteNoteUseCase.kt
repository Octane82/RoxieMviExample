package com.everlapp.roxiemviexample.domain

import com.everlapp.roxiemviexample.data.NoteRepository
import io.reactivex.Completable

class DeleteNoteUseCase {

    fun delete(note: Note): Completable =
        when {
            NoteRepository.delete(note) -> Completable.complete()
            else -> Completable.error(RuntimeException("Unable to delete note $note"))
        }

}