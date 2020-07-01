
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// this was an interview question that I wanted to solve on my own.
		// 6/30/2020

		// Given a list of number lists,
		// 6,2
		//1,2
		//3,2
		//2,4
		//1,5
		//1,6
		//find out the valid ordered list of numbers according to the lists
		List<List<Integer>> inputsList = new ArrayList<List<Integer>>();
		List<Integer> input = new ArrayList<Integer>();
		
		input = new ArrayList<Integer>();
		input.add(6,2);
		inputsList.add(input);
		
		input = new ArrayList<Integer>();
		input.add(1,2);
		inputsList.add(input);

		input = new ArrayList<Integer>();
		input.add(3,2);
		inputsList.add(input);
		
		input = new ArrayList<Integer>();
		input.add(2,4);
		inputsList.add(input);
		
		input = new ArrayList<Integer>();
		input.add(1,5);
		inputsList.add(input);
		
		input = new ArrayList<Integer>();
		input.add(1,6);
		inputsList.add(input);
		
		
	}
	
	public List<Integer> findSequence(int N, List<List<Integer>> jobPairs){
		List<Integer> sequenceList = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			
		}
		return sequenceList;
	}
}
