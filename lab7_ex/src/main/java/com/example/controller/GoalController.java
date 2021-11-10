package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lab7ExApplication;
import com.example.model.Exercise;
import com.example.model.Goal;

@Controller
public class GoalController {

	/**
	 * Stores all goals in the model attribute goals
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/getGoals")
	public String getGoals(Model model) {
		List<Goal> goals = Lab7ExApplication.goalList;

		model.addAttribute("goals", goals);

		return "getGoals";
	}

	/**
	 * Adds a new goal
	 * 
	 * @param goal
	 * @param exerciseDesc
	 * @return
	 */
	@GetMapping("addGoal")
	public String updateGoal(@ModelAttribute Goal goal, @RequestParam String exerciseDesc) {

		Exercise exercise = new Exercise();
		exercise.setActivity(exerciseDesc);
		List<Exercise> list = new ArrayList<Exercise>();
		list.add(exercise);
		goal.setExercises(list);

		Lab7ExApplication.goalList.add(goal);

		return "redirect:/";
	}
	
	
}
