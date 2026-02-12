import java.util.*;
import java.util.stream.*;

class UniversityAnalysis {
	public static void main(String[] args) {
		List<UniverSityManagment> people= Arrays.asList(
			      new Student(1, "Amit", "CS", 2),
            new Student(2, "Riya", "Physics", 3),
            new Student(3, "Karan", "Math", 1),
            new Faculty(4, "Dr. Mehta", "Physics", 10),
            new Faculty(5, "Dr. Rao", "CS", 7),
            new Faculty(6, "Dr. Sen", "Math", 12)

		      );
         System.out.println("Sorted Names");
         people.stream().map(UniverSityManagment::getName).sorted()
                  .forEach(System.out::println);

        System.out.println("Department Highest Number Of Employee");
        people.stream().max(Comparator.comparingInt(UniverSityManagment::getDepartment))

          System.out.println("Faculy Belong to Physics");
          boolean physicsFaculty=  people.stream().anyMatch(p-> p instanceof Faculty
                    && p.getDepartment().equalsIgnoreCase("Physics"));
        System.out.println("Physics Faculty Exist: "+physicsFaculty);  

        System.out.println("Unique Department: ");

      List<String> list=people.stream().map(UniverSityManagment::getDepartment).distinct()
                         .collect(Collectors.toList());
       System.out.println(list);


       System.out.println("top 3 longest-associated people ");

       people.stream().sorted(Comparator.comparingInt(UniverSityManagment::YearOfExp).reversed()).limit(3)
               .forEach(p -> System.out.println(p.getName()));


	}
}