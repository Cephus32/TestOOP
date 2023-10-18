import java.util.*;
class Main {
  public static void main(String[] args) {
     System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
     System.out.println("------------------------------------------------------------------------------");

    // Implement the EMA application logic here
    int emailsCreated = 0;
    int numOfEmailsRequested;
    int batchNo;
    int departmentID;
    Scanner input = new Scanner(System.in);
    System.out.println("How many emails would you like to create: ");
    numOfEmailsRequested = input.nextInt();
    input.nextLine();
    Email[] newEmails = new Email[numOfEmailsRequested];
    String typeOfEmail;
    
    do{
	    System.out.println("What is your first name: ");
	    String firstName = input.next();
	    input.nextLine();
	    System.out.println("What is your last name:");
	    String lastName = input.next();
      input.nextLine();
	    for(;;){
  		System.out.println("Is this a student or staff email: ");
  		typeOfEmail = input.next();
      input.nextLine();
	   
  		if(typeOfEmail.equalsIgnoreCase("Student")){
  		    System.out.println("What batch number");
  		    batchNo = input.nextInt();
  		    input.nextLine();
  		    newEmails[emailsCreated] = new StudentEmail(firstName, lastName, batchNo);
  	      emailsCreated++;
  		    System.out.println("Thank you, email number " + emailsCreated + " created");
  		    break;
  		  }
  		else if(typeOfEmail.equalsIgnoreCase("Staff")){
  		    System.out.println("What is your department ID(Please select a number 1-4):");
  		    departmentID = input.nextInt();
          input.nextLine();
  		    if(departmentID >= 1 && departmentID <= 4){
  			  newEmails[emailsCreated] = new StaffEmail(firstName, lastName, departmentID); 
  			  emailsCreated++;
  			  System.out.println("Thank you, email number " + emailsCreated + " created");
  		    }
  		    break;
  		}
		  System.out.println("ERROR! Please try again.");
	    }
    }while(emailsCreated != numOfEmailsRequested);
    System.out.println("Thank you, the following emails was successfully created: ");
    for(Email a: newEmails){
    System.out.println(a.toString());
    }

  System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
  }
}