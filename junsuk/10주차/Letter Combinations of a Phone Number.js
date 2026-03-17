/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    if(digits.length === 0){
        return [];
    }

    const map = new Map([
        ["2", "abc"],
        ["3", "def"],
        ["4", "ghi"],
        ["5", "jkl"],
        ["6", "mno"],
        ["7", "pqrs"],
        ["8", "tuv"],
        ["9", "wxyz"]
    ]);

    const result = [];

    function backtracking(index, currentString){
        if(index === digits.length){
            result.push(currentString);
            return;
        }

        let letters = map.get(digits[index])

        for(const letter of letters){
            backtracking(index + 1, currentString + letter);
        }
    }
    
     backtracking(0, "");
        return result;
};
