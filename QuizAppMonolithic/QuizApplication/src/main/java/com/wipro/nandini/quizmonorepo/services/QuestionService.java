package com.wipro.nandini.quizmonorepo.services;

import java.util.List;

import com.wipro.nandini.quizmonorepo.entities.Category;
import com.wipro.nandini.quizmonorepo.entities.Difficulty;
import com.wipro.nandini.quizmonorepo.entities.Question;

public interface QuestionService {
	
	public Question addQuestion(Question q);
	public Question getQuestion(int id);
	public List<Question> getAllQuestions();
	public Question patchQuestion(int id,Question q);
	public String deleteQuestion(int id);
	List<Question> getQuestionsByCategory(Category category);
	List<Question> findByDifficultyLevel(Difficulty difficulty);
	

}
