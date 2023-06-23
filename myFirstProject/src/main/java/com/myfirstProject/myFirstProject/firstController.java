package com.myfirstProject.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.RequestJSON;
import com.myfirstProject.myFirstProject.model.Student;
import com.myfirstProject.myFirstProject.service.BookService;
import com.myfirstProject.myFirstProject.service.StudentService;

@RestController
public class firstController {

	@Autowired
	BookService bookService;
	@Autowired
	StudentService studentService;

	@GetMapping("/aniee")
	public String getHello() {

		return "hello";
	}

	@PostMapping("/posthello")
	public void puthello(@RequestBody RequestJSON json) {

		bookService.save(json.getBook());
		studentService.save(json.getStudent());

	}

	@GetMapping("/getbooks/{id}")
	public Books getBooks(@PathVariable String id)

	{
		Books book = bookService.getBooksByID(id);
		return book;
	}

	@GetMapping("/getstudents/{id}")
	public Student getStudent(@PathVariable String id)

	{
		Student student = studentService.getStudentByID(id);
		return student;
	}

	@PostMapping("/updatebookbyid/{id}")
	public Books updateBook(@RequestBody String updateColumn, @PathVariable String id) {
		System.out.println("uodate kr rha hu ye id ke saath" + id);
	Books book=	bookService.updateBookById(id, updateColumn);
	return book;
	}
	@PostMapping("/updateStudentbyid/{id}")
	public Student updateStudent(@RequestBody String updateColumn, @PathVariable String id) {
		System.out.println("update kr rha hu ye id ke saath" + id);
	Student student=studentService.updateStudentById(id, updateColumn);
	return student;
	}
	@PostMapping("/deleteStudentbyid/{id}")
	public boolean deleteStudent(@PathVariable String id) {
		System.out.println("delete kr rha hu ye id ke saath" + id);
	return studentService.deleteStudentById(id);
	
	}
}
