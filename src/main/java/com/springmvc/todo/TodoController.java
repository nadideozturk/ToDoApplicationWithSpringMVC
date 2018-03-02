package com.springmvc.todo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;



@Controller
@SessionAttributes("userName")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	 
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model, String userName) {
		userName = (String) model.get("userName");
		model.addAttribute("todolist",service.retrieveTodos(userName));
		return "todo-list";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	public String showNewTodoCreation(ModelMap model) {
		model.addAttribute("todo", new Todo(0,"nadide","hddhhggg",new Date(),false));
		return "newtodo";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String createNewTodo(ModelMap model, @Valid @ModelAttribute("todo") Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "newtodo";
		}
		model.clear();
		service.addTodo("nadide", todo.getDesc(), new Date(), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model, @RequestParam int id) {
		model.clear();
		service.deleteTodo(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/update-todo", method = RequestMethod.GET)
	public String updateTodo(ModelMap model, @RequestParam int id) {
		Todo todo = service.retrieveTodo(id);
		model.addAttribute("todo",todo);
		return "newtodo";
	}
	
	@RequestMapping(value="/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid @ModelAttribute("todo") Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "newtodo";
		}
		todo.setUser(model.get("userName").toString());
		service.updateTodo(todo);
		return "redirect:list-todos";
	}
}
