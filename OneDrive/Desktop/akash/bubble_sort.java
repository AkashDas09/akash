import java.util.*;
class bubble_sort 
{
	public static void main(String[] args) 
	{
		int []x={77,6,3,88,75};
		System.out.println(Arrays.toString(x));
		for(int i=0;i<x.length-1;i++)
		{
			for(int j=0;j<x.length-1-i;j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(x));
	}
}
