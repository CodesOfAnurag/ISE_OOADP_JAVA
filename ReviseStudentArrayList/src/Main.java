import java.util.*; 
public class Main {
	public static void main (String args[]){
		
		ArrayList<Student> arr = new ArrayList<Student>();
		Student s1= new Student("A", "1MS16", 21);
		arr.add(s1);
		arr.add(new Student("B", "1MS17", 20));
		arr.add(new Student("C", "1MS18", 19));
		
		System.out.println("----------------------------------");
		System.out.println("PART 1");
		System.out.println("----------------------------------");
		
		System.out.println("Using For loop: \n--------------------------------");
		for(int i=0; i<arr.size(); i++)
			System.out.println(arr.get(i));
		
		System.out.println("Using For Each loop: \n--------------------------------");
		for (Student x: arr)
			System.out.println(x+"\n");
		
		System.out.println("Using Iterator: \n--------------------------------");
		Iterator<Student> it = arr.iterator();
		while (it.hasNext())
			System.out.println(it.next()+"\n");
		
		System.out.println("Using ListIterator: \n--------------------------------");
		ListIterator<Student> lit = arr.listIterator();
		while (lit.hasNext())
			System.out.println(lit.next()+"\n");
		
		System.out.println("----------------------------------");
		System.out.println("PART 2");
		System.out.println("----------------------------------");
		
		s1=lit.previous();
		System.out.println("Index of \n"+s1+"\nis :"+arr.indexOf(s1));
		
		System.out.println("\nCopying to another arraylist using for loop: \n--------------------------------");
		ArrayList<Student> arr2 = new ArrayList<Student>();
		for(int i=0; i<arr.size(); i++)
			arr2.add(arr.get(i));
		System.out.println("New from for loop: "+ arr2);
		
		System.out.println("\nCopying to another arraylist using for each loop: \n--------------------------------");
		ArrayList<Student> arr3 = new ArrayList<Student>();
		for(Student x: arr)
			arr3.add(x);
		System.out.println("New from for each loop: "+ arr3);
		
		System.out.println("\nCopying to another arraylist using iterator: \n--------------------------------");
		Iterator<Student> it2 = arr.iterator();
		ArrayList<Student> arr4 = new ArrayList<Student>();
		while (it2.hasNext())
			arr4.add(it2.next());
		System.out.println("New from iterator: "+ arr4);
	}
}
