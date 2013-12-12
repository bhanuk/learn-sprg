import java.util.ArrayList;
import java.util.List;

/*
 * @author
 * Example on TypeParameter in genirics
 * This feature is added to java from java5 onwards
 * This incresee Type safetyness for a collection by providing
 * TypeParemeter Which is used by compiler to check wheteher entering objects of 
 * type safe or not
 * with this we can get the element without typecast . 
 * 
 * 
 */
public class TypeParameterEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Genirics take care both inserting and geting elements by enforcing
		 * type of your collectoins<String>
		 */
		List<String> list = new ArrayList<String>();
		list.add("bhanu");
		Integer i=new Integer(10);
		/*list.add(i);
		 * when tou try to add other than specified type to collection 
		 * compiler errror will generate an error
		 */
		System.out.println(list.get(0));
		/*
		 * when you get the element there is no need of type casting to specified to specified type
		 * 
		 */
		
		
		
		
		
		
		
		
		

	}

}
