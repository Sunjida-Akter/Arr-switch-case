
class Main { public static void main(String[] args) { 
int[] numbers = {0,-1, 9, 1, 25, -7, -12, 0, -3, 8}; 
int sum = 0;
Double average;
  for (int number: numbers) 
  { 
  sum += number; 
} 
  int arrayLength = numbers.length; 
  average =((double)sum / (double)arrayLength); 
System.out.println("Sum = " + sum); 
System.out.println("Average = " + average);
 }
 }
