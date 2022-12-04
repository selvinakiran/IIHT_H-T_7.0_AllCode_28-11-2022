import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CompetitiveTest {

	public static void main(String[] args)
	{
		
		List<Institution> institute = new ArrayList <Institution>();
		institute.add(new Institution(1001,"JEE","RAM",15,15000));
		institute.add(new Institution(1002,"CAT","SAM",6,10000));
		institute.add(new Institution(1003,"NEET","VANI",3,20000));
		institute.add(new Institution(1004,"CSIR NET","RAJA",16,30000));
		institute.add(new Institution(1005,"UPSC ESE","RAVI",8,50000));
		institute.add(new Institution(1006,"IIT-JAM","RIYA",13,80000));
		institute.add(new Institution(1007,"MCA","REEMA",24,100000));
		institute.add(new Institution(1008,"BANK PO","JONI",36,25000));
		institute.add(new Institution(1009,"ICAR","ROCKY",26,60000));
		institute.add(new Institution(1010,"TED","RICKO",17,70000));
		institute.add(new Institution(1011,"SED","LIYA",20,5000));
		institute.add(new Institution(1012,"IIT-HSEE EXAM","ROBI",4,45000));
		institute.add(new Institution(1013,"J2EE","JOHN",48,35000));
		institute.add(new Institution(1014,"GPAT","ZIYA",56,55000));
		institute.add(new Institution(1015,"TNPSC","ZIVA",22,3000));
		
		Collections.sort(institute, new Comparator<Institution>() {
			@Override
			public int compare(Institution o1, Institution o2) {
				return (int) (o2.getTotal_fees() -o1.getTotal_fees());
			}
		});
		
		Collections.sort(institute, new Comparator<Institution>() {
			@Override
			public int compare(Institution o1, Institution o2) {
				return (int) (o2.getCourse_duration() -o1.getCourse_duration());
			}
		});
		
			
		
		//Test case 1 completed 	
	Collections.sort(institute,(o1,o2) -> (int) (o1.getTotal_fees() -o2.getTotal_fees()));
	System.out.println("Ascending Order::"+institute);
	Collections.sort(institute,(o1,o2) -> (int) (o2.getTotal_fees() -o1.getTotal_fees()));
	System.out.println("Decending Order::"+institute);
	
	//Test case 2 completed 
	Collections.sort(institute,(o1,o2) -> (int) (o1.getCourse_duration() -o2.getCourse_duration()));
	System.out.println("Ascending Order for Duration ::"+institute);
		
	
	//We can also use streamAPI,collection and method references	
		
		
	}

}










