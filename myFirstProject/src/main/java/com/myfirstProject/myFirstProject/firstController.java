package com.myfirstProject.myFirstProject;

import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.RequestJSON;
import com.myfirstProject.myFirstProject.model.Student;
import com.myfirstProject.myFirstProject.model.User;
import com.myfirstProject.myFirstProject.service.BookService;
import com.myfirstProject.myFirstProject.service.StudentService;
import com.myfirstProject.myFirstProject.service.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("name")
public class firstController {

	@Autowired
	BookService bookService;
	@Autowired
	StudentService studentService;
	@Autowired
	UserService userService;

	boolean authentication = false;
	@Autowired
	private HttpServletRequest request;

	@GetMapping("/aniee")
	public ModelAndView getHello(Model model) {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("professionList", "saksham");
		return modelAndView;
	}

	@RequestMapping(value = "/bookForm", method = RequestMethod.GET)
	public ModelAndView getBookForm() {
		if (authentication) {
			return new ModelAndView("bookForm");
		} else {
			return new ModelAndView("failure");
		}
	}

//  saving books and student in post request
	@RequestMapping(value = "/posthello", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ModelAndView puthello(@RequestParam String id, @RequestParam String name, @RequestParam String publisher,
			@RequestParam String doi, @RequestParam String studentid, @RequestParam String studentname,
			@RequestParam String standard, @RequestParam String section) {
		ModelAndView view = null;
		if (authentication) {
			Books book = new Books();
			book.setId(Integer.parseInt(id));
			book.setName(name);
			book.setPublisher(publisher);
			book.setDoi(doi);
			bookService.save(book);
			Student student = new Student();
			student.setId(Integer.parseInt(studentid));
			student.setName(studentname);
			student.setStandard(standard);
			student.setSection(section);
			studentService.save(student);
			view = new ModelAndView("success");
		} else {
			return new ModelAndView("failure");
		}
		return view;
	}

	@RequestMapping(value = "/postForm", method = RequestMethod.POST)
	public ModelAndView postForm(@RequestParam String id, @RequestParam String email, @RequestParam String password) {
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setEmail(email);
		user.setPassword(password);
		userService.save(user);
		ModelAndView view = new ModelAndView("success");
		return view;

	}

	@RequestMapping(value = "/signupform", method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("signupform");
	}

	// get book request based on ID
	@RequestMapping(value = "/getbooks/{id}", method = RequestMethod.GET)
	public ModelAndView getBooks(@PathVariable String id)

	{
		Books book = bookService.getBooksByID(id);
		ModelAndView modelAndView = new ModelAndView("bookpage", "book", book);

		return modelAndView;

	}

	@RequestMapping(value = "/getstudents/{id}", method = RequestMethod.GET)

	public ModelAndView getStudent(@PathVariable String id)

	{
		Student student = studentService.getStudentByID(id);
		ModelAndView modelAndView = new ModelAndView("studentpage", "student", student);

		return modelAndView;
	}

	@PostMapping("/updatebookbyid/{id}")
	public Books updateBook(@RequestBody String updateColumn, @PathVariable String id) {
		System.out.println("uodate kr rha hu ye id ke saath" + id);
		Books book = bookService.updateBookById(id, updateColumn);
		return book;
	}

	@PostMapping("/updateStudentbyid/{id}")
	public Student updateStudent(@RequestBody String updateColumn, @PathVariable String id) {
		System.out.println("update kr rha hu ye id ke saath" + id);
		Student student = studentService.updateStudentById(id, updateColumn);
		return student;
	}

	@PostMapping("/deleteStudentbyid/{id}")
	public boolean deleteStudent(@PathVariable String id) {
		System.out.println("delete kr rha hu ye id ke saath" + id);
		return studentService.deleteStudentById(id);

	}

	@RequestMapping(value = "bookslist/{id}", method = RequestMethod.GET)
	public ModelAndView getBooksByList(@PathVariable String id) {
		List<Books> bookList = bookService.getBooksBylist(id);
		ModelAndView modelAndView = new ModelAndView("booklist", "book", bookList);
		return modelAndView;
	}

	@RequestMapping(value = "studentslist/{id}", method = RequestMethod.GET)
	public ModelAndView getStudentByList(@PathVariable String id) {
		List<Student> studentList = studentService.getStudentBylist(id);
		ModelAndView modelAndView = new ModelAndView("studentlist", "student", studentList);
		return modelAndView;
	}

	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public ModelAndView getLoginForm1() {
		return new ModelAndView("loginform");
	}

	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	public ModelAndView getAuthentication(@RequestParam String email, @RequestParam String password) {
		boolean value = userService.getAuthnetication(email, password);
		ModelAndView model = null;
		if (value) {
			model = new ModelAndView("succcess");
		} else {
			model = new ModelAndView("failure");
		}
		authentication = value;
		return model;
	}
// username and password : get ity 
}