/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var backspaceCompare = function(s, t) {
    function process(str){
        const stack = [];
        for (let char of str) {
            if (char === '#') {
                stack.pop();
            } else {
                stack.push(char);
            }
        }
        return stack.join('');
    };

    return process(s) === process(t);
};

//두 문자열 s와 t가 주어졌을 때, 이 두 문자열을 빈 텍스트 편집기에 입력했을 때 내용이 같으면 true를 반환하십시오. '#'은 백스페이스 문자를 의미합니다.
//빈 텍스트를 백스페이스로 지운 후에도 텍스트는 계속 비어 있는 상태로 유지된다는 점에 유의하십시오.
