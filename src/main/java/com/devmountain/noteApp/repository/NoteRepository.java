package com.devmountain.noteApp.repository;

import com.devmountain.noteApp.entites.Note;
import com.devmountain.noteApp.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserEquals(User user);
}
