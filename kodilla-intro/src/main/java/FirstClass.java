public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2018, "600g");
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYearAndPrice();


        Notebook heavyNotebook = new Notebook(2000, 1500, 2017, "2000g");
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYearAndPrice();


        Notebook oldNotebook = new Notebook(1200, 500, 2010, "1200g");
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYearAndPrice();

        Notebook studentNotebook = new Notebook (800, 700, 2019, "800g");
        System.out.println(studentNotebook.weight + " " + studentNotebook.price + " " + studentNotebook.year);
        studentNotebook.checkWeight();
        studentNotebook.checkPrice();
        studentNotebook.checkYearAndPrice();

        Notebook businessNotebook = new Notebook (700, 2000, 2020, "700g");
        System.out.println(businessNotebook.weight + " " + businessNotebook.price + " " + businessNotebook.year);
        businessNotebook.checkWeight();
        businessNotebook.checkPrice();
        businessNotebook.checkYearAndPrice();

        Notebook slowNotebook = new Notebook (1500, 600, 2009, "1500g");
        System.out.println(slowNotebook.weight + " " + slowNotebook.price + " " + slowNotebook.year);
        slowNotebook.checkWeight();
        slowNotebook.checkPrice();
        slowNotebook.checkYearAndPrice();

   // zmienna zapisana do metody zwracanej
        String notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);


        LeapYear ly = new LeapYear(2000);
        System.out.println(ly.year);

        boolean checkLeapYear = ly.isLeapYear();
        if (checkLeapYear) {
            System.out.println( "This is a leap year");
        }
        else {
            System.out.println( "This is not a leap year");
        }

        System.out.println(checkLeapYear);













    }
    }
