function removeDuplicates(arr) {
    if (arr.length === 0 ) return 0;
    
    let s = 0;
    let f = 1;
    
    while (f < arr.length) {
        if (arr[s] !== arr[f]) {
            s++;
            arr[s] = arr[f];
        }
    f++
    }
    
    return s+1;
}

let arr = [1,1,1,2,2,3,4,4,5,6,7,888,9,6,3];
let k = removeDuplicates(arr);

console.log(k);       
console.log(arr); 
