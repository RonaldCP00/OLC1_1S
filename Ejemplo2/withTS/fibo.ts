class fibo{

    fibo_ts(n:number): number {
        return (n<=1)?n:this.fibo_ts(n-1)+this.fibo_ts(n-2);
    }

}
export = fibo;