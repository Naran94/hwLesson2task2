package com.company;

public class Main {
	public static void main(String[] args) {
		// 2  Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
		int[] array = new int[8];
		int j = 0;
		int maxMass = array.length;
		for(int i = 0; i < maxMass; i++) {
		}

		for(int i = 0; i < maxMass; i++, j = j+3)
		{array[i] = j;
		}

		for(int i = 0; i < maxMass; i++)
		{
			System.out.print (i + "-" + array[i]+" ");
		}
	}
}

