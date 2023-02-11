package edu.es.eoi.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:french.properties")
public class LabelsFrench implements Labels{
	
	@Value( "${fr.greeting}" )
	private String welcome;
	
	@Value( "${fr.question}" )
	private String question;
	
	@Value( "${fr.yes}" )
	private String yes;
	
	@Value( "${fr.no}" )
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
