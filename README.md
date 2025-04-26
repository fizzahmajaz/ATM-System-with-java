# ATM-System-with-java
This project is a simple ATM simulator where users can check their balance, deposit money, withdraw money, or exit. It keeps asking for actions until the user chooses to exit. The program also checks for invalid inputs and insufficient balance.



1. Scanner is created:
java
Copy
Edit
Scanner sc = new Scanner(System.in);
We create a Scanner object to take user input.

2. Initial balance and PIN are set:
java
Copy
Edit
double balance = 1000.00;
int pin = 1234;
We assume the user already has ₨1000 in the ATM.

PIN is set as 1234 (like a password).

3. User is asked to enter the PIN:
java
Copy
Edit
System.out.println("Enter your PIN: ");
enteredPin = sc.nextInt();
The program asks the user to type their PIN.

4. PIN Checking:
java
Copy
Edit
if (enteredPin == pin) {
If the entered PIN matches the correct PIN, the user is allowed to continue.

Otherwise, they are shown "Access Denied" and program ends.

5. Main Menu Loop:
java
Copy
Edit
while (choice != 4) {
The menu will keep showing (again and again) until the user chooses Exit (option 4).

The user sees a menu:

Check Balance

Deposit Money

Withdraw Money

Exit

6. Based on user's choice:
If choice == 1 → Show current balance.

If choice == 2 → Ask for deposit amount and add it to the balance.

If choice == 3 → Ask for withdrawal amount:

If sufficient money is available, subtract it.

If not, show "Insufficient Funds" message.

If choice == 4 → Exit the program politely.

If anything else, say "Invalid Option".

7. Scanner is closed:
java
Copy
Edit
sc.close();
After everything, we close the scanner to save memory.

Summary in simple words:
The code first checks the PIN. If the PIN is correct, it shows a menu. The user can check balance, deposit, or withdraw money until they exit. The balance updates correctly after each action.

