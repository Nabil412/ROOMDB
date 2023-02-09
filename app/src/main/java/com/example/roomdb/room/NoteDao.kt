package com.example.roomdb.room

import androidx.room.*

@Dao

interface NoteDao {

    @Insert
    fun addNote(note: Note)

    @Update
    fun updatenote(note: Note)


    @Delete
    fun deleteNote(note: Note)

    @Query("SELECT * FROM note")
    fun getNotes(): List<Note>

    @Query("SELECT * FROM note WHERE id =:note_id")
    fun getNote(note_id: Int): List<Note>
}