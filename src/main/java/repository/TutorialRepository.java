package com.franckpachot.spring.jpa.yugabytedb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franckpachot.spring.jpa.yugabytedb.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}
