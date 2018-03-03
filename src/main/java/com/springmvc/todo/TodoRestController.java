package com.springmvc.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.security.UserService;

@RestController
public class TodoRestController {
	@Autowired
	TodoService todoService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public List<Todo> retrieveAllTodos(){
		//return todoService.retrieveTodos(userService.getLoggedInUserName().toString());
		return todoService.retrieveTodos("nadide");
	}
	
	@RequestMapping(value = "/todo/{id}")
	public Todo retrieveTodo(@PathVariable int id){
		return todoService.retrieveTodo(id);
	}
}
