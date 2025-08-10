package com.wipro.nandini.quizmonorepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.nandini.quizmonorepo.entities.Category;
import com.wipro.nandini.quizmonorepo.entities.Difficulty;
import com.wipro.nandini.quizmonorepo.entities.Question;
import com.wipro.nandini.quizmonorepo.services.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	private QuestionService qserv;
	
	@PostMapping("/addquestion")
	public Question addingQuestion(@RequestBody Question q) {
		return  qserv.addQuestion(q);	
	}
	
	@GetMapping("/getquestion/{id}")
	public Question gettingQuestion(@PathVariable int id) {
		return qserv.getQuestion(id);
		
	}
	
	@GetMapping("/gettingallquestions")
	public List<Question> gettingAllQuestions() {
		return qserv.getAllQuestions();	
	}
	
	@PatchMapping("/patchquestion/{id}")
	public Question patchingQuestion(@PathVariable int id, @RequestBody Question q) {
		return qserv.patchQuestion(id, q);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deletingQuestion(@PathVariable  int id) {
		qserv.deleteQuestion(id);
		return "Question is deleted Successfully!";
	}
	@GetMapping("category/{category}")
	public List<Question> gettingByCategory(@PathVariable Category category) {
	    return qserv.getQuestionsByCategory(category);
	}

	@GetMapping("difficulty/{difficulty}")
	public List<Question> gettingByDifficulty(@PathVariable Difficulty difficulty) {
	    return qserv.findByDifficultyLevel(difficulty);
	}



}
