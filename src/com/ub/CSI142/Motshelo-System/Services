package com.ub.csi142`.service;

import com.ub.csi142.model.Member;
import com.ub.csi142.model.contribution;
import com.ub.csi142.interfaces.Reportable;

import java.util.ArrayList;

public class MotsheloService implements Reportable{
    private ArrayList<java.lang.reflect.Member>members;
    private ArrayList<Contribution>contributions;

    public MotsheloService(){
        members=new ArrayList<>();
        contribution=new ArrayList<>();
    }
    public void AddMembers(Member member){
        members.add(member);
        System.out.println("Member added: "+member.getName());
    }
    public void insertionSortById(Member[] members){
        for(int i=1;i<member.length;i++){
            Member key=members[i];
            int j=i-1;

            while(j>=0 && members[j]>Key.id){
                member[j+1]=members[j];
                j--;

            }
            members[j+1]=Key;
        }
    }
    public int binarySearchById(Members[]members,int targetId){
        int low=0;
        int high=members.length()-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(members[mid].id==targetId){
                return mid;
            }else if(members[mid].id<targetId){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public void addContribution(int memberId,double amount){
        int index=binarySearch(memberId);

        if(index!=-1){
            members.get(index).totalContributed+=amount;
            System.out.println("Contribution recorded");
        }else{
            System.out.println("Member not found");
        }
        
    }
    public void generateReport(){
        double total=0;

        System.out.println("\n=====MOTSHELO REPORT=====");

        for(Member m:members){
            System.out.println("ID: ",id);
            System.out.println("Name: ",person.name);
            System.out.println("Phone: ",phoneNumber);
            System.out.println("Total Contributed: ",totalContributed);
            System.out.println("-------------------------------");
            totalPool+=totalContributed;
        }
        System.out.println("TOTAL POOL: ",totalPool);
        
    }

}
