export class Storage {
    public static readonly USER_KEY = 'user';

    static getItem(key: string): any{
        const valueStr = localStorage.getItem(key);
        if(!valueStr || valueStr=="undefined"){
          return undefined;
        }
      
        return valueStr;
      }
    static getCurrentUser(): any{
        const jsonInfo = Storage.getItem(this.USER_KEY);
        if(!jsonInfo) return undefined;
      
        const currentUser = JSON.parse(jsonInfo);
        return currentUser;
      }
}
