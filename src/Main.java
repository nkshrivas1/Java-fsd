//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        wallet wallet1 =  new wallet("Owner1",1008.3);
        wallet1.addMoney(1000.3);
        wallet1.pay(553);
        for(int i = 0;i <= 16; i++){
            wallet1.addMoney(10 + i*2);
            wallet1.pay(900 + i*2);
        }

        wallet1.checkBalance();
        wallet1.fetchTransactions(6,10);
//        wallet1.searchByType("DeBiT");

    }
}