public class ky_tu_thoat {
    public static void main(String[] args) {
        System.out.println("My favorite book is \'Twilight\' by Stephanie Meyer");
        // Output:My favorite book is 'Twilight' by Stephanie Meyer
        System.out.println("------1");
        System.out.println("My favorite book is \"Twilight\" by Stephanie Meyer");
        // Output:My favorite book is "Twilight" by Stephanie Meyer
        System.out.println("------2");
        System.out.println("My favorite book is \\Twilight\\ by Stephanie Meyer");
        // Output:My favorite book is \Twilight\ by Stephanie Meyer
        System.out.println("------3");
        System.out.println("My favorite book is \rTwilight by Stephanie Meyer");
        // Output:Twilight by Stephanie Meyer
        System.out.println("------4");
        System.out.println("My favorite book is \nTwilight by Stephanie Meyer");
        // Output:My favorite book is
        //        Twilight by Stephanie Meyer
        System.out.println("------5");
        System.out.println("My favorite book is \fTwilight by Stephanie Meyer");
        // Output:Twilight by Stephanie Meyer
        System.out.println("------6");
        System.out.println("My favorite book is \tTwilight by Stephanie Meyer");
        // Output:My favorite book is 	Twilight by Stephanie Meyer
        System.out.println("------7");
        System.out.println("My favorite book is\bTwilight by Stephanie Meyer");
        // Output:My favorite book isTwilight by Stephanie Meyer
        System.out.println("------8");
        System.out.println("Escaping characters, \025 2019 CodeGym");
        // Output:Escaping characters, a 2019 CodeGym
        System.out.println("------9");
        System.out.println("Escaping characters, \u0061 2019 CodeGym");
        // Output:Escaping characters, a 2019 CodeGym
    }
}
