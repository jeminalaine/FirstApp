package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MemoriesActivity extends AppCompatActivity {

    EditText notesTitle, notesContent;
    ImageButton saveNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memories);

        notesTitle = findViewById(R.id.notesTitleText);
        notesContent = findViewById(R.id.notesContentText);
        saveNote = findViewById(R.id.saveNoteBtn);

        saveNote.setOnClickListener( (v)-> saveNotes());
    }

    void saveNotes(){
        String noteTitle = notesTitle.getText().toString();
        String noteContent = notesContent.getText().toString();
        if (noteTitle == null || noteTitle.isEmpty()){
            notesTitle.setError("Title is required");
            return;
        }

    }
}