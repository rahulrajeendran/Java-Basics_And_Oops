package stringsort;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
      Scanner sc=new Scanner(System.in);
      void sorting() {
    	  System.out.println("Enter the string");
    	  String str=sc.next();
    	  char[] num=new char[str.length()+1];
    	  char[] alp=new char[str.length()+1];
    	  char[] spl=new char[str.length()+1];
    	  int nc=0;
    	  int ac=0;
    	  int sc=0;
    	  for(int i=0;i<str.length();i++) {
    	  if(Character.isDigit(str.charAt(i))) {
    		  num[nc]=(str.charAt(i));
    		  nc++;
    	  }
    	  else if(Character.isAlphabetic(str.charAt(i))) {
    		  alp[ac]=(str.charAt(i));
    		  ac++;
    	  }
    	  else {
    		  spl[sc]=(str.charAt(i));
    		  sc++;
    	  }
    	  }
    	 for(int i=0;i<nc;i++) {
    		 for(int j=i+1;j<nc;j++) {
    			 if(num[i]>num[j]){
    				 char temp=num[i];
    				 num[i]=num[j];
    				 num[j]=temp;
    			 }

    		 }
    	 }
    	 
//    	 alphabetic order
    	 for(int i=0;i<ac;i++) {
    		 for(int j=i+1;j<ac;j++) {
    			 if(alp[i]>alp[j]) {
    				 char temp=alp[i];
    				 alp[i]=alp[j];
    				 alp[j]=temp;
    			 }
    		 }
    	 }
    	 
//    	 special order
    	 for(int i=0;i<sc;i++) {
    		 for(int j=i+1;j<sc;j++) {
    			 if(spl[i]>spl[j]) {
    				 char temp=spl[i];
    				 spl[i]=spl[j];
    				 spl[j]=temp;
    			 }
    		 }
    	 }
    	 
//    	 printing 
    	 for(int i=0;i<sc;i++) {
    		 System.out.print(spl[i]);
    	 }
    	 for(int i=0;i<nc;i++) {
    		 System.out.print(num[i]);
    	 }
    	 for(int i=0;i<ac;i++) {
    		 System.out.print(alp[i]);
    	 }
      }
}
