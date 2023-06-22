package com.sheet;

import java.util.Arrays;

import com.sheet.sort.pratice.SwapingString;

public class Sort0s1s2s {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		sort012(arr, arr_size);
		printArray(arr, arr_size);

	}

	private static void printArray(int[] arr, int arr_size) {

		String string = Arrays.toString(arr);
		System.out.print(string + " ");

	}

	private static void sort012(int[] arr, int size) {

		int zero = 0, one = 0, two = 0;
		int l = 0, m = 0, h = size - 1;
		int temp;
		/*
		 * for (int i = 0; i < size; i++) { switch (arr[i]) { case 1: one++; break; case
		 * 0: zero++; break; case 2: two++; break; } }
		 */
		//{ 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		/*while (m <= h) {
			switch (arr[m]) {

			case 0:
				temp = arr[l];
				arr[l] = arr[m];
				arr[m] = temp;
				l++;
				m++;
				break;

			case 1:
				m++;
				break;
			case 2:
				temp = arr[m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
				break;

			}
		}*/
		
        
        while(m<=h){
            if(arr[m]==0){
            	 temp=arr[l];
                 arr[l]=arr[m];
                 arr[m]=temp;
                l++;
                m++;
                continue;
            }
            if(arr[m]==1){
                m++;
                continue;
            }
            if(arr[m]==2){
            	 temp=arr[m];
                 arr[m]=arr[h];
                 arr[h]=temp;
                h--;
                continue;
            }
        }
    }
    
   

	}


