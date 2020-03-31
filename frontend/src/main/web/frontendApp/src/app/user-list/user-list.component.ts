import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {ApiService} from "../service/ApiService";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: any;

  constructor(private router: Router, private apiService: ApiService) { }

  ngOnInit() {
    if(!window.sessionStorage.getItem('token')) {
      this.router.navigate(['login']);
      return;
    }
    this.apiService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  }

}
