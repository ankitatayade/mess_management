package com.code;

public enum MessPlan {
	
	 MONTHLY (3000), QUARTERLY (11700), HALFYEAR (17500), YEARLY (32000);
	
		private double planAmount;

		
		private MessPlan(double planAmount) {
			this.planAmount = planAmount;
		}


		public double getPlanAmount() {
			return planAmount;
		}


		public void setPlanAmount(double planAmount) {
			this.planAmount = planAmount;
		}
		
		
		


}
