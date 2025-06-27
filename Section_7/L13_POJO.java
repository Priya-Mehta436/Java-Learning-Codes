package Section_7;


public class L13_POJO{
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){
            L14_POJO_Records student = new L14_POJO_Records ( "J2071" + i,
            switch(i){
                case 1 -> "Sian";
                case 2 -> "Carrie";
                case 3 -> "Tiaga";
                case 4 -> "Harry";
                case 5 -> "Rose";
                default -> "Anonymous";
            },
    
            "06/06/2003", "masters");
            System.out.println(student);
        }
         POJO_2 pojoStudent = new POJO_2("788806", "Den",
                "15/01/1965", "Java Masterclass");
        L14_POJO_Records recordStudent = new L14_POJO_Records("J70007", "Lara",
                "25/05/2001", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}

