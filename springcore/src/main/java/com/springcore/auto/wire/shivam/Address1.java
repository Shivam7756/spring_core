package com.springcore.auto.wire.shivam;

public class Address1 {
         private String lane;
         private String zone;
		public String getLane() {
			return lane;
		}
		
		public void setLane(String lane) {
			this.lane = lane;
		}
		
		public String getZone() {
			return zone;
		}
		
		public void setZone(String zone) {
			this.zone = zone;
		}
		
		public Address1() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Address1 [lane=" + lane + ", zone=" + zone + "]";
		}
         
         
}
