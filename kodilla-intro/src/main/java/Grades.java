public class Grades {
    private int grades[];
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        return this.grades[this.size-1];
    }

    public double getAverageGrade() {
        double sum = 0;
        if(size == 0){
            return 0;
        }
        for (int i =0; i < size; i++) {
          sum = sum + grades[i];
        }
         return sum / size;
    }

    public static void main(String[] args) {
        Grades a = new Grades();
        a.add(4);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(5);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(1);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(2);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(4);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(3);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(6);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(1);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(4);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(3);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(2);
        System.out.println(a.getAverageGrade() + " "+a.getLastGrade());
        a.add(5);
    }
}
