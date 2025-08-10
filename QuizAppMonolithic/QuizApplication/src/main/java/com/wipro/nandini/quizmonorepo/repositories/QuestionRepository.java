package com.wipro.nandini.quizmonorepo.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.nandini.quizmonorepo.entities.Category;
import com.wipro.nandini.quizmonorepo.entities.Difficulty;
import com.wipro.nandini.quizmonorepo.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	 List<Question> findByCategory(Category category);

	  
	 List<Question> findByDifficultyLevel(Difficulty difficulty);


	

}
