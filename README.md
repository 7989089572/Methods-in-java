# Java Method Types

This repository contains Java examples demonstrating the **4 types of methods**.

## Theory

In Java, methods can be classified based on whether they take arguments and/or return a value:

1. **With arguments and with return type:**
   - Takes input parameters and returns a value.
   - Example: `int add(int a, int b)`

2. **Without arguments but with return type:**
   - Doesn't take parameters but returns a value.
   - Example: `int getFixedNumber()`

3. **With arguments but without return type:**
   - Takes parameters but does not return a value (void).
   - Example: `void greet(String name)`

4. **Without arguments and without return type:**
   - No parameters and no return value (void).
   - Example: `void showMessage()`

---

## Code Example

See [`MethodTypes.java`](./MethodTypes.java) for the full code.

To run all examples:

```sh
javac MethodTypes.java
java MethodTypes
```

**Output:**
```
Sum: 12
Fixed Number: 10
Hello, Harikrishna!
This is Java method example.
```

---

Happy Coding! ✨
