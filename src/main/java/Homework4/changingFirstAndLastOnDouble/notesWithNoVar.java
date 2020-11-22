package Homework4.changingFirstAndLastOnDouble;

public class notesWithNoVar {

    public static void main(String[] args) {

        double[] notes = {4.5, 3.5, 3.5, 6.0, 3.0, 5.0};

        notes[notes.length-1] = notes[notes.length-1] + notes[0]; //last = 9.5
        notes[0] = notes[notes.length-1] - notes[0]; // first = 9.5-4.5 = 5
        notes[notes.length-1] = notes[notes.length-1] - notes[0]; // last = 9.5-5 = 4.5

        for (double newNote: notes
             ) {
            System.out.println(newNote);

        }
    }
}
