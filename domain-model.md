| Class          | Attribute                | Method                  | Scenario       | Output            |
|----------------|--------------------------|-------------------------|----------------|-------------------|
| Account        | List<Transaction> ledger | getLedger()             |                | List<Transaction> |
|                | String id                | deposit(int arg)        |                | newBalance        |
|                | float balance            | withdraw(int arg)       | arg <= balance | newBalance        |
|                |                          |                         | arg > balance  |                   |
|                |                          | getBalance()            |                | balance           |
|                |                          | getTransactionHistory() |                | String history    | 
| SavingAccount  |                          |                         |                |                   |
| CurrentAccount |                          |                         |                |                   |
|                |                          |                         |                |                   |
| Transaction    | float deltaBalance       | getDeltaBalance()       |                | deltaBalance      |
|                | LocalDateTime timeStamp  | getTimeStamp()          |                | timestamp         |
Extension:

| Class          | Attribute                | Method                        | Scenario       | Output             |
|----------------|--------------------------|-------------------------------|----------------|--------------------|
| Account        | List<Transaction> ledger | getLedger()                   |                | List<Transaction>  |
|                | String id                | deposit(int arg)              |                | newBalance         |
|                | float balance            | withdraw(int arg)             | arg <= balance | newBalance         |
|                | float overdraft          |                               | arg > balance  |                    |
|                |                          | getBalance()                  |                | balance            |
|                |                          | getTransactionHistory()       |                | String history     |
|                |                          | getBalanceFromLedger()        |                | float balance      |
|                |                          |                               |                |                    |
| SavingAccount  |                          |                               |                |                    |
| CurrentAccount |                          |                               |                |                    |
|                |                          |                               |                |                    |
| Transaction    | float deltaBalance       | getDeltaBalance()             |                | deltaBalance       |
|                | LocalDateTime timeStamp  | getTimeStamp()                |                | timestamp          |
| Branch         | List<Account> accounts   | getAccounts()                 |                | List<Account> accs |
|                | List<Request> request    | getRequests()                 |                | List<Request> reqs |
|                |                          | acceptRequest(Request)        |                | void               |
|                |                          | denyRequest(Request)          |                | void               |
|                |                          | createRequest(Account, float) |                | void               |
|                |                          | addAccount(Account)           |                | void               |
| Request        | Account acc              |                               |                |                    |
|                | float overdraft          |                               |                |                    |




