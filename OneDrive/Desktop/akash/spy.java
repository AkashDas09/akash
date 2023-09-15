 class spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=132;
      int product=0;
      int sum=0;
      
      int k=x;
      while(x>0)
      {
    	  int y=x%10;
    	  sum=sum+y;
    	  product=product*y;
		  x=x/10;
      }
      if(sum==k)
      {
    	  System.out.println("spy number");
      }
      else
      {
    	  System.out.println("not spy");
      }
	}

}

