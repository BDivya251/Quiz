package com.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Question;

@Repository
public interface QuizRepository extends JpaRepository<Question,Integer>{
	
}
