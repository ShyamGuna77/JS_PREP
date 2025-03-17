

function BubbleSort(elements){
   for(let i =0 ;i <elements.length ; i ++){
    for(let j= 0 ; j < elements.length-1 ; j++){
        if(elements[j]>elements[j+1]){
            let temp = elements[j];
            elements[j]=elements[j+1]
            elements[j+1] = temp;
        }
    }
   }
   return elements;
}

console.log(BubbleSort([2,5,3,19,1,2,4,7]));