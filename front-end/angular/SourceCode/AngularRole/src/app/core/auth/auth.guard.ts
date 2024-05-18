import { ActivatedRouteSnapshot, CanActivate, CanActivateFn, Router, RouterStateSnapshot } from '@angular/router';
import { RoleUtils } from '../../shared/utils/tableutils/role.utils';
import { Storage } from '../../shared/utils/tableutils/storage.util';

export class AuthGuard implements CanActivate {
  constructor(
    private router: Router,
  ){}
  async canActivate(next: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
      const currentUser = Storage.getCurrentUser();
      if (!currentUser) {
        //Not permission
        return this.router.navigate(['/login']);
      }
        //Permission
        const allowedUserRoles = await RoleUtils.getRoutePermissions(next);
        const permissionCheck = await RoleUtils.checkPermission(currentUser, allowedUserRoles);
        if(permissionCheck){
          return permissionCheck;
        }
    
        //Not permission
        return this.router.navigate(['/login']);
    }
};
