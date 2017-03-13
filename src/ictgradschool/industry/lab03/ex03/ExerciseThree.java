package ictgradschool.industry.lab03.ex03;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter a sentence, then prints out the sentence with a random character
 * missing. The program is to be written so that each task is in a separate method. See the comments below for the
 * different methods you have to write.
 */
public class ExerciseThree {

    private void start() {

        String sentence = getSentenceFromUser();

        int randomPosition = getRandomPosition(sentence);

        printCharacterToBeRemoved(sentence, randomPosition);

        String changedSentence = removeCharacter(sentence, randomPosition);

        printNewSentence(changedSentence);
    }

    /**
     * Gets a sentence from the user.
     * @return
     */
    private String getSentenceFromUser() {

        // TODO Prompt the user to enter a sentence, then get their input.
        System.out.print("Enter a sentence: ");
        return Keyboard.readInput();
    }

    /**
     * Gets an int corresponding to a random position in the sentence.
     */
    private int getRandomPosition(String sentence) {

        // TODO Use a combination of Math.random() and sentence.length() to get the desired result.
        int length = sentence.length();
        int randomPosition = (int)(Math.random()*length);
        return randomPosition;
    }

    /**
     * Prints a message stating the character to be removed, and its position.
     */
    private void printCharacterToBeRemoved(String sentence, int position) {

        // TODO Implement this method
        char removedChar = sentence.charAt(position);
        System.out.println("Removing \""+ removedChar+ "\" from position " + (position+1));

    }

    /**
     * Removes a character from the given sentence, and returns the new sentence.
     */
    private String removeCharacter(String sentence, int position) {

        // TODO Implement this method
        String changedSentence;
        if (position == 0){
            changedSentence = sentence.substring(position+1);
        }else {
            changedSentence = sentence.substring(0, position) + sentence.substring(position+1);
        }
        return changedSentence;
    }

    /**
     * Prints a message which shows the new sentence after the removal has occured.
     */
    private void printNewSentence(String changedSentence) {

        // TODO Implement this method
        System.out.println("New sentence is:" + changedSentence);

    }

    public static void main(String[] args) {
        ExerciseThree ex = new ExerciseThree();
        ex.start();
    }
}
