| Class            | Attribute                | Method            | Scenario       | Output            |
|------------------|--------------------------|-------------------|----------------|-------------------|
| Abstract Account | List<Transaction> ledger | getLedger()       |                | List<Transaction> |
|                  | String id                | deposit(int arg)  |                | newBalance        |
|                  | float balance            | withdraw(int arg) | arg <= balance | newBalance        |
|                  |                          |                   | arg > balance  |                   |
|                  |                          | getBalance()      |                | balance           |
|                  |                          |                   |                |                   | 
| SavingAccount    |                          |                   |                |                   |
| CurrentAccount   |                          |                   |                |                   |
|                  |                          |                   |                |                   |
| Transaction      | float deltaBalance       | getDeltaBalance() |                | deltaBalance      |
|                  | LocalDateTime timeStamp  | getTimeStamp()    |                | timestamp         |