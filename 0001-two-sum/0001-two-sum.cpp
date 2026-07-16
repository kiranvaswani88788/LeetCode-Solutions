#include <vector> // This line is needed to use the vector data structure

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        // Get the number of elements in the 'nums' array.
        int n = nums.size();

        // Loop through each number in the array, from the first to the last.
        for (int i = 0; i < n; ++i) {

            // For each number 'nums[i]', check it against all the numbers
            // that come AFTER it. We start 'j' from 'i + 1' to avoid
            // checking the same number twice or checking a number against itself.
            for (int j = i + 1; j < n; ++j) {

                // Check if the sum of the two numbers is equal to the target.
                if (nums[i] + nums[j] == target) {

                    // If they are, we've found our answer!
                    // Return a new vector containing the indices 'i' and 'j'.
                    // The problem guarantees a solution exists, so we can return immediately.
                    return {i, j};
                }
            }
        }
        
        // This line is technically not needed for this specific problem
        // because a solution is guaranteed. However, in other problems,
        // it's good practice to handle the case where no solution is found.
        return {}; 
    }
};