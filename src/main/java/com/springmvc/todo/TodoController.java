package com.springmvc.todo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;



@Controller
@SessionAttributes("userName")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model, String userName) {
		userName = (String) model.get("userName");
		model.addAttribute("todolist",service.retrieveTodos(userName));
		return "todo-list";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String showNewTodoCreation() {
		return "newtodo";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String createNewTodo(ModelMap model, @RequestParam String desc) {
		model.clear();
		service.addTodo("nadide", desc, new Date(), false);
		return "redirect:list-todos";
	}
}
