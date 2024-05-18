import { ActivatedRouteSnapshot } from '@angular/router';
import { ROLES } from '../constants/roles.constant';

export class RoleUtils {
  public static async getRoutePermissions(route: ActivatedRouteSnapshot): Promise<ROLES[]> {
    if (route.data && route.data['userrole']) {
      return route.data['userrole'] as ROLES[];
    }
    return [];
  }
  public static async checkPermission(
    currentUser: any,
    allowedUserRoles: ROLES[]
  ): Promise<boolean> {
    if (!allowedUserRoles || allowedUserRoles.length == 0) {
      return true;
    }

    if (!currentUser) {
      return false;
    }

    if (!currentUser || !currentUser.role) {
      return false;
    }

    const role = currentUser.role.trim().toLowerCase();

    for (let allowed of allowedUserRoles) {
      if (!allowed) continue;

      const allowedStr = allowed.trim().toLowerCase();
      if (role == allowedStr) {
        return true;
      }
    }

    return false;
  }
}
