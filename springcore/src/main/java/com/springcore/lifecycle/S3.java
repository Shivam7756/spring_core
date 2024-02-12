package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class S3 {
          private String subject;

		public S3() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		@Override
		public String toString() {
			return "S3 [subject=" + subject + "]";
		}
		
		@PostConstruct
		public void start()
		{
			System.out.println("Starting Method");
		}
		
		@PreDestroy
		public void end()
		{
			System.out.println("Ending Method");
		}
}
