DSA Java Medium
A curated collection of medium-level Data Structures and Algorithms (DSA) problems solved in Java, designed for TCS NQT and other tech company interview preparation. This repository showcases optimized solutions with detailed notes explaining logic, edge cases, complexity, and relevance to coding interviews.
🎯 Purpose
This repository is built to:

Prepare for coding rounds like TCS NQT and other tech interviews (e.g., Infosys, Wipro, Accenture).
Demonstrate problem-solving skills and Java proficiency.
Provide clear explanations for each solution to aid learning and interview preparation.

📂 Structure
The repository is organized by data structure, with each folder containing:

Java source code for problems.
Detailed notes explaining the logic, edge cases, and complexity.
Sample test cases and relevance to tech interviews.

Arrays

Problem
Description
Time Complexity
Space Complexity

FindMaxElement.java
Finds the maximum element in an array.
O(n)
O(1)

MoveZeroes.java
Moves all zeros to the end while maintaining the order of non-zero elements.
O(n)
O(1)

TwoSum.java
Finds indices of two numbers summing to a target using a HashMap.
O(n)
O(n)

📝 Notes
FindMaxElement.java

Logic Explained: Iterates through the array, comparing each element with the current maximum and updating it if a larger element is found.
Edge Cases:
Empty array: Returns -1.
Single element: Returns that element.
All negative numbers: Returns the largest negative number.

Time Complexity: O(n), as the array is traversed once.
Space Complexity: O(1), uses only one variable to track the maximum.
Relevance: Common in TCS NQT coding section and other tech interviews (e.g., "Find max/min element"). Demonstrates basic array traversal skills.

MoveZeroes.java

Logic Explained: Uses a two-pointer approach. One pointer tracks the position for the next non-zero element, moving non-zeros to the front. Remaining positions are filled with zeros.
Edge Cases:
Empty array: No change needed.
All zeros: Array remains all zeros.
No zeros: Array remains unchanged.

Time Complexity: O(n), one pass for non-zeros and one for filling zeros.
Space Complexity: O(1), in-place operation.
Relevance: Frequently appears in TCS NQT (e.g., "Move zeros to end") and other tech interviews. Shows proficiency in in-place array manipulation.

TwoSum.java

Logic Explained: Uses a HashMap to store elements and their indices. For each element, checks if its complement (target - element) exists in the map. If found, returns the pair of indices.
Edge Cases:
Empty array: Returns empty array.
No solution: Returns empty array.
Duplicate elements: Handled by storing first occurrence in HashMap.

Time Complexity: O(n), single pass with HashMap lookups.
Space Complexity: O(n), for the HashMap.
Relevance: Common in tech interviews, including TCS NQT and companies like Infosys, Wipro. Demonstrates optimization using hash-based data structures.

🚀 How to Use

Clone the Repository:git clone https://github.com/tera-username/DSA-Java-Medium.git

Navigate to a Problem:cd DSA-Java-Medium/Arrays

Compile and Run:javac Filename.java
java Filename

Follow the prompts to input test cases and see outputs.

🛠️ Tools and Technologies

Language: Java
IDE: Any Java-supported IDE (e.g., IntelliJ IDEA, VS Code)
Version Control: Git and GitHub

📚 Learning Approach

Solutions are optimized for performance and readability.
Notes explain logic, edge cases, and complexity for easy understanding.
Problems align with common patterns in TCS NQT and other tech interviews.
Regular updates with new problems and data structures.

💡 Interview Preparation Tips

Focus on arrays for TCS NQT coding section, as they are common.
Practice edge cases (empty arrays, duplicates) to handle all scenarios.
Be ready to explain time/space complexity in interviews.
Use this repo to showcase your problem-solving skills to recruiters.

🌟 Future Plans

Add solutions for strings, linked lists, stacks, queues, and trees.
Include more problems relevant to TCS NQT and other tech interviews.
Provide visualizations (e.g., diagrams for algorithms).

📬 Contact

GitHub: sauravrawat99
LinkedIn: [www.linkedin.com/in/saurav-rawat-]

Happy coding, and all the best for your tech interviews! 🚀
