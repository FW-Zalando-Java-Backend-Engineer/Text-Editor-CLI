# **📝 Assignment: Java CLI Text Editor Using Stack (with LinkedList)**

In this assignment, you’ll build a **command-line text editor** that simulates typing and undo using **Java’s `LinkedList`**. This project helps you understand **stack behavior** through an intuitive theme — editing text and undoing changes!

---

## **📚 What You Know & Will Use**

✅ `LinkedList<String>`  
✅ Loops, conditionals  
✅ Methods and parameters  
✅ Basic console I/O  
✅ Menu-driven CLI


---

## **🧭 Project Overview**

You’ll create:
- A CLI menu that loops until exit
- A typing system that stores words
- An undo system using stack behavior
- Basic preview and reset features

All operations are handled using **`LinkedList<String>`**, one for content and one for undo history.

---

## **📦 Stack Concepts to Use with `LinkedList<String>`**

| Method        | Purpose                          |
|---------------|----------------------------------|
| `addFirst()`  | Stack-style push (LIFO)          |
| `removeFirst()`| Stack-style pop (LIFO)          |
| `peekFirst()` | Stack-style peek (top element)   |
| `clear()`     | Empty the list                   |
| `isEmpty()`   | Check if undo/history is empty   |

---

## **🧪 Tasks**

### ✅ **Task 1: CLI Menu Setup**

📌 Goal: Display a menu in a loop and allow user choices.

#### Method:
```java
public static void displayMenu()
```

- Show options:
  - Type text
  - Undo
  - Show text
  - Peek last input
  - Clear all
  - Exit
- Call the appropriate method based on user input.

🧠 *Hint*: Use `Scanner` inside a loop. Structure keeps your program readable.

---

### ✅ **Task 2: Typing New Words**

📌 Goal: Add a word to the text and store in undo stack.

#### Method:
```java
public static void typeText(LinkedList<String> text, LinkedList<String> undoStack, String input)
```

- `text` holds the overall typed content (`addLast()`).
- `undoStack` records words added (`addFirst()`).

🧠 *Hint*: Every typed word should be stored in both lists but using different directions — stack is LIFO, text is FIFO.

---

### ✅ **Task 3: Show Typed Text**

📌 Goal: Display all words typed so far.

#### Method:
```java
public static void showText(LinkedList<String> text)
```

- Loop through `text` and print each word in order.

🧠 *Hint*: Join words with space during output using a simple loop.

---

### ✅ **Task 4: Undo Last Word**

📌 Goal: Remove the last word added using stack logic.

#### Method:
```java
public static void undo(LinkedList<String> text, LinkedList<String> undoStack)
```

- Get the last word from `undoStack` using `removeFirst()`
- Remove that word from `text` using `removeLastOccurrence()`

🧠 *Hint*: `removeLastOccurrence()` ensures the last added match is removed from the full content.

---

### ✅ **Task 5: Peek Last Word**

📌 Goal: Show the last word typed without removing it.

#### Method:
```java
public static void peekLast(LinkedList<String> undoStack)
```

- Use `peekFirst()` to see the top of the stack.

🧠 *Hint*: Always check `isEmpty()` before peeking!

---

### ✅ **Task 6: Clear All Text**

📌 Goal: Clear both the text and undo stack.

#### Method:
```java
public static void clearAll(LinkedList<String> text, LinkedList<String> undoStack)
```

- Use `clear()` on both lists.

---

## **🧑‍💻 Sample Output**

```
=== TEXT EDITOR ===
1. Type text
2. Undo last
3. Show text
4. Peek last
5. Clear all
0. Exit

> 1
Enter word: Hello

> 1
Enter word: Java

> 3
Text: Hello Java

> 4
Last typed: Java

> 2
Undo: Java

> 3
Text: Hello
```

---

## **📂 Submission Instructions**

- Create a class: `TextEditorApp`
- Implement **each task as a separate method**
- Submit your GitHub repo link with `TextEditorApp.java`

---

## **🧪 Bonus Challenges (Optional)**

- [ ] Limit undo history to last 5 words  
- [ ] Add “Redo” using a second `LinkedList<String>`  
- [ ] Allow sentence input (multi-word) in Task 2

---

## **📚 Resources**

- [Java LinkedList Docs](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
- [Baeldung: Stack Behavior with LinkedList](https://www.baeldung.com/java-stack)

---

🎯 **This assignment is your gateway to mastering stack logic using Java! Implement, test, and submit your CLI-based text editor. Let’s code like pros!** 💡


