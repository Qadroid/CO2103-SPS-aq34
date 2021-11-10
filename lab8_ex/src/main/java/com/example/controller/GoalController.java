package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lab8ExApplication;
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
		List<Goal> goals = Lab8ExApplication.goalList;

		model.addAttribute("goals", goals);

		return "fitness/listGoals";
	}

	/**
	 * Adds a new goal
	 * 
	 * @param goal
	 * @param exerciseDesc
	 * @return
	 */
	@RequestMapping(value = "/addGoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute Goal goal, @RequestParam String exerciseDesc) {
		
		Exercise exercise = new Exercise();
		exercise.setActivity(exerciseDesc);
		List<Exercise> list = new ArrayList<Exercise>();
		list.add(exercise);
		goal.setExercises(list);
		for (Goal g : Lab8ExApplication.goalList) {
			if (g.getId() == goal.getId()) {
				return "fitness/goalExError";
			}
		}
		
		Lab8ExApplication.goalList.add(goal);

		return "redirect:/";
	}
	
	/**
	 * Show a form to create a new goal
	 * @param model
	 * @return
	 */
	@GetMapping("/goal")
	public String goal(@ModelAttribute Goal goal, Model model) {
		return "fitness/goal";
	}
}
