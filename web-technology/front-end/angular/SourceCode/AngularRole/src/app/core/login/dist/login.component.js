"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.LoginComponent = void 0;
var core_1 = require("@angular/core");
// import { HttpClient } from '@angular/common/http';
var LoginComponent = /** @class */ (function () {
    function LoginComponent(authService) {
        this.authService = authService;
    }
    LoginComponent.prototype.onSubmit = function () {
        var user = {
            username: document.getElementById('user').value,
            password: document.getElementById('password').value
        };
        // this.authService.login(user).subscribe((res)=>{
        //   //localStorage.setItem('userRole', JSON.stringify(res.data.roles));
        // })
    };
    LoginComponent = __decorate([
        core_1.Component({
            selector: 'app-login',
            standalone: true,
            imports: [],
            templateUrl: './login.component.html',
            styleUrl: './login.component.css'
        })
    ], LoginComponent);
    return LoginComponent;
}());
exports.LoginComponent = LoginComponent;
