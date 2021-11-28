package ru.iway.entity;

import lombok.Getter;

public enum Location {
	
	DME("город Москва. Аэропорт Домодедово"),
	BKA("город Москва. Аэропорт Быково"),
	VKO("город Москва. Аэропорт Внуково"),
	SVO("город Москва. Аэропорт Шереметьево"),
	RVH("город Санкт-Петербург. Аэропорт Ржевка"),
	LED("город Санкт-Петербург. Аэропорт Пулково");
	
	@Getter
	String label;
	

	Location(String label) {
	        this.label = label;
	    }



	
}
