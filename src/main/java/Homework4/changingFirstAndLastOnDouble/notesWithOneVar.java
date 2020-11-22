package Homework4.changingFirstAndLastOnDouble;

public class notesWithOneVar {
    public static void main(String[] args) {

        double[] notes = {4.5, 3.5, 3.5, 6.0, 3.0, 5.0};

        double temp = notes[0];
        notes[0] = notes[notes.length - 1];
        notes[notes.length - 1] = temp;

        for (double newNote : notes
        ) {
            System.out.println(newNote);

        }
    }
}
