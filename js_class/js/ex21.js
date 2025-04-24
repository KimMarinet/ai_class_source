function add(num1, num2){
    return num1 + num2;
}

const nums = [100, 200, 300];
const nums2 = [1,2, ...nums, 4,5,6];

console.log(add(...nums)); // 300
console.log(nums2); //1, 2, 100, 200, 300, 4,   5,   6