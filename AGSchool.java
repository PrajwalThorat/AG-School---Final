import java.util.Scanner;
public class AGSchool {
    public static int numberOfStudent;
    public static String[] studentName;
    public static String[] rollNumber;
    public static int[] math;
    public static int[] science;
    public static int[] english;
    public static int[] language;
    public static int[] socialStudies;
    public static int[] totalMarks;
    public static double[] average;
    public static char[] grade;
    public static Scanner scanner = new Scanner(System.in);


    public static void studentDetails(){
        studentName = new String[numberOfStudent];
        rollNumber = new String[numberOfStudent];
        math = new int[numberOfStudent];
        science = new int[numberOfStudent];
        language = new int[numberOfStudent];
        english = new int[numberOfStudent];
        socialStudies = new int[numberOfStudent];
        totalMarks = new int[numberOfStudent];
        average = new double[numberOfStudent];
        for(int i=0 ; i<numberOfStudent ; i++){
            System.out.println("Enter Student "+(i+1)+" Details");
            System.out.print("Name        : ");
            studentName[i] = scanner.next();
            System.out.print("Roll Number : ");
            rollNumber[i] = scanner.next();
            System.out.println("-- Enter Marks --");
            System.out.println("Subject\t\tTotal Marks\tObtaine Marks");
            System.out.print("Math\t\t100\t\t");
            math[i] = scanner.nextInt();
            System.out.print("Science\t\t100\t\t");
            science[i] = scanner.nextInt();
            System.out.print("English\t\t100\t\t");
            english[i] =scanner.nextInt();
            System.out.print("Language\t100\t\t");
            language[i] = scanner.nextInt();
            System.out.print("Social Studies\t100\t\t");
            socialStudies[i] = scanner.nextInt();
            totalMarks[i] = math[i]+science[i]+english[i]+language[i]+socialStudies[i];
            average[i] = (totalMarks[i]/5);
            System.out.println("--------------------------------------\nTotal\t\t500\t\t"+totalMarks[i]);
            System.out.println("Average : "+average[i]);
        }
    }
    public static void topScorer(){
        double Topper = average[0];
        int Length = average.length;
        for(int i=0 ; i<Length ; i++){
            if(Topper<average[i]){
                Topper = average[i];
            }
        }
        System.out.println("-- Topper In Class --");
        for(int i=0 ; i<Length ; i++){
            if(Topper==average[i]){
                System.out.println("Name\t\tRoll Number");
                System.out.println(""+studentName[i]+"\t\t"+rollNumber[i]);
            }
        }   
    }
    public static void passFail(){
        System.out.println("-- Passed Student --");
        System.out.println("Name\t\tRoll Number");
        for(int i=0 ; i<numberOfStudent ; i++){
            if(math[i]>35){
                if(science[i]>35){
                    if(english[i]>35){
                        if(language[i]>35){
                            if(socialStudies[i]>35){
                                System.out.println(""+studentName[i]+"\t\t"+rollNumber[i]);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("-- Failed Student --");
        System.out.println("Name\t\tRoll Number");
        for(int j=0 ; j<numberOfStudent ; j++){
            if(math[j]<35){
                System.out.println(""+studentName[j]+"\t\t"+rollNumber[j]);
            }if(science[j]<35){
                System.out.println(""+studentName[j]+"\t\t"+rollNumber[j]);
            }if(english[j]<35){
                System.out.println(""+studentName[j]+"\t\t"+rollNumber[j]);
            }if(language[j]<35){
                System.out.println(""+studentName[j]+"\t\t"+rollNumber[j]);
            }if(socialStudies[j]<35){
                System.out.println(""+studentName[j]+"\t\t"+rollNumber[j]);
            }
        }
    }
    public static void Grade(){
        grade = new char[]{'O','A','B','C','D','E'};
        System.out.println("Name\tRoll Number\tGrabe");
        for(int i=0 ; i<numberOfStudent ; i++){
            if(average[i]>=95){
                System.out.println(""+studentName[i]+"\t"+rollNumber[i]+"\t\t"+grade[i]);
            }if(average[i]>=80 && average[i]<95){
                System.out.println(""+studentName[i]+"\t"+rollNumber[i]+"\t\t"+grade[i]);
            }if(average[i]>=70 && average[i]<80){
                System.out.println(""+studentName[i]+"\t"+rollNumber[i]+"\t\t"+grade[i]);
            }if(average[i]>=60 && average[i]<70){
                System.out.println(""+studentName[i]+"\t"+rollNumber[i]+"\t\t"+grade[i]);
            }if(average[i]>=50 && average[i]<60){
                System.out.println(""+studentName[i]+"\t"+rollNumber[i]+"\t\t"+grade[i]);
            }if(average[i]<50){
                System.out.println(""+studentName[i]+"\t"+rollNumber[i]+"\t\t"+grade[i]);
            }
        }
    }
    public static void histogram(){
        for(int i=100 ; i>=10 ; i=i-10){
            System.out.print(i+" ");
            for(int j=0 ; j<numberOfStudent ; j++){
                if(i<average[j]){
                    System.out.print(" * ");
                }
            }System.out.println();
        }
        System.out.println("-------------------------");
        for(int k=0 ; k<=numberOfStudent ; k++){
            System.out.print(k+"  ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the Number Of Student : ");
        numberOfStudent = scanner.nextInt();
        studentDetails();
        topScorer();
        passFail();
        Grade();
        histogram();
    }
}