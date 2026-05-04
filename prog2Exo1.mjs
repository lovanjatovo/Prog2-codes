export function countAdults (ages){
    let adults = 0;
    for(let i = 0 ; i < ages.length ; i++){
        if(ages[i] >= 18){
            adults = adults + 1;
        }
    }
    return adults;
};

console.log(countAdults([12,25,26,10,18]));
