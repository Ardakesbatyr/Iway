package ru.iway.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AgencyItem {
	
	private Agency id;
    private String text;
    private String slug;
	
}
