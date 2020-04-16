package mapshandsons;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;



public class Demo {


	public static Map<Project, Employee> loadProjects() throws ParseException {
		
		  Employee e1 = new Employee(1, "chandana", 23000.00,"chandana@gmail.com");
		  Employee e2 = new Employee(2, "likhitha", 20000.00,"likhitha@gmail.com");
		  Employee e3 = new Employee(3, "pravallitha", 30000.00,"pravallitha@gmail.com");
		  Employee e4 = new Employee(4, "ruchitha", 220000.00,"ruchitha@gmail.com");
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		  Date startdate = sdf.parse("12-12-2019");
		  Date enddate = sdf.parse("30-04-2020");
		  Project p1 = new Project(101, "Java", startdate, enddate);
		  Project p2 = new Project(103, "python", sdf.parse("12-10-2019"), sdf.parse("04-04-2020"));
		  Project p3 = new Project(104, "SAP", sdf.parse("01-01-2020"), sdf.parse("04-04-2020"));
		  Project p4 = new Project(106, "AWS", sdf.parse("12-10-2019"), sdf.parse("04-05-2020"));
		  Project p5 = new Project(105, "Data science", sdf.parse("10-10-2019"), sdf.parse("28-02-2020"));
		  Project p6 = new Project(108, "IOT", sdf.parse("02-01-2020"), sdf.parse("30-04-2020"));
		  Project p7 = new Project(109, "React js", sdf.parse("12-10-2019"), sdf.parse("04-05-2020"));
		  Project p8 = new Project(107, "Angular js", sdf.parse("12-12-2019"), sdf.parse("30-03-2020"));
		  Project p9 = new Project(102, "AI", sdf.parse("12-02-2020"), sdf.parse("31-06-2020"));
		  Project p10 = new Project(110, "ML", sdf.parse("12-10-2019"), sdf.parse("04-07-2020"));
    
		 Map<Project,Employee> map = new TreeMap<Project,Employee>();
		 
		 map.put(p1,e1);
		 map.put(p2,e2); 
		 map.put(p3,e3);
		 map.put(p4,e4);
		 map.put(p5,e1); 
		 map.put(p6,e2);
		 map.put(p7,e3);
		 map.put(p8,e4); 
		 map.put(p9,e1);
		 map.put(p10,e3);
		 return map;
	}

public static void displayByProjectId(Map<Project, Employee> map) {
 SortedMap<Project,Employee>  sortedMap = new TreeMap<Project, Employee>(map);

 sortedMap.entrySet().stream().forEach(t->System.out.println(t));



}

public static void displayByProjectDomain(Map<Project, Employee> map) {
Comparator<Project> projectDomainComaprator = new Comparator<Project>() {

	@Override
	public int compare(Project o1, Project o2) {
		// TODO Auto-generated method stub
		return o1.getDomain().compareTo(o2.getDomain());
	}
};




map.entrySet().stream().sorted(Map.Entry.comparingByKey(projectDomainComaprator)).forEach(t -> System.out.println(t));
};


public static void main(String args[]) throws ParseException {
Map<Project, Employee> map = loadProjects();
displayByProjectId(map);
System.out.println("***************");
displayByProjectDomain(map);
}

}


