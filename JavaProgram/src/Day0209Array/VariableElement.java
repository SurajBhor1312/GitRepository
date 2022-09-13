package Day0209Array;

public class VariableElement {
static void add(String a,int...a1)
{
	int sum=0;
	for(int i=0;i<a1.length;++i)
	{
		sum = sum+a1[i];
	}
	System.out.println("Addition is : "+sum);
}

static void add(int...a)
{
	int sum=0;
	for(int i=0;i<a.length;++i)
	{
		sum=sum+a[i];
	}
	System.out.println("Addition is : "+sum);
}

public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,6};
	add(arr);
	add(10,20,30);
	add(50,100,1);
}

}
