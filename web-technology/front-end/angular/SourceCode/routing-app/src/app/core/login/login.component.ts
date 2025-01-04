import { Component } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  constructor(
    private authService: AuthService,
    private http: HttpClient,
  ){}

  onSubmit() {
    console.log("click");
    const user: any = {
      username: (<HTMLInputElement>document.getElementById('uname')).value,
      password: (<HTMLInputElement>document.getElementById('password')).value
    }
    this.authService.login(user).subscribe((res: any[])=>{
      //localStorage.setItem('userRole', JSON.stringify(res.data.roles));
      console.log(res);
      alert("Login thành công");
    })
  }
}
