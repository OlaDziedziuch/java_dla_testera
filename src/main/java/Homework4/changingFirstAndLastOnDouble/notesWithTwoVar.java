package Homework4.changingFirstAndLastOnDouble;

public class notesWithTwoVar {

    public static void main(String[] args) {

        double[] notes = {4.5, 3.5, 3.5, 6.0, 3.0, 5.0};

        double first = notes[0];
        double last = notes[notes.length-1];

        notes[0] = last;
        notes[notes.length-1] =first;

        for (double newNote: notes
             ) {
            System.out.println(newNote);

        }
    }
}
