# __REPORT__ Assignment3 ADS
# _Murodyan Mansur SE-2513_


## __A. Project Overview__

This project implements and compares fundamental sorting and searching algorithms to analyze their performance using execution time.

Purpose: The main goal is to apply Big-O notation in practical scenarios and measure how performance changes with different input sizes and data structures.

## __B. Algorithm Descriptions__

### _Selected Algorithms:_
1) Basic Sorting: Selection Sort.  

2) Advanced Sorting: Quick Sort.  

3) Searching: Linear Search.

1. Selection Sort (Basic) How it works: It repeatedly finds the minimum element from the unsorted part and puts it at the beginning.  Time Complexity: O(n^2) for best, average, and worst cases.

2. Quick Sort (Advanced) How it works: A divide-and-conquer algorithm that picks an element as a 'pivot' and partitions the given array around the picked pivot.  Time Complexity: Average O(n log n), Worst case O(n^2)

3. Linear Search (Searching) How it works: Sequentially checks each element of the list until a match is found or the whole list has been searched.  Time Complexity: O(n).

## __C. Experimental Results__
| Размер массива | Selection Sort (ns) | Quick Sort (ns) | Linear Search (ns) |
| :--- | :--- | :--- | :--- |
| Small (10) | 3600 | 4500 | 1000 |
| Medium (100) | 42900 | 17300 | 1100 |
| Large (1000) | 1259000 | 244400 | 6500 |

### _Performance Analysis_

Comparison: algorithm that was faster than selected sort is quick sort. That because of O(nlogn) complexity unlike O(n^2) in selection sort

Input Size Impact: Selection sort time was about at ~30 times bigger when I increased amount of elements from 100 to 1000. Basically increased by 10.
Quick sort increased time from 17300 ns to 244400 ns with 100 and 1000 elements therefore. ~14 times bigger.

## __D. Screenshots__

![Main file] <img width="777" height="615" alt="image" src="https://github.com/user-attachments/assets/a505c210-abff-484e-a19e-25815f93e7b9" />
![Experiment] <img width="839" height="909" alt="image" src="https://github.com/user-attachments/assets/f791f38f-8e37-4ee3-b58f-4d741af1e1f0" />
![Sorter part1] <img width="785" height="691" alt="image" src="https://github.com/user-attachments/assets/9150e465-bd7c-4672-a61c-773b8a738f51" />
![Sorter part2] <img width="848" height="656" alt="image" src="https://github.com/user-attachments/assets/21095544-c7f6-4dea-ae36-73f33eb71e9f" />
![Searcher] <img width="1056" height="541" alt="image" src="https://github.com/user-attachments/assets/47f34bdc-5aa5-4eec-9bc9-b8c3a5f8f2b0" />




