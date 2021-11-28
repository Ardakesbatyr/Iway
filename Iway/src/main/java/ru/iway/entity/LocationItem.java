package ru.iway.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LocationItem {
	
	private Location id;
    private String text;
    private String slug;
	
}
