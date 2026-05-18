
/** 
 @param {number[]} array - The array to be sorted
 @param {number} low - The lower bound index of the currend subarray
 @param {number} high - The upper bound index of the currend subarray
 @returns {number[]} The sorted array
*/
function mergeSort(array, low, high) {
    if (low < high) {
        const  mid = Math.floor((low + high) / 2);
    
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high)
    }
    return array
}


/** 
 @param {number[]} array - The array containing both subarrays
 @param {number} left - Start index of the left subarray
 @param {number} middle - End index of the left subarray
 @param {number} right - End index of the right subarray
*/
function merge(array, left, middle, right) {
    let i = left, j = middle + 1;
    let tmp = [];

    while (i <= middle && j <= right) {
        if (array[i] <= array[j]) {
            tmp.push(array[i++]);
        }
        else {
            tmp.push(array[j++]);
        }
    }

    //Append any reamining elements for subarrays

    while (i <= middle) {
        tmp.push(array[i++]);
    }

    while (j <= right) {
        tmp.push(array[j++]);
    }

    for (let z = 0; z < tmp.length; z++) {
        array[z + left] = tmp[z];
    }

    return tmp
}


arr = [22,1, 2, 5, 1, 7]
console.log(mergeSort(arr, 0, arr.length-1));