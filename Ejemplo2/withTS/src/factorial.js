"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
var _1 = __importDefault(require("."));
var fibo_1 = __importDefault(require("./fibo"));
function factorialts(n) {
    return (n <= 1) ? 1 : n * factorialts(n - 1);
}
console.log(factorialts(5));
console.log(_1.default.prototype.suma());
console.log(fibo_1.default.prototype.fibo_ts(5));
