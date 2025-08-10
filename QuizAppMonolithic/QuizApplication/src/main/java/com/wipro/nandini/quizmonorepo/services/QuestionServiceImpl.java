package com.wipro.nandini.quizmonorepo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.nandini.quizmonorepo.entities.Category;
import com.wipro.nandini.quizmonorepo.entities.Difficulty;
import com.wipro.nandini.quizmonorepo.entities.Question;
import com.wipro.nandini.quizmonorepo.exceptions.QUESTION_NOT_FOUND_EXCEPTION;
import com.wipro.nandini.quizmonorepo.repositories.QuestionRepository;

@Service
public class QuestionServiceImpl  implements QuestionService{
	
	@Autowired
	private QuestionRepository qrepo;

	@Override
	public Question addQuestion(Question q) {
		return qrepo.save(q);
	}

	@Override
	public Question getQuestion(int id) {
		return qrepo.findById(id).get();
	}

	@Override
	public List<Question> getAllQuestions() {
		return qrepo.findAll();
	}

	@Override
	public Question patchQuestion(int id, Question q) {
		Question exists=qrepo.findById(id)
				 .orElseThrow(() -> new QUESTION_NOT_FOUND_EXCEPTION("QUESTION with that id  is not Present! " + id));
				if(q.getQuestionTitle()!=null)     
			      {
			    	  exists.setQuestionTitle(q.getQuestionTitle());
			      }
			   
		return qrepo.save(exists);
	}

	@Override
	public String deleteQuestion(int id) {
		qrepo.deleteById(id);
		return "question is deleted";
	}

	@Override
	public List<Question> getQuestionsByCategory(Category category) {
	    return qrepo.findByCategory(category);
	}


	@Override
	public List<Question> findByDifficultyLevel(Difficulty difficulty) {
	    return qrepo.findByDifficultyLevel(difficulty);
	}

	

}
