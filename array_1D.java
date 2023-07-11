package com.arr;
import java.util.*;

public class array_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the length of the first array:");
				int length1=sc.nextInt();
				int []a=new int[length1];
				System.out.println("Enter the elements of the first array:");
				for(int i=0; i<length1; i++ ) {
			         a[i] = sc.nextInt();
			      }
				System.out.println(Arrays.toString(a));
				System.out.println("Enter the length of the second array:");
				int length2=sc.nextInt();
				int []b=new int[length2];
				System.out.println("Enter the elements of the second array:");
				for(int j=0;j<length2;j++) {
					b[j]=sc.nextInt();
				}
				System.out.println(Arrays.toString(b));
				System.out.println("1. print maximum element in an array");
				System.out.println("2. Sum of two arrays");
				System.out.println("3. compatable array (a>=b)");
				System.out.println("4. search an element");
				System.out.println("5. sum of even numbers in an array");
				
				System.out.println("6. finding distinct element in an array");
				System.out.println("7. find the sum of both even and odd number arrays");
				System.out.println("8. compare two arrays");
				System.out.println("9. insertion of new element");
				System.out.println("10. deletion of element");
				System.out.println("11. find A.M, Median, Mode in an array");
				System.out.println("12. Range of an array");
				int length= a.length < b.length ? a.length : b.length;
				int []z=new int[length];
				int q,p;
				int k=sc.nextInt();
				switch (k) {
				
				
				
			      case 1:
			    	  int max1 = a[0];
			          for (int i = 1; i <length1; i++)
			              if (a[i] > max1)
			                  max1 = a[i];
			        System.out.println("Maximum element in first array "+max1);
			        int max2 = b[0];
			          for (int i = 1; i <length2; i++)
			              if (b[i] > max2)
			                  max2 = b[i];
			        System.out.println("Maximum element in second array "+max2);
			        break;
			        
			        
			        
			        
			      case 2:
			    	  for(int i=0;i<length;i++) {
			    		  z[i]=a[i]+b[i];
			    	  }
			    		  
			        System.out.println(Arrays.toString(z));
			        break;
			        
			        
			        
			     
			      case 3:
			        for(int i=0;i<length;i++) {
			        	if(a[i]>=b[i]) {
			        		System.out.println("Compatable");
			        	}
			        	else
			        		System.out.println("Not Compatable");
			        }
			        break;
			        
			        
			        
			        
			        
			        
			        
			      case 4:
			    	p=0;
			        int search=sc.nextInt();
			        for(int i=0;i<length1;i++) {
			        	if(search==a[i]) {
			        		p = 1;
			        		break;
			        	}
			        }
			        if(p==1)
			        	System.out.println(search+" found in 1st array");
			        else
			        	System.out.println(search+" not found in 1st array");
			        for(int i=0;i<length2;i++) {
			        	if(search==b[i]) {
			        		p = 2;
			        		break;
			        	}
			        }
			        if(p==2)
			        	System.out.println(search+" found in 2nd array");
			        else
			        	System.out.println(search+" not found in 2nd array");
			        
			        break;
			        
			        
			        
			        
			        
			        
			        
			      case 5:
			    	  q=0;
			    	  for(int i=0;i<length1;i++) {
			    		  if(a[i]%2==0) {
			    			  q=q+a[i];
			    		  }
			    	  }
			  		System.out.println("Sum of even numbers in first array "+q);
			  		q=0;
			  		for(int i=0;i<length2;i++) {
			    		  if(b[i]%2==0) {
			    			  q=q+b[i];
			    		  }
			    	  }
			  		System.out.println("Sum of even numbers in second array "+q);
			        break;
			        
			        
			        
			        
			        
			      case 6:
			    	  System.out.print("Distinct element in first array ");
			    	  for(int i=0;i<length1;i++) {
			    		  int j;
			    		  for(j=0;j<i;j++) 
			    			  if (a[i] == a[j])
			    				  break;
			    		     
			    		            // If not printed earlier,
			    		            // then print it
			    			  if (i == j)
			    		        System.out.print(a[i] + " ");
			    	  }
			    	  System.out.println("");
			    	  System.out.print("Distinct element in second array ");
			    	  for(int i=0;i<length2;i++) {
			    		  int j;
			    		  for(j=0;j<i;j++) 
			    			  if (b[i] == b[j])
			    				  break;
			    		     
			    		            // If not printed earlier,
			    		            // then print it
			    			  if (i == j)
			    		        System.out.print(b[i] + " ");
			    	  }
			        break;
			        
			        
			        
			        
			        
			        
			      case 7:
			    	  q=0;
			    	  p=0;
			    	  for(int i=0;i<length1;i++) {
			    		  if(i%2==0) {
			    			  q=q+a[i];
			    		  }
			    		  else
			    			  p=p+a[i];
			    	  }
			  		System.out.println("find the sum of both even and odd number in first array is");
			  		System.out.print("even  "+q+" odd  "+p);
			  		q=0;
			    	  p=0;
			    	  for(int i=0;i<length2;i++) {
			    		  if(i%2==0) {
			    			  q=q+b[i];
			    		  }
			    		  else
			    			  p=p+b[i];
			    	  }
			  		System.out.print("even  "+q+" odd  "+p);
			        break;
			        
			        
			        
			        
			        
			        
			        
			      case 8:
			    	  System.out.println("Compare two arrays");
			    	  System.out.println("Arrays.equals() results: " + Arrays.equals(a,b));
			    	  Object[] objArray1 = {a};
			          Object[] objArray2 = {b};
			          System.out.println("Arrays: objArray1 = {a}, objArray1 = {b}");
			          System.out.println("Arrays.equals() results: " + Arrays.equals(objArray1,objArray2));
			          System.out.println("Arrays.deepEquals() results: " + Arrays.deepEquals(objArray1,objArray2));
				    break;
				    
				    
				    
				    
				    
			      case 9:
			    	//insertion of element
			    	  System.out.println("1. Insertion in first array");
			    	  System.out.println("2. Insertion in Second array");
			    	  int j=sc.nextInt();
			    	  switch (j) {
			    	  case 1:
			    		  System.out.print("Enter the pos: ");
			    		  int pos=sc.nextInt();
			    		  System.out.print("Enter the Element: ");
			    		  int Ele=sc.nextInt();
			    		  int h1[]=new int[a.length+1];
			    		  for(int i=0,j1=0;i<h1.length;i++) {
			    			  if(i==pos) {
			    			  h1[i]=Ele;
			    			  }
			    			  else {
			    				  h1[i]=a[j1];
			    				  j1++;
			    			  }
			    		  }
			    		  h1[pos]=Ele;
			    		  System.out.println(Arrays.toString(h1));
			    		  break;
			    		  
			    		  
			    	  case 2:
			    		  System.out.println("Enter the pos: ");
			    		  int posi=sc.nextInt();
			    		  System.out.print("Enter the Element ");
			    		  int Elem=sc.nextInt();
			    		  int h2[]=new int[b.length+1];
			    		  for(int i=0,j2=0;i<h2.length;i++) {
			    			  if(i==posi) {
				    			  h2[i]=Elem;
				    			  }
				    			  else {
				    				  h2[i]=b[j2];
				    				  j2++;
				    			  }
				    		  }
			    		  h2[posi]=Elem;
			    		  System.out.println(Arrays.toString(h2));
			    		  break;
			    	  }
			    	  break;
			    	  
			    	  
			    	  
			    	  
			      case 10:
			    	  // deletion of element only
			    	  System.out.println("1. Deletion in first array");
			    	  System.out.println("2. Deletion in Second array");
			    	  int y=sc.nextInt();
			    	  switch (y) {
			    	  case 1:
			    		  System.out.print("Enter the Element: ");
			    		  int Ele=sc.nextInt();
			    		  int h1[]=new int[a.length-1];
			    		  int j1=0;
			    		  for(int i=0;i<h1.length;i++) {
			    			  if(a[i]==Ele) {
			    				  h1[i]=a[i+1];
			    			  }
			    			  else {
			    				  h1[i]=a[j1];
			    				  j1++;
			    			  }
			    		  }
			    		  System.out.println(Arrays.toString(h1));
			    		  break;
			    
			    		  
			    		  
			    	  case 2:
			    		  //deletion with respect to position
			    		  System.out.println("Enter the pos: ");
			    		  int posi=sc.nextInt();
			    		  System.out.print("Enter the Element ");
			    		  int Elem=sc.nextInt();
			    		  int h2[]=new int[b.length-1];
			    		  for(int i=0,j2=0;i<h2.length;i++) {
			    			  if(b[i]==Elem && i==posi) {
				    			  h2[i]=b[i+1];
				    			  }
				    			  else {
				    				  h2[i]=b[j2];
				    				  j2++;
				    			  }
				    		  }
			    		  System.out.println(Arrays.toString(h2));
			    		  break;
			    
			    	  }
			    	  break;
			    	  
			    	  
			    	  
			    	  
			    	  
			      case 11:
			    	  // find a.m, median,mode of an array
			    	  //mean
			    	  q=0;
			    	  p=0;
			    	  for(int i=0;i<length1;i++) {
			    		  q=q+a[i];
			    	  }
			    	  double f=(double) q/length1;
			    	  System.out.println("Arthematic mean of 1st array "+f);
			    	  q=0;
			    	  p=0;
			    	  for(int i=0;i<length2;i++) {
			    		  q=q+b[i];
			    	  }
			    	  double s=(double) q/length2;
			    	  System.out.println("Arthematic mean of 2nd array "+s);
			    	  
			    	  
			    	  //median
			    	// for(int i=0;i<length1;i++) {
			    		//  if(a[i]>a[i+1]) {
			    			// z[i]=a[i];
			    			  //a[i]=a[i+1];
			    			  //a[i+1]=z[i];
			    			  
			    		//  }	  
			    	//  }
			    	  Arrays.sort(a);
			    	  Arrays.sort(b);
			    	  // median for 1st array
			    	  if(length1%2 != 0) {
			    		  System.out.println("Median of first array "+(double) a[length1/2]);
			    	  }
			    	  else
			    		  System.out.println("Median of first array "+(double) (a[(length1 - 1) / 2] + a[length1 / 2]) / 2.0); 
			    	  
			    	  // median for 2nd array
			    	  if(length2%2 != 0) {
			    		  System.out.println("Median of second array "+(double) b[length2/2]);
			    	  }
			    	  else
			    		  System.out.println("Median of second array "+(double) (b[(length2 - 1) / 2] + b[length2 / 2]) / 2.0);
			    	  
			    	  
			    	  //Mode for 1st array
			    	  int maxValue=0,maxCount=0;
			    	  for(int i=0;i<length1;i++) {
			    		  int count=0;
			    		  for(int jr=0;jr<length1;jr++) {
			    		  if(a[i]==a[jr]) 
			    			  ++count;
			    		  }
			    	  if(count > maxCount) {
			    		  maxCount=count;
			    		  maxValue=a[i];
			    	  }
			    	  }
			    	  System.out.println("Mode of first array "+maxValue);
			    	  
			    	  
			    	  //mode for 2nd array
			    	  int maxValue2=0,maxCount2=0;
			    	  for(int i=0;i<length2;i++) {
			    		  int count=0;
			    		  for(int jr=0;jr<length2;jr++) {
			    		  if(b[i]==b[jr]) 
			    			  ++count;
			    		  }
			    	  if(count > maxCount2) {
			    		  maxCount2=count;
			    		  maxValue2=b[i];
			    	  }
			    	  }
			    	  System.out.println("Mode of Second array "+maxValue2);
			    	  break;
			    	  
			    	  
			    	 
			    	  
			    	  
			    	  
			      case 12:
			    	  // range of an array
			    	  Arrays.sort(a);
			    	  int small1=a[length1]-a[0];
			    	  System.out.println("Range of first array"+small1);
			    	  Arrays.sort(b);
			    	  int small2=b[length2]-b[0];
			    	  System.out.println("Range of Second array"+small2);
			    	  break;
				        
				}
				sc.close();
	}

}
