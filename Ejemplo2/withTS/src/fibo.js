"use strict";
var fibo = /** @class */ (function () {
    function fibo() {
    }
    fibo.prototype.fibo_ts = function (n) {
        return (n <= 1) ? n : this.fibo_ts(n - 1) + this.fibo_ts(n - 2);
    };
    return fibo;
}());
module.exports = fibo;
