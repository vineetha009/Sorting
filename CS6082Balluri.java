import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS6082Balluri {
	
	public static void main(String []args)throws FileNotFoundException
	{    
		
		
		 System.out.println("Name:vineetha Alluri");
		 System.out.println("course id:CS608");
		 System.out.println(java.time.LocalDate.now());
		CS6082Balluri ob=new CS6082Balluri();
		long s1= System.nanoTime();
		ob.bubble();
		long e1 = System.nanoTime();
		long D1=e1-s1;
		System.out.println("Nanoseconds taken to complete bubble sort:"+D1);
		System.nanoTime();
		long s2=System.nanoTime();
		ob.selection();
		long e2 = System.nanoTime();
		long D2=e2-s2;
		System.out.println("Nanoseconds taken to complete Selection sort:"+D2);
		long s3=System.nanoTime();
		ob.DoubleSelection();
		long e3 = System.nanoTime();
		long D3=e3-s3;
		System.out.println("Nanoseconds taken to complete DoubleSelection sort:"+D3);
	}
	
 public int[] input()throws FileNotFoundException
{

FileInputStream ts=new FileInputStream("C:\\Users\\Vineetha\\Desktop\\inputData2B.txt");
Scanner sc=new Scanner(ts);
int num[]=new int[1000];
int i=0;
while(sc.hasNextInt())
{ 
   
   num[i]=sc.nextInt();
   i++;
}
sc.close();
return num;

	}
	
  void bubble()throws FileNotFoundException
	{
	        int count=0;
		    int[] num1=input();
	        int j;
	    	boolean swap=true;
	    	while(swap)
	    	{count++;
	    		
	    	swap=false;
	    	for(int i=0;i<num1.length;i++)
	    	{
	    		count++;
	    	for(j=0;j<num1.length-1;j++)
	    	{
	    		count++;
	    		if(num1[j]>num1[j+1])
	    		{
	    			count++;
	    			int temp;
	    			temp=num1[j];
	    			num1[j]=num1[j+1];
	    			num1[j+1]=temp;
	    			swap=true;
	    		}   
	    	}
	    	}
	    	}
	    	
	    	System.out.println("Output of bubble sort");
	    	System.out.println(" " +num1[100]);
	    	System.out.println(" " +num1[125]);
	    	System.out.println(" " +num1[250]);
	    	System.out.println(" " +num1[700]);
	    	System.out.println(" " +num1[900]);
	    	System.out.println("Number of comparisions made:" +count);
	    	
	}
	void selection()throws FileNotFoundException
	{
	    int count=0;
		int[] num2=input();
		for(int j=0;j<num2.length-1;j++)
		{
			count++;
		int min=j;
		for(int k=j+1;k<num2.length;k++)
		{
			count++;
		if(num2[k]<num2[min])
		{
			count++;
			min=k;
		}
		}
		int temp;
		temp=num2[j];
		num2[j]=num2[min];
		num2[min]=temp;
		}
		System.out.println("Output of selection sort");
    	System.out.println(" " +num2[100]);
    	System.out.println(" " +num2[125]);
    	System.out.println(" " +num2[250]);
    	System.out.println(" " +num2[700]);
    	System.out.println(" " +num2[900]);
    	System.out.println("Number of comparisions made:" +count);
	}
	void DoubleSelection()throws FileNotFoundException
	{
		int count=0;
		int[] num3=input();
		int t=num3.length;
		
		   
		   for(int m=0;m<t/2;m++)
		   {count++;
			   if(num3[m]>num3[t-m-1])
			   {count++;
				   int temp=num3[m];
				   num3[m]=num3[t-m-1];
				   num3[t-m-1]=temp;
			   }
			   for(int j=m;j<=t-1;j++)  
			   {count++;
				   if(num3[m]>num3[j])
					 {count++;
						 int temp=num3[m];
						 num3[m]=num3[j];
						 num3[j]=temp;
						 
					 }
			   }
				for(int h=t-1;h>=t/2;h--)
				{count++;
					 if(num3[t-m-1]>num3[h])
					 {count++;
						 int temp=num3[h];
				         num3[h]=num3[t-m-1];
					     num3[t-m-1]=temp;
					 }
				}
		   }
		   
		 
		System.out.println("Output of Double selection sort");
		System.out.println("A[100]: " +num3[100]);
		System.out.println("A[125] " +num3[125]);
		System.out.println("A[250] " +num3[250]);
		System.out.println("A[700] " +num3[700]);
		System.out.println("A[900] " +num3[900]);
		System.out.println("Number of comparisions made:" +count);
		
	}
}

