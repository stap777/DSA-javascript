function removingVal(arr, val) {
    if (arr.length === 0) return 0;

    let s = 0;
    let f = 0;

    while (f < arr.length) {
        if (arr[f] !== val) {
            arr[s] = arr[f];
            s++;
            
        }
        f++;
    }
    return (s);
}

let arr = [1,1,1,2,2,3,4];
let val = 1;
let k = removingVal(arr, val);

console.log(k);
console.log(arr);
