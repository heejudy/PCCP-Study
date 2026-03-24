/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    const set2 = new Set(nums2);

    const uniqueIntersection = [...new Set(nums1.filter(item => set2.has(item)))];
    
    return uniqueIntersection;

};


// 배열길이 최대 1000
// 배열안의 수 0 ~ 1000
// 두 배열의 교집합을 return해라
// 일반적인 생각 모두 돌면서 확인하면 되는거 아닌가? => 그러면 선택하는거 시간복잡도 O(n)임
// 해쉬테이블 사용해야겠네 선택하는 시간복잡도가 O(1)이니깐
// 교집합이어서 중복제외해야함.
// 그러면 중복이 자동으로 제외되는 map에 넣자
// map말고 set으로 하면 더 쉬울 듯?
// 투 포인터로 풀어보기?

