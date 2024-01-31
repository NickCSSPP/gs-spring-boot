package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class PointParkController {

	@RequestMapping("/point")
	public String point() {
		var season = "Winter";
		if (season.equals ("Summer")) {
			return "It's nice in Bison Country!";
		}
		else {
			return "It's a bit cold in Bison Country!";
		}
	}

    @RequestMapping("/about")
	public String about() {
		var name = "Mahomes";
		if (name.equals ("Brady")){
			return "This story is about a man named Brady";
		}
		else {
			return "This story is about a man not named Brady.";
		}
	}

    @RequestMapping("/home")
	public String home() {
		var location = "Pittsburgh";
		if (location.equals ("Pittsburgh")){
			return "Glad to be home.";
		}
		else {
			return "Wishing I was at home.";
		}
	}

    @RequestMapping("/weekend")
    public String weekend() {
		DayOfWeek today = LocalDate.now().getDayOfWeek();
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            return "It's the weekend! Enjoy!";
        } else {
            return "It's not the weekend yet.";
        }
    }
}