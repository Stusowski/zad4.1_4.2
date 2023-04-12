/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      System.out.println("1. Dodaj nowego studenta");
      System.out.println("2. Wypisz studentów");
      System.out.println("3. Wyjdź");
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      switch (x){
        case 1: 
          System.out.println("Podaj imię: ");
          String name = scanner.next();
          System.out.println("Podaj nazwisko: ");
          String nazwisko = scanner.next();
          System.out.println("Podaj wiek: ");
          int age = scanner.nextInt();
          s.addStudent(new Student(name,nazwisko,age));
          break;

        case 2: 
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());
          }
          break;
        case 3:
          break;
      }
      
      
    } catch (IOException e) {

    }
  }
}