package practice19;

public class Task1 {
    public static class InvalidINNException extends Exception {
        public InvalidINNException(String message) {
            super(message);
        }
    }

    public static class OnlineOrder {
        private String name;
        private String inn;

        public OnlineOrder(String name, String inn) throws InvalidINNException {
            this.name = name;
            if (!isValidINN(inn)) {
                throw new InvalidINNException("Недействительный ИНН: " + inn);
            }
            this.inn = inn;
        }

        private boolean isValidINN(String inn) {
            return inn != null && inn.matches("\\d{10}");
        }

        public static void main(String[] args) {
            try {
                OnlineOrder order1 = new OnlineOrder("Иван Иванов", "1234567890");
                System.out.println("Заказ создан: " + order1.name);
                OnlineOrder order2 = new OnlineOrder("Петр Петров", "1234");
            } catch (InvalidINNException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
