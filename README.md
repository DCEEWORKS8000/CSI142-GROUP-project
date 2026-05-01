# CSI142-GROUP-project

Class list
 Members;
  (member id;name;phone number;)
  Group;
  (group name;members list;total savings;)
  Contributions;
  (member;amount;date;status;)

 Motshelo services(methods);
  addMember()
  recordContribution()
  calculateTotalSavings()
  viewMembers()
  payoutMembers()

  The Motshelo Savings System is a Java-based application designed to manage a group savings or contributions system. It allows users to:

Add and remove members
Record and track member contributions
Display member information and total contributions
Search and sort members
Generate reports summarizing the savings pool

The system is built with object-oriented programming principles, including inheritance, abstraction, encapsulation, polymorphism, composition, and interface implementation.

Features
1.Member Management
Add new members with ID, name, and phone number
Remove existing members
Display all members
2.Contribution Management
Record contributions for individual members
Display total contributions of the group
3.Search & Sort
Search members by ID
Sort members by their ID
4.Reports
Generate a report of all members and their total contributions
Display the total savings pool


com.ub.csi142.motshelosystem
│
├─ app
│ └─ MainApp.java // Entry point of the application
│
├─ interfaces
│ └─ Reportable.java // Interface for generating reports
│
├─ model
│ ├─ Person.java // Abstract class for shared member attributes
│ ├─ Member.java // Concrete class for members
│ ├─ Group.java //Class representing a group of members
│ └─ Contribution.java // Class representing individual contributions
│
└─ services
└─ MotsheloService.java # Service managing members and contributions

GROUP MEMBERS
OBEDIENCE AMOLEMO NJARA 202206353
KGOSI MOKGWEETSI 202202681
OREEDITSE ANDREW KEITHENG 202503441
MPHOENTLE SETUMO 202501867
KARABO MOTLHALEEMANG 202406544

  

