/**
 * 
 */
package All_Java_Projects;

/**
 * 
 */
public class grade_finding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int grade = 10;
          int cgpa= grade/10;
          switch (cgpa) {
          case 9:
          case 8:
        	  
        	  System.out.println("grade A ");
        	  break;
        
          case 7:
          case 6:
        	  System.out.println("grade B ");
        	  break;
          case 5:
          case 4:
        	  System.out.println("grade  C");
        	  break;
        	  
        	  
          default :
        	  System.out.println("Fail");
        	  break;
        	  
          
     
          }
          
		
		
	}
}


