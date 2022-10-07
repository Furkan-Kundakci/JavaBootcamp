public class Main {

    public static void main(String[] args) {
//        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger : baseLoggers){
//            logger.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
