package com.springcore.practice.shivam;

public class B {
        private String name;
        private int val;
		public B() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "B [name=" + name + ", val=" + val + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

		public B(String name, int val) {
			super();
			this.name = name;
			this.val = val;
		}
        
		
        
}
