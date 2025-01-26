# JavaBank

JavaBank is a simple, console-based banking application written in Java. It provides core banking functionalities, including creating accounts, making deposits and withdrawals, and viewing account details. This project is ideal for understanding foundational object-oriented programming concepts and file handling in Java.

---

## Features

- **Account Management**: Create new accounts with unique account IDs.
- **Deposit and Withdraw**: Add or withdraw funds from your account securely.
- **Account Details**: View account information, including balances.
- **File Persistence**: Account data is stored persistently using file handling.

---

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or later
- **IDE or Terminal**: Any IDE supporting Java or a terminal for running Java programs

---

## Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/alex-musick/JavaBank.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd JavaBank
   ```

3. **Compile the Java Files**:

   ```bash
   javac *.java
   ```

4. **Run the Application**:

   ```bash
   java Main
   ```

---

## Usage

1. Run the application using the command above.
2. Follow the menu-driven interface to:
   - Create a new account
   - Deposit or withdraw funds
   - View account details
3. Exit the application when done.

### Example Workflow:

- Create an account:
  - Input name and initial deposit.
  - Receive a unique account ID.
- Deposit funds:
  - Enter your account ID and the amount to deposit.
- Withdraw funds:
  - Enter your account ID and the amount to withdraw (ensures sufficient balance).
- View account details:
  - Enter your account ID to display account information.

---

## Project Structure

- **Main.java**: Entry point of the application. Contains the menu-driven interface.
- **Account.java**: Defines the `Account` class, including attributes and methods for account management.
- **Bank.java**: Handles the core logic, including creating accounts, deposits, withdrawals, and file persistence.
- **accounts.txt**: Stores account data persistently.

---



Thank you for checking out JavaBank! Happy coding!

