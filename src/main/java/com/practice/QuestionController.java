package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Question;
import com.practice.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	
	
	@GetMapping("/allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return new ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK);
	}
	
	
	@PostMapping("/")
	public Question postQuestion(@RequestBody Question que) {
		return questionService.addQues(que);
	}
	
	
	@GetMapping("category/{category}")
	public List<Question> getQuestionByCategory(@PathVariable String category){
		return questionService.getQuestionsByCateogory(category);
	}
	
}
