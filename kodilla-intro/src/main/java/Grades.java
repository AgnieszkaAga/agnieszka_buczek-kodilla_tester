public class Grades {
    private int grades[];
    private int size;
    private int sum;
    private int lastGrade;
    private int averageGrade;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.sum = 0;
        this.averageGrade = 0;
        this.lastGrade = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int showLastGrade() {
        lastGrade = grades[size-1];
        return lastGrade;
    }

    public int showAverageGrade() {
        for (int i =0; i < size; i++) {
          sum = sum + grades[i];
          averageGrade = sum / size;
        }
         return averageGrade;
    }
}
