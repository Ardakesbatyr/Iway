package ru.iway.entity;

import lombok.Getter;

public enum Agency {
	
    TV("Такси Везет (Рутакси). +7(495) 909-90-90"),
    CT("Дешевое такси. +7(495) 221-89-81"),
    YT("Яндекс такси. +7(495) 999-99-99");
	
	@Getter
	String label;
	

	Agency(String label) {
	        this.label = label;
	    }



	
}
