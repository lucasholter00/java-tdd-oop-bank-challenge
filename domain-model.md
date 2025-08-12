| Class            | Attribute                | Method                  | Scenario       | Output            |
|------------------|--------------------------|-------------------------|----------------|-------------------|
| Abstract Account | List<Transaction> ledger | getLedger()             |                | List<Transaction> |
|                  | String id                | deposit(int arg)        |                | newBalance        |
|                  | float balance            | withdraw(int arg)       | arg <= balance | newBalance        |
|                  |                          |                         | arg > balance  |                   |
|                  |                          | getBalance()            |                | balance           |
|                  |                          | getTransactionHistory() |                | String history    | 
| SavingAccount    |                          |                         |                |                   |
| CurrentAccount   |                          |                         |                |                   |
|                  |                          |                         |                |                   |
| Transaction      | float deltaBalance       | getDeltaBalance()       |                | deltaBalance      |
|                  | LocalDateTime timeStamp  | getTimeStamp()          |                | timestamp         |
Extension:

| Class            | Attribute                | Method                  | Scenario       | Output            |
|------------------|--------------------------|-------------------------|----------------|-------------------|
| Abstract Account | List<Transaction> ledger | getLedger()             |                | List<Transaction> |
|                  | String id                | deposit(int arg)        |                | newBalance        |
|                  | float balance            | withdraw(int arg)       | arg <= balance | newBalance        |
|                  |                          |                         | arg > balance  |                   |
|                  |                          | getBalance()            |                | balance           |
|                  |                          | getTransactionHistory() |                | String history    |
|                  |                          | getBalanceFromLedger()  |                | float balance     |
|                  |                          |                         |                |                   |
| SavingAccount    |                          |                         |                |                   |
| CurrentAccount   |                          |                         |                |                   |
|                  |                          |                         |                |                   |
| Transaction      | float deltaBalance       | getDeltaBalance()       |                | deltaBalance      |
|                  | LocalDateTime timeStamp  | getTimeStamp()          |                | timestamp         |