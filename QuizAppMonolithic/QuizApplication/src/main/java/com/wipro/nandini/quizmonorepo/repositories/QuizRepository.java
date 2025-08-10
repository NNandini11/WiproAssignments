package com.wipro.nandini.quizmonorepo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wipro.nandini.quizmonorepo.entities.Question;
import com.wipro.nandini.quizmonorepo.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{
	
	@Query(value = "SELECT * FROM questions q WHERE q.category=? AND q.difficulty_level=? ORDER BY RAND() LIMIT 3", nativeQuery = true)
	List<Question> findRandomQuestionsByCategoryAndLevel(String category, String level);


}
