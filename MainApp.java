import java.lang.reflect.Member;
import java.util.ArrayList;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         ArrayList<Member> members = new ArrayList<>();

         int choice;

         do{
        
            System.out.println("\n ********MOTSHELO SAVINGS SYSTEM********\n");
         System.out.println("1.Add member");
         System.out.println("2.Remove member");
         System.out.println("3.Show members");
         System.out.println("4.Contrubute");
         System.out.println("5.Check contributions total");
         System.out.println("0.Exit");

         System.out.print("Choose option:");
         choice=in.nextInt();
         in.nextLine();
         
         switch (choice) {
            case 1:System.out.print("Enter name of new member:");          
                   String newName = in.nextLine();
                   members.add(new Member(newName));
                   System.out.println(newName + " added successfully.");
            
                  break;
            case 2:System.out.print("Enter name of member you want to remove");
                   System.out.print("Enter name of member you want to remove: ");
                   String removeName = in.nextLine();
                   boolean removed = members.removeIf(m -> m.getName().equalsIgnoreCase(removeName));
                   if (removed) {
                        System.out.println(removeName + " removed successfully.");
                 } else {
                     System.out.println("Member not found.");
            }
            
                  break;
            case 3:if (members.isEmpty()) {
              System.out.println("No members yet.");
          } else {
              System.out.println("Members list:");
              for (Member m : members) {
                  System.out.println(m);
              }
          }
          
                  break;
            case 4:
              System.out.print("Enter member name: ");
              String contribName = in.nextLine();
               Member found = null;
              for (Member m : members) {
              if (m.getName().equalsIgnoreCase(contribName)) {
               found = m;
               break;
    }
              }
               if (found != null) {
               System.out.print("Enter amount you want to contribute: ");
                 double amount = in.nextDouble();
               in.nextLine();
               found.contribute(amount);
                System.out.println("Contribution added for " + contribName);

              } else {
                System.out.println("Member not found.");
             }

                   break;
            case 5:double total = 0;
            for (Member m : members) {
                total += m.getTotalContribution();
            }
            System.out.println("Total contributions: " + total);
            
                   break;
            case 0:System.out.print("Exiting");
                   break;
            default:System.out.print("Invalid choice");
                   break;
         }
         }while (choice!=0); {
            
         }
    }
}
