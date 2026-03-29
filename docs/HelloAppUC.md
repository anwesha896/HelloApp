# HelloApp

Hello App starts with Hello World, progresses to displaying a user name, then names from command-line args and standard input. It then manages names in a collection with list/remove options, refactors into methods and classes, adds persistence across runs, and finally displays names in banner format.

---

## Summary

Hello App Use Case begins with simple display of Hello World then goes on to display user name then to displaying the names from the command line arguments and then from standard input and then managing the names in a collection with options to list and remove names and then refactoring the code to separate concerns into different methods and classes and finally adding persistence to the name list across runs. The final use cases involve enhancing the display of names by showing them in banner format.

---

## Use Case Roadmap

The Hello App evolves step by step from a fixed console message to a modular, persistent, and extensible application.

**UC1:** Print a basic greeting in the console.  
**UC2:** Accept one name via command-line input and greet that user.  
**UC3:** Support optional argument handling with a default greeting path.  
**UC4:** Handle multiple command-line names in one execution.  
**UC5:** Read a single name from standard input.  
**UC6:** Read and process multiple names from standard input.  
**UC7:** Store entered names in memory and list them on request.  
**UC8:** Add removal support for stored names.  
**UC9:** Extract input-processing logic into dedicated methods.  
**UC10:** Move name-management responsibilities into a separate class.  
**UC11:** Persist names to storage and reload them across runs.  
**UC12:** Render greeting text in banner-style output for enhanced display.

---

## Git Workflow

Each use case will be implemented in a separate **feature branch**.

Example:

feature/UC1-display-hello-world  
feature/UC2-display-user-name  
feature/UC3-optional-argument-handling  

Each feature branch will be merged into the **dev branch** using a Pull Request.

Once all use cases are completed and tested, the **dev branch will be merged into main**.

## UC1: Display Hello World

Description:
The app displays "Hello World" on the console when executed.

Preconditions:
App is launched.

Main Flow:
1. User runs the application
2. App executes the main method
3. App prints "Hello World" to the console
4. App terminates

Postconditions:
Message is displayed to the user.

Example Output:

Hello World

## UC2: Display Hello with Command-Line Argument

Description:
The app accepts a user's name as a command-line argument and displays a personalized greeting.

Preconditions:
App is launched with a command-line argument containing a name.

Main Flow:
1. User runs the application with a name argument.
2. App reads the name from args[0].
3. App prints "Hello, <name>!".
4. App terminates.

Postconditions:
Personalized greeting is displayed.

Example Output:

Hello, Alice!

## UC3: Display Hello with Command-Line Argument or Default Message

Description:
The app accepts a user's name as a command-line argument and displays a personalized greeting. If no name is provided, it defaults to "World".

Preconditions:
App is launched with or without a command-line argument.

Main Flow:
1. User runs the application with or without a name argument.
2. App checks if an argument exists.
3. If present, it uses args[0] as the name.
4. If absent, it uses the default "World".
5. App displays the greeting.

Postconditions:
Personalized greeting is displayed.

Example Output:

Hello, Alice!
Hello, World!

## UC4: Display Hello with Multiple Command-Line Arguments or Default Message

Description:
The app accepts multiple names as command-line arguments and displays a personalized greeting for all names. If no names are provided, it defaults to "World".

Preconditions:
App is launched with zero or more command-line arguments.

Main Flow:
1. User runs the application with multiple names or no names.
2. App checks if arguments exist.
3. If present, it reads all names from the args array.
4. If absent, it uses the default value "World".
5. App joins the names with commas.
6. App displays the greeting.

Postconditions:
Personalized greeting is displayed with all names or defaults to "Hello, World!".

Example Output:

Hello, Alice, Bob, Charlie!
Hello, John!
Hello, World!

## UC5: Display Hello with Multiple Command-Line Arguments using Enhanced For Loop or Default Message

Description:
The app accepts zero or more command-line arguments and prints a greeting. It uses an enhanced for loop to process multiple names. If no arguments are provided, it displays the default greeting "Hello, World!".

Preconditions:
App is launched with zero or more command-line arguments.

Main Flow:
1. User runs the application with names or without names.
2. App checks if arguments exist.
3. If no arguments are provided, it uses the default value "World".
4. If arguments are provided, the app iterates through args using an enhanced for loop.
5. App builds a comma-separated list of names.
6. App displays the greeting.

Postconditions:
Greeting is displayed with all names or defaults to "Hello, World!".

Example Output:

Hello, Alice, Bob, Charlie!
Hello, Alice!
Hello, World!


## UC6: Display Hello with Multiple Command-Line Arguments using substring

Description:
The app accepts multiple names and prints a greeting. It uses substring() to remove the trailing comma and space. If no names are provided, it defaults to "World".

Preconditions:
App is launched with or without command-line arguments.

Main Flow:
1. User runs the application.
2. App checks if arguments are present.
3. If present, it iterates using enhanced for loop.
4. Appends names with ", ".
5. Uses substring() to remove trailing delimiter.
6. Displays greeting.
7. If no arguments, uses "World".

Postconditions:
Greeting is displayed.

Example Output:

Hello, Alice!
Hello, Alice, Bob!
Hello, World!


## UC7: Display Hello with Multiple Command-Line Arguments using String.join()

Description:
The app accepts multiple names and prints a greeting using String.join(). If no names are provided, it defaults to "World".

Preconditions:
App is launched with or without command-line arguments.

Main Flow:
1. User runs the application.
2. App checks if arguments are present.
3. If present, it uses String.join() to combine names.
4. Displays greeting.
5. If no arguments, uses "World".

Postconditions:
Greeting is displayed.

Example Output:

Hello, Alice!
Hello, Alice, Bob!
Hello, World!



