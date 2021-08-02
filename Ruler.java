package siddiqui;

public class Ruler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       rulerz(3,4);
	}
	public static void rulerz(int in,int tl)
	{
		for(int i=1;i<=in;i++)
		{  
			for(int j=1;j<=tl;j++)
			{
				System.out.print("- ");
			}
			System.out.println(i-1);
			rules(tl-1);
		}
		for(int i=1;i<=tl;i++)
		{
			System.out.print("- ");
		}
		System.out.print(in);
	}
    public static void rules(int tl)
    {
    	if(tl==0)
    		return;
    	rules(tl-1);
    	for(int i=1;i<=tl;i++)
    	{
    		System.out.print("- ");
    	}
    	System.out.println();
    	rules(tl-1);
    }
}
