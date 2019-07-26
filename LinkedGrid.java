package code;
//KNIGHT
public class LinkedGrid {
	private static Node first;
	private int dimension;
	private int counter = 1;
	private int solution = 0;
	public LinkedGrid(int dimension) {
		this.dimension = dimension;
		Node temp = new Node();
		first = temp;
		Node columnMarker = first;
		Node rowMarker = first;
		
		//Making the rest of the row
		for(int x = 0; x < dimension-1; x++){
			temp = new Node();
			temp.setLeft(columnMarker);
			columnMarker.setRight(temp);
			columnMarker = temp;
		}
		for(int y = 0; y < dimension-1; y++){
			
			temp = new Node();
			columnMarker = temp;
			temp.setUp(rowMarker);
			rowMarker.setDown(temp);
			for(int x = 0; x<dimension-1; x++){
				temp = new Node();
				temp.setLeft(columnMarker);
				columnMarker.setRight(temp);
				columnMarker.getUp().getRight().setDown(temp);
				temp.setUp(columnMarker.getUp().getRight());
				columnMarker = temp;
			}
			rowMarker = rowMarker.getDown();
		}
	}
	public static Node path1(Node temp) { //down 3 o'clock
		Node path1 = null;
		if(temp.getRight() != null)
		{
			if ( temp.getRight().getRight() != null) {
				if(temp.getRight().getRight().getDown()!= null) {
//					System.out.println("path1 exists");
					path1 = temp.getRight().getRight().getDown();
				}			
			}			
		}
		return path1;
	}
	public static Node path2(Node temp) { // up 3 o'clock
		Node path2 = null;
		if(temp.getRight() != null)
		{
			if ( temp.getRight().getRight() != null) {
				if(temp.getRight().getRight().getUp()!= null)
					path2 = temp.getRight().getRight().getUp();
			}			
		}
		return path2;
	}
	public static Node path3(Node temp) { // left 12
		Node path3 = null;
		if(temp.getLeft() != null)
		{
			if ( temp.getLeft().getUp() != null) {
				if(temp.getLeft().getUp().getUp()!= null)
					path3 = temp.getLeft().getUp().getUp();
			}			
		}
		return path3;
	}
	public static Node path4(Node temp) { //right 12
		Node path4 = null;
		if(temp.getRight() != null)
		{
			if ( temp.getRight().getUp() != null) {
				if(temp.getRight().getUp().getUp()!= null)
					path4 = temp.getRight().getUp().getUp();
			}			
		}
		return path4;
	}
	public static Node path5(Node temp) { //up 9
		Node path5 = null;
		if(temp.getLeft() != null)
		{
			if ( temp.getLeft().getLeft() != null) {
				if(temp.getLeft().getLeft().getUp()!= null)
					path5 = temp.getLeft().getLeft().getUp();
			}			
		}
		return path5;
	}
	public static Node path6(Node temp) { //down 9
		Node path6 = null;
		if(temp.getLeft() != null)
		{
			if ( temp.getLeft().getLeft() != null) {
				if(temp.getLeft().getLeft().getDown()!= null)
					path6 = temp.getLeft().getLeft().getDown();
			}			
		}
		return path6;
	}
	public static Node path7(Node temp) { //right 6
		Node path7 = null;
		if(temp.getRight() != null)
		{
			if ( temp.getRight().getDown() != null) {
				if(temp.getRight().getDown().getDown()!= null)
					path7 = temp.getRight().getDown().getDown();
			}			
		}
		return path7;
	}
	public static Node path8(Node temp) { //left 6
		Node path8 = null;
		if(temp.getLeft() != null)
		{
			if ( temp.getLeft().getDown() != null) {
				if(temp.getLeft().getDown().getDown()!= null)
					path8 = temp.getLeft().getDown().getDown();
			}			
		}
		return path8;
	}
	public void display()
	{
		Node temp = first;
		Node rowMarker = first;
		while(temp!=null)
		{
			while(temp!=null)
			{
				if(temp.getData() < 10)
				System.out.print(temp.getData() + "   ");
				else if (temp.getData() < 100)
				System.out.print(temp.getData() + "  ");
				else
				System.out.print(temp.getData() + " ");
				temp = temp.getRight();
			}
			System.out.println();
			rowMarker = rowMarker.getDown();
			temp = rowMarker;
		}
	}
	public static Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public void flood(Node temp, int counter){	
//		System.out.println();
		temp.setData(counter);
		if ( counter < (dimension*dimension))	{	
			if(path1(temp) != null && path1(temp).getData() ==0) {
				flood (path1(temp),counter+1);
			}
			if(path2(temp) != null && path2(temp).getData() == 0) {
				flood (path2(temp),counter+1);		
			}
			if(path3(temp) != null && path3(temp).getData() == 0) {
				flood (path3(temp),counter+1);		
			}
			if(path4(temp) != null && path4(temp).getData() == 0) {
				flood (path4(temp),counter+1);		
			}
			if(path5(temp)   != null && path5(temp).getData() == 0) {
				flood (path5(temp),counter+1);
			}
			if(path6(temp) != null && path6(temp).getData() == 0) {
				flood (path6(temp),counter+1);
			}
			if(path7(temp) != null && path7(temp).getData() == 0) {
				flood (path7(temp),counter+1);
			}
			if(path8(temp) != null && path8(temp).getData() == 0) {
				flood (path8(temp),counter+1);
			}			
			temp.setData(0);
		}
//		display();
		if(counter == dimension*dimension) {
			solution++;
			System.out.println("Solution:" + solution);
			display();
			System.out.println("");
		}	
	}	
}
