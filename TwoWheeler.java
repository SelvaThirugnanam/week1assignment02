package week01;

public class TwoWheeler
{      int noOfWheels=2;
       short noOfMirrors=2;
       long chassisNumber=546372819l;
       boolean isPunctured=false;
       String bikeName="RE Clasic 350";
       double runningKM=60000;
    public static void main(String[] args) 
      {
       TwoWheeler bike = new TwoWheeler();
       System.out.println("No. of. Wheels : "+bike.noOfWheels+
		"\nNo. of. Mirrors : "+bike.noOfMirrors+
		"\nChassis Number : "+bike.chassisNumber+
		"\nIs the two wheeler punctured : "+bike.isPunctured+
		"\nBike Name : "+bike.bikeName+
		"\nRunning KM : "+bike.runningKM);


     }
}
