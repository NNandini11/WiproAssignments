package com.wipro.nandini.quizmonorepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.nandini.quizmonorepo.entities.QuestionWrapper;
import com.wipro.nandini.quizmonorepo.entities.Quiz;
import com.wipro.nandini.quizmonorepo.entities.Response;
import com.wipro.nandini.quizmonorepo.services.QuizService;
@RestController

@RequestMapping("/quiz")
public class QuizController {
	
       @Autowired
	    private  QuizService quizserv;

	    @PostMapping("/create")
	    public Quiz creatingQuiz(
	            @RequestParam String category,
	            @RequestParam String level,
	            @RequestParam String title) {
	        return quizserv.createQuiz(category, level, title);
	    }

	    @GetMapping("/getQuizById/{id}")
	    public List<QuestionWrapper> gettingQuizQuestions(@PathVariable Integer id) {
	        return quizserv.getQuizQuestions(id);
	    }

	    @PostMapping("/submitQuiz/{id}")
	    public Integer submittingQuiz(@PathVariable int id, @RequestBody List<Response> responses) {
	        return quizserv.calculateResult(id, responses);
	    }
	}


