public class Stest
{
    public static void main(String a[])
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rohit";
        s1.city = "Ahmedabad";
        s1.age = 21;

        s2.name = "Meera";
        s2.city = "Gandhinagar";
        s2.age = 19;

        s1.printData();
        s2.printData();
    }
}