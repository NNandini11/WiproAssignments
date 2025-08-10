package com.wipro.nandini.quizmonorepo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.nandini.quizmonorepo.entities.Question;
import com.wipro.nandini.quizmonorepo.entities.QuestionWrapper;
import com.wipro.nandini.quizmonorepo.entities.Quiz;
import com.wipro.nandini.quizmonorepo.entities.Response;
import com.wipro.nandini.quizmonorepo.repositories.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{
	
	@Autowired
	private QuizRepository qrepo;
	public Quiz createQuiz(String category, String level, String title) {
	    List<Question> questions = qrepo.findRandomQuestionsByCategoryAndLevel(category, level);
	    Quiz quiz = new Quiz();
	    quiz.setQuizTitle(title);
	    quiz.setQuestions(questions);
	    return qrepo.save(quiz);
	}

	
	
	
	public List<QuestionWrapper> getQuizQuestions(Integer id) {
	    Optional<Quiz> quiz = qrepo.findById(id);

	    List<Question> questionsFromDB = quiz.get().getQuestions();
	    List<QuestionWrapper> questionsForUser = new ArrayList<>();

	    for (Question q : questionsFromDB) {
	        QuestionWrapper qw = new QuestionWrapper(
	            q.getId(),
	            q.getQuestionTitle(),
	            q.getOption1(),
	            q.getOption2(),
	            q.getOption3(),
	            q.getOption4()
	        );
	        questionsForUser.add(qw);
	    }

	    return questionsForUser;
	}
	public Integer calculateResult(int id, List<Response> responses) {
	    Quiz quiz = qrepo.findById(id).get();
	    List<Question> questions = quiz.getQuestions();
	    int right = 0;

	    for (Response response : responses) {
	        for (Question question : questions) {
	            if (question.getId() == response.getId()) {
	                if (question.getCorrectAnswer().equalsIgnoreCase(response.getResponse())) {
	                    right++;
	                }
	                break; 
	            }
	        }
	    }

	    return right;
	}



}
