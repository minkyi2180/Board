package com.mysite.prac;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.prac.question.Question;
import com.mysite.prac.question.QuestionRepository;
import com.mysite.prac.question.QuestionService;

@SpringBootTest
class PracApplicationTests {
	
	  @Autowired
	    private QuestionService questionService;

	    @Test
	    void testJpa() {        
	     for(int i =1; i<=100;i++) {
	    	 String subject = String.format("테스트 데이터입니다:[%03d]", i);
	    	 String content = "내용없음";
	    	 this.questionService.create(subject, content);
	     }
	    }
}
	    
