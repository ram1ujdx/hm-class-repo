function average(...args){
    let sum = 0;
    for(let value of args){
        sum+=value
    }
    return sum/args.length;
}

let avg = average(10,25);

console.log(avg)

arr1 = [10,20,30]

arr2= [70,80]

arr3=[...arr1,...arr2];

console.log(arr3)