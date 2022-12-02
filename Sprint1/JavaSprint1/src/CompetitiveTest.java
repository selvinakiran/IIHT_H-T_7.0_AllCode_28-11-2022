import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CompetitiveTest {

	public static void main(String[] args)
	{
		
		List<Institution> institute = new ArrayList <Institution>();
		institute.add(new Institution(1001,"JEE","RAM",1.3f,15000));
		institute.add(new Institution(1002,"CAT","SAM",0.6f,10000));
		institute.add(new Institution(1003,"NEET","VANI",0.3f,20000));
		institute.add(new Institution(1004,"CSIR NET","RAJA",1.5f,30000));
		institute.add(new Institution(1005,"UPSC ESE","RAVI",0.8f,50000));
		institute.add(new Institution(1006,"IIT-JAM","RIYA",1.3f,80000));
		institute.add(new Institution(1007,"MCA","REEMA",2.0f,100000));
		institute.add(new Institution(1008,"BANK PO","JONI",3.0f,25000));
		institute.add(new Institution(1009,"ICAR","ROCKY",2.5f,60000));
		institute.add(new Institution(1010,"TED","RICKO",1.5f,70000));
		institute.add(new Institution(1011,"SED","LIYA",1.6f,5000));
		institute.add(new Institution(1012,"IIT-HSEE EXAM","ROBI",0.8f,45000));
		institute.add(new Institution(1013,"J2EE","JOHN",1.8f,35000));
		institute.add(new Institution(1014,"GPAT","ZIYA",0.5f,55000));
		institute.add(new Institution(1015,"TNPSC","ZIVA",1.5f,3000));
		
		Collections.sort(institute, new Comparator<Institution>() {
			@Override
			public int compare(Institution o1, Institution o2) {
				return (int) (o2.getTotal_fees() -o1.getTotal_fees());
			}
		});
		
		
		
	Collections.sort(institute,(o1,o2) -> (int) (o1.getTotal_fees() -o2.getTotal_fees()));
	System.out.println("Ascending Order::"+institute);
	Collections.sort(institute,(o1,o2) -> (int) (o2.getTotal_fees() -o1.getTotal_fees()));
	System.out.println("Decending Order::"+institute);
		
	//Test case 1 completed 
		
		
		
	}

}


//class sorting implements Comparator<Institution>
//{
//
//	@Override
//	public int compare(Institution o1, Institution o2) {
//		// TODO Auto-generated method stub
//		return (int) (o2.getTotal_fees() -o1.getTotal_fees());
//	}
//	
	







