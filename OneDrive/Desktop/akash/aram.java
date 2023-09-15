import java.util.Scanner;
class aram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner a=new Scanner(System.in);
    System.out.println("Enter the size of inner array");
    int row=a.nextInt();
    System.out.println("Enter the  size of an base array");
	int col=a.nextInt();
    int [][]x=new int[row][col];
    System.out.println("Enter the element of ana array");
    for(int i=0;i<x.length;i++)
    {
    	for(int j=0;j<x[i].length;j++)
    	{
    		x[i][j]=a.nextInt();
    	}
    }
    System.out.println("Element are below ");
    for(int i=0;i<x.length;i++)
	{
    	for(int j=0;j<x[i].length;j++)
    	{
    		System.out.print(x[i][j]);
    	
    	System.out.println(" ");
    	}
	}
	}
}