//You can create overloaded constructors by varying the parameter number and order
//


public class Student{
    String FN;
    String LN;
    int id;
    Student(){
        this.FN = "No first name";
        this.LN = "No last name";
        this.id = 2301927;
    }
//    Student(String FN, String LN){
//        this.FN=FN;
//        this.LN=LN;
//    }
    Student(String FN, String LN){
        this.FN=FN;
        this.LN=LN;
    }
    Student(String FN, String LN, int id){
//        this.FN = FN;
//        this.LN = LN;
        this(FN,LN);
        this.id = id;
    }
    Student(String FN, int id, String LN){
        this.FN = FN;
        this.LN = LN;
        this.id = id;
    }
    // Methods = getters and setters

    public String getFN() {
        return FN;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getLN() {
        return LN;
    }

    public void setLN(String LN) {
        this.LN = LN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String [] args){
        Student s1 = new Student("Joshua", "Hunter", 2301927);
        s1= new Student();
        System.out.println(s1);
        System.out.println(s1.FN);
        Student s2;
        s2 = new Student("Tom", "Lance", 23011439);
        System.out.println(s2.FN);
        System.out.println(s2.LN);
        System.out.println(s2.id);
        Student s3;
        String FN = "josh";
        String LN = "Hunt";
        int id = 2304457;
        s3 = new Student(FN, LN, id);
        System.out.println(s3.FN);
        System.out.println(s3.LN);
        System.out.println(s3.id);
        Student s4 = new Student("Random","Name");
        System.out.println(s4.FN);
        System.out.println(s4.LN);
        Student s5;
        s5= new Student(FN,id,LN);

    }
}
