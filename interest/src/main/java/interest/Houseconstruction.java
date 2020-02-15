package interest;

import java.util.Scanner;

public class Houseconstruction {
	
	 public static void main (String argu[ ])
	 {
	     Scanner sc=new Scanner (System. in);
	     System.out.println("Enter the total area:");
	     double area=sc.nextDouble();
	     System.out.println("Enter the type of standard \n1.standard_material \n2.above_standard_material\n3.high_standard_material \n4.high_standard_material_and_fullyautomated");
	     int choice=sc.nextInt();
	     switch(choice)
	     {
	     case 1:standard_material hsm= new standard_material(area);
	          System.out.println("Total cost :"+hsm.calculate());
	          break;
	     case 2:above_standard_material hasm= new above_standard_material(area);
              System.out.println("Total cost :"+hasm.calculate());     
              break;
	     case 3:high_standard_material hhsm= new high_standard_material(area);
              System.out.println("Total cost :"+hhsm.calculate());
              break;
	     case 4:high_standard_material_and_fully_automated hhsmfa= new high_standard_material_and_fully_automated(area);
              System.out.println("Total cost :"+hhsmfa.calculate());
              break;
         default:
        	 System.out.println("Enter a valid type in range 1 to 4");
        	 break;
}
}
}