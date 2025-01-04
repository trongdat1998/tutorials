import { Component } from '@angular/core';
import { AuthService } from '../auth/auth.service';
// import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {


  constructor(
    private authService: AuthService,
    // private http: HttpClient,
  ){}


  onSubmit() {
    const user: any = {
      username: (<HTMLInputElement>document.getElementById('user')).value,
      password: (<HTMLInputElement>document.getElementById('password')).value
    }
    // this.authService.login(user).subscribe((res)=>{
    //   //localStorage.setItem('userRole', JSON.stringify(res.data.roles));
    // })
  }
}
