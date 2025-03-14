# Library Management System (Java)

## Overview
A simple Library Management System written in Java that allows users to perform operations like issuing, returning, and adding books to the library. The system keeps track of each transaction by logging the date and time when a book is issued. The project demonstrates the use of **Object-Oriented Programming (OOP)** principles, **array manipulation**, and **date/time handling**.

## Features
- **Issue Books:** Allows users to search for and issue books from the library, logging the date and time of each issuance.
- **Add Books:** Users can add new books to the library's inventory.
- **Return Books:** Users can return books to the library.
- **Book Management:** Uses arrays to store and manage books in the library dynamically.

## Technologies Used
- **Java**
- **Object-Oriented Programming (OOP)**
- **Array Manipulation**
- **Date/Time Handling** (`LocalDate`, `LocalTime`)

## How to Run
1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/your-username/library-management-system.git
    ```
2. Compile and run the `NP_22_LibraryManagementSystem.java` file:
    ```bash
    javac NP_22_LibraryManagementSystem.java
    java NP_22_LibraryManagementSystem
    ```
3. Follow the console prompts to interact with the system (e.g., issue, return, or add books).

## Example Interaction
Here is a sample of how the program interacts with users:

1. User adds a book:
    ```
    Please enter the book name you want to add: Java Programming
    ```
2. User issues a book:
    ```
    Enter the book you want to take: Java Programming
    Searching for the book...
    Book: Java Programming
    Issued to: John Doe
    Issued at: 2025-03-14 15:30
    ```
3. User returns a book:
    ```
    Please enter the book name you want to add: Java Programming
    ```

## Sample output Screenshots
![alt text](<Screenshot 2025-03-14 at 10.00.11 AM.png>)

## License
This project is open-source and available under the MIT License.
