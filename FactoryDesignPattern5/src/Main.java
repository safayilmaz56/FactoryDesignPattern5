public class Main {
    public static void main(String[] args) {
        AktariciFactory aktariciFactory = new AktariciFactory();
        IAktarici csv = aktariciFactory.nesneYarat("csv");
        IAktarici excel = aktariciFactory.nesneYarat("excel");

        excel.aktar(true);
        csv.aktar(false);


    }
}