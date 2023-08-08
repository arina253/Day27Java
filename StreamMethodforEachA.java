package two;

import java.util.Arrays;
import java.util.List;

public class StreamMethodforEachA {


			public static void main(String[] args) {
				
/*Creating an array of Employee objects and initialize it with some employee
  instances.*/
				
				Employee [] employees = {
						new Employee(1,"ram joshi", 100),
						new Employee (2, "sam shrestha", 1000),
						new Employee (3,"gopal rai", 10000)
						};
				
/*Using a loop to display the full names of the employees using the 
  displayFullName() method*/
				
				for (int i = 0; i < employees.length;i++) {
					employees[i].displayFullName();
				}
				
// Convert the array to a List using Arrays.asList()method				

 List <Employee>emplist = Arrays.asList(employees);
 
 /*Arrays.asList() method is used to convert this array Employee into a List of 
 Employee objects, which is assigned to the variable emplist. 
 The resulting emplist variable contains the same elements as the employees 
 array but in the form of a List. 
 Therefore, emplist is a List that contains the three Employee objects with 
 their respective information (id, fullName, salary).*/
				
				
/*Using the forEach() method on the emplist to increment the salary of each
  employee by 100 units using a lambda expression.*/
 
				
				//forEach()
				
				emplist.stream().forEach (emp -> emp.incrementSalary(100));
				
				
/*Displaying the updated salaries of the employees using a traditional for loop.*/
				
				for (int i = 0; i < employees.length; i++) {
					System.out.println(employees[i].salary);
				}
			}

		}


/*Defining the Employee class with attributes id, fullName, and salary.
  Creating a constructor to initialize these attributes and methods to display the
  full name and increment the salary.*/


		class Employee{
			int id;
			String fullName;
			int salary;
			
			public Employee ( int id, String fn, int sy) {
				this.id = id;
				this.fullName = fn;
				this.salary = sy;
			}
			
			public void displayFullName() {
				System.out.println(this.fullName);
			}
			
			public void incrementSalary(int x) {
				this.salary = this.salary + x;
				//this.salary += x;
				
			}
		
		}
		
/*******************************************************************************/
		
/*
  
 *The stream() method is a crucial method available on various data sources, 
 *such as collections and arrays, which allows you to convert them into a Stream. 
 *The Stream represents a sequence of elements from the data source that can
 *be processed using various stream operations.
 * Stream operations: map, filter, reduce, collect, and more.
 * 
 * 
 * In summary, the code defines an Employee class and uses it to create an array
 *  of Employee objects. Then, it converts the array to a list, applies the 
 *  forEach() method on the list using a lambda expression to increment the
 *   salaries of all employees, and finally, it displays the updated salaries.
 */

