import { ActivatedRouteSnapshot, CanActivate, CanActivateFn, Router, RouterStateSnapshot } from '@angular/router';
import { RoleUtils } from '../../shared/utils/tableutils/role.utils';
import { Storage } from '../../shared/utils/tableutils/storage.util';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(
    private router: Router,
  ){}
  async canActivate(next: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
      const currentUser = Storage.getCurrentUser();
      if (!currentUser) {
        //Not permission
        //return this.router.navigate(['/login']);
      }
        //Permission
        const allowedUserRoles = await RoleUtils.getRoutePermissions(next);
        const permissionCheck = await RoleUtils.checkPermission(currentUser, allowedUserRoles);
        if(permissionCheck){
          return true;
        }
    
        //Not permission
        //return this.router.navigate(['/login']);
        return true;
    }
};
