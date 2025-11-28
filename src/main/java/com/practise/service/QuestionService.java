package com.practise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Question;
import com.practise.repository.QuizRepository;


@Service
public class QuestionService {

	@Autowired
	private QuizRepository quizRepository;
	public List<Question> getAllQuestions() {
		
		return quizRepository.findAll();
	}
	public Question addQues(Question que) {
		
		return quizRepository.save(que);
	}
	
}
