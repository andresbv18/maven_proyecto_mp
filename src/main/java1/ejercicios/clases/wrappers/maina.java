package ejercicios.clases.wrappers;

public class maina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5;
	       
	      
	         
	        int y=(n-1);
	        for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	        if((i==j)||((i+j)==y)){
	        System.out.print("*");
	        }
	        else{
	        System.out.print(".");
	        }
	     
	        }System.out.println("");
	        }
	}

}
