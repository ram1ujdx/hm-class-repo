import { Component, OnInit } from '@angular/core';
import { AdminTestService } from '../admin/admin-test.service';

@Component({
  selector: 'app-flight-booking',
  templateUrl: './flight-booking.component.html',
  styleUrls: ['./flight-booking.component.css']
})
export class FlightBookingComponent implements OnInit {

  constructor(private _adMinTestService:AdminTestService) { }

  ngOnInit(): void {
  }

}
