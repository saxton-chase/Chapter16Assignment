import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RectangleSortTest {

	public static void main(String[] args) throws Exception {
		
		Rectangle testRec3 = new Rectangle(10,20);
		Rectangle testRec = new Rectangle(2.7,5.3);
		Rectangle testRec2 = new Rectangle(3,5);
		
		
		List<Double> list = Arrays.asList(testRec2.calculateArea(),testRec.calculateArea(),testRec3.calculateArea());
		System.out.print("Unsorted list");
		System.out.print(list);
		list.sort(Comparator.naturalOrder());
		System.out.print("\nsorted list");
		System.out.print(list);
		
		
		
		
	}

}
