import index from ".";
import fibo from "./fibo";

function factorialts(n:number): number {
    return (n<=1)?1:n*factorialts(n-1);
}


console.log(factorialts(5));
console.log(index.prototype.suma());
console.log(fibo.prototype.fibo_ts(5));