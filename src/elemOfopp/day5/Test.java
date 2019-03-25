package elemOfopp.day5;

import java.util.Vector;

import java.util.Scanner;;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Double> vector = new Vector<Double>();
		double score;
		double maxNum = 0;

		do {
			score = scanner.nextDouble();
			Double score2 = score;
			vector.addElement(score2);
		} while (score >= 0);
		
		
		System.out.println(vector.size());
		for (int i = 0; i < vector.size(); i++) {
			double d2 = vector.elementAt(i).doubleValue();
			maxNum = (maxNum > d2) ? maxNum : d2;
		}
		for (int i = 0; i < vector.size(); i++) {
			double d3 = vector.elementAt(i).doubleValue();
			if (d3 >= 0) {
				if (maxNum - d3 <= 10) {
					System.out.println(d3 + " :A");
				} else if (maxNum - d3 <= 20) {
					System.out.println(d3 + " :B");
				} else if (maxNum - d3 <= 30) {
					System.out.println(d3 + " :C");
				} else {
					System.out.println(d3 + " :D");
				}
			}

		}
		System.out.println(maxNum);
		scanner.close();
	}

}
