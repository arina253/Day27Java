package one;

public class Day5b {

	public static void main(String[] args) {
		
		
		//TYPES= PROPERTIES+METHOD

		// Introvert || Extrovert
		// not social || social
		// calm || loud
		// less outing || more outing

		// Human
		// Properties - color , age , weight
		// Methods - walk(), talk()

		// Vehicle
		// Properties - color , model , regNo
		// Methods start() , stop()

		// Bank
		// Properties - bal , accNo , accName , city
		// Method - deposit() , withdrawl()

		// boolean canDriver = true;........BOOLEAN-TRUE/FALSE
		// int x = 10 ; // 7,-7,0,78
				

		// COMPARISON OPERATOR

		// < , > , <= , >= , != , ==

		// < -- less than
		// > -- greater than
		// <= -- less than or equal to
		// >= -- greater than or equal to
		// != -- not equal
		// == -- equal

		System.out.println(10 < 5);
		System.out.println(4 > 2);
		System.out.println(1 <= 2);
		System.out.println(9 >= 2);
		System.out.println(3 <= 1);
		System.out.println(4 >= 4);
		System.out.println(9!=9);
		System.out.println(8 != 4);
		System.out.println(5 == 4);
		System.out.println(10 == 10);
		

		// LOGICAL OPERATOR

		// 1) AND------&& (BOTH CONDITION SHOULD HOLD TRUE)

		// true && true -------> true
		// false && true -------> false
		// true && false -------> false
		// false && false -------> false

		System.out.println(6 == 6 && 9 == 9);
		System.out.println(9 != 7 && 5 == 5);
		System.out.println(4 == 4 && 2 != 2);
		System.out.println(9 != 9 && 2 != 7);

		// 2) OR-----|| (ONLY ONE CONDITION NEED TO BE SATISFIED)

		// true || true -------> true
		// false || true -------> true
		// true || false -------> true
		// false || false -------> false

		System.out.println(7 == 8 || 2 == 9);
		System.out.println(5 == 5 || 6 == 8);
		System.out.println(5 == 2 || 5 == 5);
		System.out.println(2 == 2 || 1 == 1);

		// 3) NOT-----! (IF TRUE WILL SHOW FALSE & IF FALSE WILL SHOW TRUE)

		// true! ---- false
		// false! ---- true

		System.out.println(!(4 == 4));
		System.out.println(!(4 == 3));
		System.out.println(!(9 == 10));

	}

}
