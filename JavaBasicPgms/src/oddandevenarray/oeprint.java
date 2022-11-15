package oddandevenarray;

public class oeprint {
void even(int[] arr,int l) {
System.out.println("Even numbers are : ");
for(int i=0;i<l;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]);
	}
}
}
void odd(int[] arr,int l) {
	System.out.println("Odd numbers are : ");
	for(int i=0;i<l;i++) {
		if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
     }
  }
}
