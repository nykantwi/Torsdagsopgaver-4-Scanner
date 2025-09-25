class Main{
	public static void main (String[]args){
		Team t1 = new Team ("Liverpool");
		Team t2 = new Team ("Arsenal");
		Team t3 = new Team ("ManCity");
		Team t4 = new Team ("Chelsea");
		Team t5 = new Team ("Spurs");
		
		// sææter rankt for hvert hold
		t1.setRank(1);
		t2.setRank(2);
		t3.setRank(3);
		t4.setRank(4);
		t5.setRank(5);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);

	}

}