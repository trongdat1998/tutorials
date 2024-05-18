import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './core/login/login.component';
import { UserComponent } from './layout/user/user.component';
import { ROLES } from './shared/utils/constants/roles.constant';
import { CompanyComponent } from './layout/company/company.component';
import { AuthGuard } from './core/auth/auth.guard';

const routes: Routes = [
  //{ path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent, pathMatch: 'full' },
  { path: 'user', component: UserComponent,canActivate: [AuthGuard], data:{
    userRole: [ROLES.ROLE_CUSTOMER]
  } },
  { path: 'company', component: CompanyComponent,canActivate: [AuthGuard], data:{
    userRole: [ROLES.ROLE_STAFF]
  } },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
