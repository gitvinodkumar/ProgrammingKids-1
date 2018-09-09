package com.nt.benas;

public class Borley extends Thread{
	 public static void main(String argv[]){
	 Borley b = new Borley();
	 b.start();
	 }
	 public void run(){
	 System.out.println("Running");
	 }
	}