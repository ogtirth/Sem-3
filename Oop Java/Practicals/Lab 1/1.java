// Practical: JDK Installation and Configuration

// Step 1: Download JDK
// - Go to the official Oracle website: https://www.oracle.com/java/technologies/javase-downloads.html
// - Download the latest version of JDK based on your operating system (Windows, Mac, or Linux).

// Step 2: Install JDK
// - Run the downloaded installer.
// - Follow the installation prompts and complete the installation.
// - By default, the JDK will be installed in "C:\Program Files\Java\jdk_version" (Windows).

// Step 3: Set Environment Variables (for Windows users)
// - Right-click on 'This PC' or 'My Computer' and select 'Properties'.
// - Click on 'Advanced System Settings' and then on 'Environment Variables'.
// - Under 'System Variables', find 'Path', select it, and click 'Edit'.
// - Add the JDK bin directory to the path. Example: "C:\Program Files\Java\jdk_version\bin"
//   This step allows you to run Java commands from any directory in the terminal.

// Step 4: Verify the Installation
// - Open Command Prompt (Windows) or Terminal (Mac/Linux).
// - Type the command: `java -version`
//   This should show the installed version of Java, confirming that JDK is installed and configured correctly.

// Step 5: Compile and Run a Simple Java Program
// - Open any text editor (like Notepad) and write a simple Java program.
// - Save the file as 'Main.java'.
// Example code:
public class Main {
    public static void main(String[] args) {
        // Print a message to verify JDK installation
        System.out.println("JDK is successfully installed and configured!");
    }
}

// - To compile the program, open Command Prompt or Terminal.
// - Navigate to the directory where you saved 'Main.java'.
// - Run the command: `javac Main.java` (this will compile the program).
// - After successful compilation, run the program with the command: `java Main`.
//   This should print: "JDK is successfully installed and configured!"
