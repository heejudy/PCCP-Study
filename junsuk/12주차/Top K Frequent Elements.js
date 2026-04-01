/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const map = new Map;
    let result = [];

    for(let i = 0; i < nums.length; i++) {
        map.set(nums[i], map.get(nums[i]) + 1 || 1);
    }
    
    const sortMap = new Map([...map].sort((a, b) => b[1] - a[1]));
    const iterator = sortMap.keys();

    for(let j = 0; j < k; j++) {
        result.push(iterator.next().value);
    }
    return result;

};
