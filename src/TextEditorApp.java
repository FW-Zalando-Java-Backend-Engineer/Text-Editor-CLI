import java.util.LinkedList;
import java.util.Scanner;

public class TextEditorApp {

    public static void main(String[] args) {
        LinkedList<String> text = new LinkedList<>();       // Holds full text (in order)
        LinkedList<String> undoStack = new LinkedList<>();  // Holds undo history (LIFO)
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    // ✅ Task 2: Typing
                    System.out.print("Enter a word: ");
                    String input = scanner.nextLine();
                    typeText(text, undoStack, input);
                }
                case 2 -> {
                    // ✅ Task 4: Undo
                    undo(text, undoStack);
                }
                case 3 -> {
                    // ✅ Task 3: Show typed text
                    showText(text);
                }
                case 4 -> {
                    // ✅ Task 5: Peek
                    peekLast(undoStack);
                }
                case 5 -> {
                    // ✅ Task 6: Clear everything
                    clearAll(text, undoStack);
                }
                case 0 -> {
                    System.out.println("Exiting editor. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    // ✅ Task 1: Display menu options
    public static void displayMenu() {
        System.out.println("\n=== TEXT EDITOR MENU ===");
        System.out.println("1. Type text");
        System.out.println("2. Undo last word");
        System.out.println("3. Show all typed text");
        System.out.println("4. Peek last typed word");
        System.out.println("5. Clear all text");
        System.out.println("0. Exit");
    }

    // ✅ Task 2: Add typed word to both text list and undo stack
    public static void typeText(LinkedList<String> text, LinkedList<String> undoStack, String input) {
        // TODO: Add the input word to the end of 'text' using addLast()
        // TODO: Add the input word to the start of 'undoStack' using addFirst()

        // Example:
        // text.addLast(input);
        // undoStack.addFirst(input);
    }

    // ✅ Task 3: Show all typed words (in order)
    public static void showText(LinkedList<String> text) {
        // TODO: Loop through 'text' and print all words separated by spaces
        // Example:
        // for (String word : text) {
        //     System.out.print(word + " ");
        // }
        // System.out.println();
    }

    // ✅ Task 4: Undo last word using stack behavior
    public static void undo(LinkedList<String> text, LinkedList<String> undoStack) {
        // TODO: Check if undoStack is empty before popping
        // TODO: Use removeFirst() to get the last typed word
        // TODO: Remove that word from 'text' using removeLastOccurrence()

        // Example:
        // if (!undoStack.isEmpty()) {
        //     String last = undoStack.removeFirst();
        //     text.removeLastOccurrence(last);
        //     System.out.println("Undo: " + last);
        // } else {
        //     System.out.println("Nothing to undo.");
        //
