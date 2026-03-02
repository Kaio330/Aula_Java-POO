package Sort;

import java.util.List;

public class Bubblesortclass {
	
			public List<Integer> sort(List<Integer> numbers) {
				boolean a = false;
				
				do {
					a = false;
				for (int i = 0; i < numbers.size()-1; i++) {
					
					if(numbers.get(i) > numbers.get(i + 1)) {
						swap(numbers, i);
						a = true;
						}
					}
					print(numbers);
				} while (a);
				
				return numbers;
			}

			private void print(List<Integer> numbers) {
				numbers.stream().forEach(System.out::print);
				System.out.println();
			}

			private void swap(List<Integer> numbers, int i) {
				Integer temp = numbers.get(i);
				numbers.set(i, numbers.get(i+1));
				numbers.set(i+1, temp);
			}
			
}
