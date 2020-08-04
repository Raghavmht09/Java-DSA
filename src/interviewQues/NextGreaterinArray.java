package interviewQues;

public class NextGreaterinArray {

	public static void printNGE(int arr[],int n) {
	int i,j,next;

for (i=0;i<n;i++) {
	next=-1;
	for (j=i+1;j<n;j++) {
		if(arr[i]<arr[j]) {
			next= arr[j];
			break;
			
		}
		
		}
	System.out.println(arr[i]+"has nesxt greater element"+""+
		next	);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,4,5,10};
int n=arr.length;
printNGE(arr,n);
	}

}
