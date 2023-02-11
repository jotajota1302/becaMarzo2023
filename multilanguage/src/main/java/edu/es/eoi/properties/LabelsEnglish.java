package edu.es.eoi.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:english.properties")
public class LabelsEnglish implements Labels{
	
	@Value( "${en.greeting}" )
	private String welcome;
	
	@Value( "${en.question}" )
	private String question;
	
	@Value( "${en.yes}" )
	private String yes;
	
	@Value( "${en.no}" )
	private String no;

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getYes() {
		return yes;
	}

	public void setYes(String yes) {
		this.yes = yes;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}


	
	

}
