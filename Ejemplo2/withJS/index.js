
function suma(){
    let let_type = 1;
    var var_type = 2;
    const const_type = 3;

    return let_type+var_type+const_type;
}

function factorial(n){
    return (n<=1)?1:n*factorial(n-1);
}

function fibo(n){
    return (n<=1)?n:fibo(n-1)+fibo(n-2);
}

console.log(suma());
console.log(factorial(5));
console.log(fibo(5));