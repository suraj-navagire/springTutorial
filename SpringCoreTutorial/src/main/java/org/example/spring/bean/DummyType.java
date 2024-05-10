package org.example.spring.bean;

public class DummyType {
		private String desc;

		public DummyType(String desc) {
				this.desc = desc;
				System.out.println("Inside constructor of DummyTpe with desc : "+desc);
		}

		public String getDesc() {
				return desc;
		}

		public void setDesc(String desc) {
				this.desc = desc;
		}

		@Override public String toString() {
				return "DummyType{" + "desc='" + desc + '\'' + '}';
		}
}
