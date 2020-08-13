import java.util.*;
public class Arrconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
int n = sc.nextInt();
int k = sc.nextInt();

long a=0;
long sum=0;
int[] arr = new int[n];

for(int i=0;i<n;i++){
	arr[i]=sc.nextInt(); 
	a+=arr[i];
	sum+=arr[i];
}
a*=k;
if(k==1) {
	int tem[]=new int[n];
	for(int i=0;i<n;i++)
		tem[i]=arr[i];
	
	long ma=tem[0];
	long le=tem[0];
	for(int j=1;j<n;j++) {
		if(le>0)
			le+=tem[j];
		else
			le=tem[j];
		if(le>ma)
			ma=le;
	}
	if(a>ma)
		System.out.println(a);
	else
		System.out.println(ma);
}
else {
	int tem[]=new int[2*n];
	for(int i=0;i<n;i++) {
		tem[i]=arr[i];
	}
	for(int i=n;i<2*n;i++) {
		tem[i]=arr[i-n];
	}
	long ma=tem[0];
	long le=tem[0];
	for(int j=1;j<2*n;j++) {
		if(le>0)
			le+=tem[j];
		else
			le=tem[j];
		if(le>ma)
			ma=le;
	}
	if(sum>0&&k>2)
		ma+=sum*(k-2);
	if(a>ma)
		System.out.println(a);
	else
		System.out.println(ma);
	
}
	}

}
