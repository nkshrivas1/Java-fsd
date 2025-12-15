public class AbstractCar extends AbstractVehicle implements  Payment {
    @Override
    void start() {
        System.out.println("Abstract class car start method");
    }

    @Override
    public void pay() {

    }

    public static void  main(String[] args){

        try{
            System.out.println();
        }catch(Exception e){
            System.out.println("Arithmetic exception occurs.");
        }

        System.out.println(" other response");
    }
}
