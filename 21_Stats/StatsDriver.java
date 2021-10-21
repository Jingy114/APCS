/*
Nafiz Labib, Jing Yi Feng, Jomin Zhang - Heroes of the Zeroes
APCS
HW 21 - STAtisTically Speaking...
2021-10-20
*/
public class StatsDriver{
	public static void main (String[] args){
	Stats teacher = new Stats();
	// creates new object with class Stats
	System.out.println(teacher.mean(1,2));
	// While answer is 1.5, java has to return an integer, so it rounds down to 1.
	System.out.println(teacher.mean(10,10));
	// returns 10
	System.out.println(teacher.mean(-10,-10));
	// returns -10
	System.out.println(teacher.mean(-10.0,-2.0));
	// returns -6.0
	System.out.println(teacher.mean(0,10));
	// returns 5
	System.out.println(teacher.mean(10,5.0));
	// returns 7.5
	System.out.println(teacher.mean(-10,5));
	// returns -2
/*
	System.out.println(teacher.mean(0));
	// Does not run
	System.out.println(teacher.mean(0,0,0));
	// Does not run
	System.out.println(teacher.mean());
	// Does not run
	THESE DO NOT RUN BECAUSE THESE ARE NOT APPLICABLE TO MEAN METHODS
*/		
	System.out.println(teacher.max(1,2));
	// returns 2
	System.out.println(teacher.max(1,2));
	// returns 2
	System.out.println(teacher.max(0,0));
	// returns 0
	System.out.println(teacher.max(10,10.0));
	// returns 10.0
	System.out.println(teacher.max(-10,0));
	// returns 0
/*
	System.out.println(teacher.max());
	// Does not run
	System.out.println(teacher.max(1,2,3));
	// does not run
	THESE DO NOT RUN BECAUSE THESE ARE NOT APPLICABLE TO MAXIMUM METHODS
*/

	System.out.println(teacher.geoMean(1,2));
	// returns 1.0
	System.out.println(teacher.geoMean(1.0,2.0));
	// returns approximation of square root of 2
	System.out.println(teacher.geoMean(0,1));
	// returns 0.0
	System.out.println(teacher.geoMean(1,1));
	// returns 1.0
	System.out.println(teacher.geoMean(-2,-3));
	// returns 2.0
/*
	teacher.geoMean(-1,3);
	// Does not run
	// YOU CANNOT FIND THE SQAURE ROOT OF A NEGATIVE NUMBER
*/
	System.out.println(teacher.max(1,2,3));
	// returns 3
	System.out.println(teacher.max(1.0,3.0,2.0));
	// returns 3.0
	System.out.println(teacher.max(1,1,2));
	// returns 2
	System.out.println(teacher.max(1.0,2.0,1.0));
	// returns 2.0
	System.out.println(teacher.max(2,2,2));
	// returns 2
	System.out.println(teacher.max(-1.0,-2.0,-2.0));
	// returns -1.0

	System.out.println(teacher.geoMean(1,2,3));
	// returns 1
	System.out.println(teacher.geoMean(1.0,2.0,3.0));
	// returns approximation of cube root of 6
	System.out.println(teacher.geoMean(-1,-2,-3));
	// returns -1
	System.out.println(teacher.geoMean(0,2,3));
	// returns 0
	System.out.println(teacher.geoMean(2.0,2.0,2.0));
	// returns 2.0
	
	}
}
