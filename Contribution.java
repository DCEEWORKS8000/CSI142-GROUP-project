package ub.com.csi142.groupproject model;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Contribution {
    private Member member;
    private double amount;
    private LocalDate date;

    // Constructor
    public Contribution(Member member, double amount) {
        this.member = member;
        this.amount = amount;
        this.date = LocalDate.now(); // Automatically sets the date to today
    }

    // Getters
    public Member getMember() {
        return member;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    // A display method to help with your group reports
    public void displayContribution() {
        System.out.println("Member: " + member.getName() + 
                           " | Amount: P" + amount + 
                           " | Date: " + date);
    }
  }
