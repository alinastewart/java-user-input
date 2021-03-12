import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name:");
    // String input
    String name = myObj.nextLine();
    
    System.out.println("Enter age:");
    // Numerical input
    int age = myObj.nextInt();
  
    System.out.println("Enter salary:"); 
    // Numerical input
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);

  }
}

