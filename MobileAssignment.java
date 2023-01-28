package week01;

public class MobileAssignment 
{
	    String mobileBrandName="Moto";
		char mobileLogo='M';
		short noOfMobilePiece=10;
		int modelNumber=8667;
		long mobileImeiNumber=334455667788l;
		float mobilePrice=15000f;
		boolean isDamaged =false;
	public static void main(String[] args) 
	{
		MobileAssignment mbl=new MobileAssignment();
		System.out.println("Mobile Brand Name : "+ mbl.mobileBrandName);
		System.out.println("Mobile Logo : "+mbl.mobileLogo);
		System.out.println("No of Mobile Piece : "+mbl.noOfMobilePiece);
		System.out.println("Model Number : "+mbl.modelNumber);
		System.out.println("Mobile IMEI Number : "+mbl.mobileImeiNumber);
		System.out.println("Mobile Price : "+mbl.mobilePrice);
		System.out.println("Is mobile damaged : "+mbl.isDamaged);
	}

}
