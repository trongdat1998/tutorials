import { Routes } from '@angular/router';
import { AuthGuard } from './core/auth/auth.guard';
import { ROLES } from './shared/utils/constants/roles.constant';
import { LoginComponent } from './core/login/login.component';

export const routes: Routes = [
  { path: '', component: LoginComponent, pathMatch: 'full' },
  // {
  // path: '',
  // //component: MainComponent,
  // canActivate: [AuthGuard],
  // data: {
  //     userRoles: [ROLES.SYSTEM_ADMINISTRATOR, ROLES.EXTERNAL_MAINTENANCE_COMPANY, ROLES.HEADQUARTERS_MANAGEMENT_DEPARTMENT, ROLES.WAREHOUSE_MANAGER, ROLES.MAINTENANCE_STAFF, ROLES.DRIVER]
  //   }
  // }
];
export class AppRouteModule { }
