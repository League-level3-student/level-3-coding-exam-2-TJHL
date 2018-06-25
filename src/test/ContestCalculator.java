package test;

import java.util.ArrayList;

public class ContestCalculator  {
	
	

	ArrayList<Double> calculateWinner(ArrayList<Double> WyateErpsNuggets, ArrayList<Double> ButchCassidaysNuggets) {
		double butchTotal=0;
		double wyateTotal=0;
		
		for (Double double1 : ButchCassidaysNuggets) {
			butchTotal = butchTotal + double1;
		}
		
		for (Double double2 : WyateErpsNuggets) {
			wyateTotal = wyateTotal + double2;
		}
		
		if(wyateTotal>butchTotal) {
			return WyateErpsNuggets;
		}
		if(butchTotal>wyateTotal){
			return ButchCassidaysNuggets;
			
		}
		else {
			return null;
		}
		
		
	}
}
