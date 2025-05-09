const nums = [1,2,3,4,5,6,7,8,9,10];

function process(currentValue){
    return currentValue * currentValue;
}

const nums2 = nums.map(process);

console.log(nums, nums2);