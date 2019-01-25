package com.everlapp.roxiemviexample


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everlapp.roxiemviexample.presentation.notelist.NoteListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NoteListFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }
}
