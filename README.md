# Kotlin ConcurrentModificationException during List Iteration

This example demonstrates a common error in Kotlin involving `ConcurrentModificationException` when modifying a `MutableList` while iterating over it using a `for` loop.  The `removeIf` function safely removes elements from lists and sets, but directly modifying the list within a `for` loop is unsafe.

The `bug.kt` file shows the problem, while `bugSolution.kt` provides the corrected approach using an iterator or a copy of the list.

This repository highlights the importance of using safe methods like `removeIf` or iterators when modifying collections during iteration to avoid runtime exceptions.  The solution showcases safer approaches to remove elements from a list.