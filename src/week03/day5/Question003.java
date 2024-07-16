package week03.day5;

import java.util.Arrays;
import java.util.Scanner;

/*
3- Dizi boyutu ve dizi elemanlarý dýþarýdan alýnmak üzere dizi içerisindeki
 elemanlarýn ortalamasýný, standart sapmasýný ve medyanýný bulan program.
 */
public class Question003 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		double[]array = createArray();
		double mean = calculateAverage(array);
		double standardDeviation = calculateStandardDeviation(array,mean);
		double median = calculateMedian(array);
		printResults(mean,standardDeviation,median);
	
	
	}
	
	private static void printResults(double mean,double sandartDeviation, double median){
		System.out.println("Average: "+mean);
		System.out.println("Standard Deviatioon: "+ sandartDeviation);
		System.out.println("Median: "+median);
	}
	
	private static double calculateMedian(double[] array) {
		Arrays.sort(array);
		double median;
		int size = array.length;
		if (size % 2 == 0) {
			median = (array[size / 2 - 1] + array[size / 2]) / 2.0;
		} else {
			median = array[size / 2];
		}
		return median;
	}
	
	private static double calculateStandardDeviation(double[] array, double mean){
		//standart sapma hesaplama
		double sumOfSquaredDifferences = 0;
		for (double num: array){
			sumOfSquaredDifferences += (num-mean)*(num-mean);
		}
		double standardDeviation = Math.sqrt(sumOfSquaredDifferences / (array.length));
		return standardDeviation;
	}
	
	private static double calculateAverage(double[] array) {
		// Ortalama hesaplama
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		double mean = sum / array.length;
		return mean;
	}
	
	private static double[] createArray(){
		System.out.println("Dizinin boyutunu girin: ");
		int size = scanner.nextInt();
		
		double[] array = new double[size];
		System.out.println("Dizinin elemanlarini girin: ");
		for (int i = 0; i< size ; i++){
			System.out.println("Eleman "+(i+1)+": ");
			array[i] = scanner.nextDouble();
		}
		return array;
	}
	
}