package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Question;
import com.practice.repository.QuestionRepository;


@Service
public class QuestionService {

	@Autowired
	private QuestionRepository quizRepository;
	public List<Question> getAllQuestions() {
		
		return quizRepository.findAll();
	}
	public Question addQues(Question que) {
		
		return quizRepository.save(que);
	}
	public List<Question> getQuestionsByCateogory(String category) {
		return quizRepository.findByCategory(category);
	
	}
	
}
