import java.util.Collections;


public class QuickSort {

	public static int partition(int arr[],int l,int r){
		
		int pivot = arr[l];
		int i=l+1;
		for(int j=l+1;j<arr.length;j++){
			if(arr[j]<pivot){
				//swap
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		int temp = arr[l];
		arr[l]=arr[i-1];
		arr[i-1]=temp;
		   return i-1;
		
	}
	public static int[] qSort(int arr[],int left ,int right){
		if(left<right){
			int index =  partition(arr,left,right);
			qSort(arr,index+1,right);
			qSort(arr,left,index-1);
		}
		return arr;
	}
	public  static void main(String[]args){
		int arr[] = {3,8,2,5,1,4,7,6};
		
		int array[] = qSort(arr,0,7);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
}
