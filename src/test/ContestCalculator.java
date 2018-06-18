package test;

import java.util.ArrayList;

public class ContestCalculator {
	Double butchTotal;

	ArrayList<Double> calculateWinner(ArrayList<Double> WyateErpsNuggets, ArrayList<Double> ButchCassidaysNuggets) {
		for (Double double1 : ButchCassidaysNuggets) {
			butchTotal = butchTotal + double1;
		}
		System.out.println(butchTotal);
		ArrayList<Double> a = new ArrayList<Double>();
		return a;
	}
}
