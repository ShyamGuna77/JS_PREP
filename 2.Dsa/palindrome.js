
// Palindrome using recursion

function Palindrome (a){
    let m = a;
    let rev = 0;
    while(a!==0){
        rev = rev*10 + a%10;
        a = Math.floor(a/10);
    }

    if(rev === m){
        console.log(true);
    }else{
        console.log(false);
    }
}

Palindrome(123);

