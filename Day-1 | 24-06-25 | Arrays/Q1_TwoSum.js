const twoSum = function(nums, target) {
    const comp = {};
    for(let i=0; i<nums.length; i++){
        console.log(comp,i)
        if(comp[nums[i] ]>=0){
            return [ comp[nums[i] ] , i]
        }
        comp[target-nums[i]] = i
    }
};

let nums = [2,4,7,8,9];
let target =9;

let result = twoSum(nums,target);
console.log(result)