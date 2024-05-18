"use strict";
exports.__esModule = true;
exports.AppRouteModule = exports.routes = void 0;
var login_component_1 = require("./core/login/login.component");
exports.routes = [
    { path: '', component: login_component_1.LoginComponent, pathMatch: 'full' },
];
var AppRouteModule = /** @class */ (function () {
    function AppRouteModule() {
    }
    return AppRouteModule;
}());
exports.AppRouteModule = AppRouteModule;
