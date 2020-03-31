import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {UserListComponent} from "./user-list/user-list.component";


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'user-list', component: UserListComponent},
  {path : '', component : LoginComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
