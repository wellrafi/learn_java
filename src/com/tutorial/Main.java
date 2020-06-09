package com.tutorial;

/**
 * Otherclass
 */
class Mamam {
  String string;
  double ipk;
  int getInt;
  
  // ini namanya construtor 
  // bakal autorun pertama kali kalo class ini dipanggil
  Mamam(){

  }

}

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    Mamam classMamam = new Mamam(); 
    classMamam.getInt = 10;
    classMamam.ipk = 10;
    classMamam.string = "thestring";

    System.out.println(classMamam);

  }
}