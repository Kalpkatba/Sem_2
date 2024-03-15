import java.util.Scanner;
 class Student {
    String idNo;
    int numOfSubjectsRegistered = 6;
    String[] subjectCodes = {"hsc123cd","jcbjba33","kjnejad34","eklnwe234","ahcah322","ugegfgh32"   };
    int[] subjectCredits = {6,6,5,5,2,2};
    String[] grades;
    double spi;

    public Student(String idNo, int numOfSubjectsRegistered) {
        this.idNo = idNo;
        this.numOfSubjectsRegistered = numOfSubjectsRegistered;
        grades = new String[numOfSubjectsRegistered];
    }

    public void calculateSPI() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter grade obtained for subject " + /*(i + 1) +*/);
            grades = sc.nextLine().toUpperCase(); 

            System.out.println("Subject Code" + /*(i + 1) +*/ ": "+subjectCodes);
            

            System.out.println("subject credits " + /*(i + 1) +*/ ": "+subjectCredits);
            

            totalCredits += subjectCredits;
            totalGradePoints += getGradePoint(grades) * subjectCredits;
            sc.nextLine();
        }
        sc.close();

        spi = totalGradePoints / totalCredits;
    }

    private double getGradePoint(String grade) {
        switch (grade) {
            case "S":
                return 10.0;
            case "A":
                return 9.0;
            case "B":
                return 8.0;
            case "C":
                return 7.0;
            case "D":
                return 6.0;
            case "E":
                return 5.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public double getSpi() {
        return spi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
            System.out.println("Enter ID no. for student " + /*(i + 1) +*/ ": ");
            String id = sc.nextLine();

            students = new Student(idNo);
            students.calculateSPI();

            System.out.println("Student " + /*(i + 1)*/ + " ID: " + students.idNo);
            System.out.println("SPI: " + students[i].getSpi());
            System.out.println();

        sc.close();
    }
