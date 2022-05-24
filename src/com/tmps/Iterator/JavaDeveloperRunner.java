package com.tmps.Iterator;

public class JavaDeveloperRunner {
  public static void main(String[] args){
    String[] skills = {"Java","Spring","Hibernate","Maven","PostgresSQL"};

    JavaDeveloper javaDeveloper = new JavaDeveloper("Munteanu Ion", skills);

    Iterator iterator = javaDeveloper.getIterator();
    System.out.println("Developer " + javaDeveloper.getName());
    System.out.println("Skills:");

    while (iterator.hasNext()){
      System.out.println(iterator.next() + " ");
    }
  }
}
