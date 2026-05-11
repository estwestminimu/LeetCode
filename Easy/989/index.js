/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function(num, k) {
    num.reverse();
    let carry = 0
    let i =0;
    while(k)
    {
        if(i>=num.length)
        {
            num.push((k%10)%10)
        }
        else
        {
            carry = Math.trunc((num[i]+k%10)/10); 
            num[i]=(num[i]+k%10)%10;
        }
        k=Math.trunc(k/10)+carry;
        carry=0;

      i++;  
    }
    return num.reverse();
};