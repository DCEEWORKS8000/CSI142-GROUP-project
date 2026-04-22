package ub.com.csi142.groupproject.model;

import java.util.Arraylist;
import java.util.List;

public class Motshelo group {
  private String groupName;
  private List<Member>members;
  private double totalSavings;

public MotsheloGroup(String groupName){
  this.groupName=groupName;
  this.members=newArraylist<>();
  this.totalSaving=0.0
}
public void addMember(Member member){
  member.add(member);

public void addContributions(double amount){
  totalSavings += amount;
  }

public double getTotalSavings(){
    return totalSavings;  
}

public void displayMembers(){
  for(member m: members){
    System.out.println(m.getName());
  }
}

}
