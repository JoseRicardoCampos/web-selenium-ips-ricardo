package Part2;


public class Calculator {

	public Floor floor = new Floor(3, 2.4);
	public Carpet carpet = new Carpet(5);

	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}

	public void getTotalCost() {

		System.out.println("Total: " + carpet.getCost() * floor.getArea());

	}

	
}
