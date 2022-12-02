package MireaJava.SecondMetod.Pract6Ex1;

public class TestClass {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(7, 77),
                new Student(10, 128),
                new Student(19,56),
                new Student(2,88),
                new Student(6,109)
        };

        Student[] students1 = new Student[]{
                new Student(19,27),
                new Student(18,231),
                new Student(32,172),
                new Student(16, 78),
                new Student(14,98)
        };

        Student temp;
        int min;

        for(int i = 0; i < students.length;i++){
            min = i;
            for(int j = i+1; j < students.length;j++){
                if(students[j].compareTo(students[min]) < 0){
                    min = j;
                }
            }
            temp = students[min];
            students[min] = students[i];
            students[i] = temp;
        }

        /*for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getiDNumber());
        }*/

        quicksort(students, 0, students.length - 1);

        reverse(students);

        /*for (int i = 0; i < students.length;i++){
            System.out.println(students[i].getGPA());
        }*/

        Student[] allStudents = new Student[students.length + students1.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students1, 0, allStudents,students.length, students1.length);
        mergeSort(allStudents, 0, allStudents.length - 1);

        for(int i = 0; i < allStudents.length; i++){
            System.out.println(allStudents[i].getGPA());
        }
    }

    private static SortingStudentsByGPA obj = new SortingStudentsByGPA();

    public static void reverse(Student[] array){
        for(int i = 0; i < array.length / 2; i++){
            Student temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

     public  static void mergeSort(Student[] array, int LeftBorder, int RightBorder){

        int middle = LeftBorder + ((RightBorder - LeftBorder) / 2) + 1;
        if(middle > 0 && RightBorder > (LeftBorder + 1)){
            mergeSort(array, LeftBorder, middle - 1);
            mergeSort(array, middle, RightBorder);
        }
        Student[] buffer = new Student[RightBorder - LeftBorder + 1];
        int cursor = LeftBorder;
        for(int i = 0; i < buffer.length; i++){
            if(middle > RightBorder || obj.compare(array[cursor], array[middle]) > 0) {
                buffer[i] = array[cursor];
                cursor++;
            }
            else{
                buffer[i] = array[middle];
                middle++;
            }
        }
        System.arraycopy(buffer, 0, array, LeftBorder, buffer.length);
    }

    public static void quicksort(Student[] array, int LeftBorder, int RightBorder){
        int LeftMarker = LeftBorder;
        int RightMarker = RightBorder;
        Student middle = array[(LeftBorder + RightBorder) / 2];
        do {

            while (obj.compare(array[LeftMarker], middle) < 0) {
                LeftMarker++;
            }

            while (obj.compare(array[RightMarker], middle) > 0) {
                RightMarker--;
            }

            if (LeftMarker <= RightMarker) {
                if (LeftMarker < RightMarker) {
                    Student temp = array[LeftMarker];
                    array[LeftMarker] = array[RightMarker];
                    array[RightMarker] = temp;
                }
                LeftMarker++;
                RightMarker--;
            }
        }while(LeftMarker <=RightMarker);

        if(LeftMarker < RightBorder){
            quicksort(array, LeftMarker, RightBorder);
        }

        if(LeftBorder < RightMarker){
            quicksort(array, LeftBorder, RightMarker);
        }
    }
}
