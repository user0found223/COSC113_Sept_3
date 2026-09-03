public class Student{
    String FN;
    String LN;
    int id;
    Student(){
        this.FN = "No first name";
        this.LN = "No last name";
        this.id = 2301927;
    }
    Student(String FN, String LN, int id){
        this.FN = FN;
        this.LN = LN;
        this.id = id;
    }
    public static void main(String [] args){
        Student s1 = new Student("Joshua", "Hunter", 2301927);
        s1= new Student();
        System.out.println(s1);
        System.out.println(s1.FN);
    }
}
