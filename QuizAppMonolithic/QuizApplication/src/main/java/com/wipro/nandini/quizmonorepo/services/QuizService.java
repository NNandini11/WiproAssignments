package com.wipro.nandini.quizmonorepo.services;

import java.util.List;

import com.wipro.nandini.quizmonorepo.entities.QuestionWrapper;
import com.wipro.nandini.quizmonorepo.entities.Quiz;
import com.wipro.nandini.quizmonorepo.entities.Response;

public interface QuizService {
	 Quiz createQuiz(String category, String level, String title);

	    List<QuestionWrapper> getQuizQuestions(Integer id);

	    Integer calculateResult(int id, List<Response> responses);
	
}
