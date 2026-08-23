# Java DSA Practice

A Maven-free Java practice workspace.

## Run

From the project root:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out src\*.java
java -cp out Main
```

Add new practice classes under `src`. Keep each public class in a file with the same name.
