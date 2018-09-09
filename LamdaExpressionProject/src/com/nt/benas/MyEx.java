package com.nt.benas;

import java.io.*;
  class ExBase{
	  static int x=90;
  }
public class MyEx extends ExBase{
 public static void main(String argv[]){
 DataInputStream fi = new
DataInputStream(System.in);
 try{
 fi.readChar();
 }catch(IOException e){
 System.exit(0);
 }
 finally {System.out.println("Doing finally");}
 }


public void martley() {
	x=0;
	this.x=450;
}
}