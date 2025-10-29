package practice13;

public class Task4 {
    public static class Shirt {
        private String id;
        private String description;
        private String color;
        private String size;

        public Shirt(String id, String description, String color, String size) {
            this.id = id;
            this.description = description;
            this.color = color;
            this.size = size;
        }

        public static Shirt fromString(String shirtData) {
            String[] parts = shirtData.split(",");
            if (parts.length == 4) {
                return new Shirt(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim());
            }
            return null;
        }

        @Override
        public String toString() {
            return "Рубашка:\n" +
                    "  ID: " + id + "\n" +
                    "  Описание: " + description + "\n" +
                    "  Цвет: " + color + "\n" +
                    "  Размер: " + size + "\n";
        }
    }
    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtArray = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            shirtArray[i] = Shirt.fromString(shirts[i]);
        }

        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
        }
    }
}
