package ru.iway.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Booking {
	private Location location;
	
	private Agency agency;

}
