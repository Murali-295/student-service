package com.mk.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomActuator {

	private String name;

	@ReadOperation
	public String student() {
		return "Hello " + name;
	}

	@WriteOperation
	public void hello(@Selector String name) {
		this.name = name;
	}
}

/* 
 * @Autowired private StudentRepository repository; private List<String> list = new ArrayList<>();
 * 
 * @ReadOperation public List<String> studentnames() { List<Student> students =
 * repository.findAll(); for (Student s : students) { list.add(s.getName()); }
 * return list; }
 * 
 * @WriteOperation public void hello(@Selector String name) { this.name = name; }
 * 
 * @DeleteOperation public void deleteStudent(@Selector Integer studentId) {
 * repository.deleteById(studentId); }
 * 
 * @ReadOperation public List<Student> students() { List<Student> students =
 * repository.findAll(); return students; }
 * 
 * @WriteOperation public Student welcome(Student student) { return
 * repository.save(student); }
 * 
 * @WriteOperation public void hello(@Selector String name) { this.name = name; }
 */
