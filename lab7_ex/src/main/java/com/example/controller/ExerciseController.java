package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lab7ExApplication;
import com.example.model.Exercise;
import com.example.model.Goal;

@Controller
public class ExerciseController {

	/**
	 * Look up a goal by goalId and add the provided exercise to it
	 * 
	 * @param exercise
	 * @param goalId
	 * @return
	 */
	@GetMapping("/addExercise")
	public String addMinutes(@ModelAttribute Exercise exercise, @RequestParam Long goalId) {

		Goal goal = null;

		for (Goal g : Lab7ExApplication.goalList) {
			if (g.getId() == goalId) {
				goal = g;
				break;
			}
		}

		if (goal != null) {
			goal.getExercises().add(exercise);
			exercise.setGoal(goal);
		}

		return "showExercise";
	}

}
