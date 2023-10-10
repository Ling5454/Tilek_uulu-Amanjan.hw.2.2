public class Main {
    public static void main(String[] args) {
        Phone[] phones = {createObject("iphone"), createObject("Xiomi"), createObject("Samsung")};
        for (Phone printble : phones) {
            printble.print();
        }
    }
        public static Phone createObject(String className){
            Phone phone = null;
            switch (className) {
                case "iphone":
                    phone = new iphone("XS", 2018, "you Name Aicloud");
                    break;
                case "Xiomi":
                    phone=new Xiomi("T9",2021,"you Name Micloud");
                    break;
                case "Samsung":
                    phone=new Samsung("A50",2022,"you Nam samsungAccount");
                    break;
            }
            return phone;

        }
    }
