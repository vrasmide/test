package com.question;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
 int questionId;
 String question;
  List<String> answers;
  Map<Integer, String>  mapanswers;
  Set<String> setanswers;
 
public Question(){}
 
 public Question(int questionId, String question, List<String> answers, Map<Integer, String> mapanswers, Set<String> setanswers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
	this.mapanswers = mapanswers;
	this.setanswers = setanswers;
}

public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getAnswers() {
	System.out.println("Answers List:"+answers);
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
public Map<Integer, String> getMapanswers() {
	System.out.print("Map Answers: "+mapanswers);
		return mapanswers;
	}

	public void setMapanswers(Map<Integer,String> mapanswers) {
		this.mapanswers = mapanswers;
	}

	public Set<String> getSetanswers() {
		System.out.println("\nSet Answers: "+setanswers);
		return setanswers;
	}

	public void setSetanswers(Set<String> setanswers) {
		this.setanswers = setanswers;
	}

public void Display() {
	 System.out.println("QuestionId: "+questionId);
	 System.out.println("Question: "+question);
	 
	 
 }

}
