Before implementing the code, I have to see how thew pseudocode works before putting it to use.
The pseudocode:
**Gnome sort**- What is doing is start at the beginning of the array and compares the current element with the previous one. The comment is provided when putting this into code in the SortingUtility class.
**Cocktail sort** – It goes back and forth think of shaking a cocktail;
Forward pass is moving from left to right where swap any pair that is out of order and then the largest item “bubbles” to the end
Backward pass which moves from left to right where swap any pair that is out of order and the smallest item moves from the beginning and repeats until no swaps happen.
**Shell Sort** - is an improvement of insertion sort that starts by comparing elements far apart then gradually reducing the gap by using a gap sequence and performing a gapped insertion sort and reduced the gap until it becomes 1 and when gap equals 1, it completes the sort.
The comparable object for this code is the 3 Sorts provided in the pseudocode: gnomeSort, cocktailShakerSort, and shellSort.

Running the code that displays the output in UtilityDriver:
**Unsorted data** – First 10 random numbers from the array
**Gnome Sort** - The code prints The First 10 sorted numbers + time in ms
**Cocktail Shaker Sort** - The code prints The First 10 sorted numbers + time in ms
**Shell Sort** - The code prints The First 10 sorted numbers + time in ms
**StopWatch summary** - Table of all timing.
The numbers change when running the code again.

I finally tested out code generate to see what issues can come from not following direction sand using the pseudocode and the given code in project 5.
1.	It doesn’t put the comments on the sorts on the pseudocode in the SortingUltitty sorts are doing so it will generate an output, but you won’t know why the output is the way it is. The easy doesn’t make anyone understand what the code is doing
2.	Variable names change in the SortingUtltityTest class. It was giving arr, a1, a3, a3 which doesn’t match with only a
3.	Generic implementation matches the method requirements in Phase 1 number 2 of the directions in project 5
4.	It generated the code in the test class but the numbers in the array given where random numbers and not the array used for the testing requirements given in phase 3 of the project. The random number in Array is good for testing.

Asking AI for exact variables and being specific is the corrections of the code that is used throughout the project. It handled the generic type constraints the best.
I have never heard of Gnome Sort or Cocktail Shake but is fascinating learning them.
The algorithm logic can be explained if time is put into this project.
Creating a code from scratch would be very tricky, time-consuming, and have more errors.
The more details ask, the code gets cleaner and gets better clarification.
The code generated that is used is well-structured clear and gives needed comments.

In the test cases: The test code passed 22 tests and not one fails in the first try and did properly verify generic behavior.
The AI was good for broad purpose correctness testing.
Manual effort is essential to achieve full coverage, robustness, and generic correctness validations.
AI generated test is faster but higher risk of test falling.
AI saved a lot of time in testing.
Asking more questions in AI regarding testing helps us understand what the tests are doing.

AI is still a great tool to understand the application of computer science fundamentals without going full on hands on with just coding only.
If you are trying to learn how to code only, then relying on AI will not be helpful because you can get stuck on unfamiliar things which can hurt anyone in a job interview or an exam.
AI is as only good as the person using it and making sure the human follows directions.