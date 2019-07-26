package code;
//KNIGHT
public class Node {
	private int data;
	private Node right;
	private Node left;
	private Node up;
	private Node down;
	private Node pathway1;
	private Node pathway2;
	private Node pathway3;
	private Node pathway4;
	private Node pathway5;
	private Node pathway6;
	private Node pathway7;
	private Node pathway8;
	public Node(int data) {
		this.data = data;
	}
	public Node() {
		this.data = 0;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getUp() {
		return up;
	}
	public void setUp(Node up) {
		this.up = up;
	}
	public Node getDown() {
		return down;
	}
	public void setDown(Node down) {
		this.down = down;
	}
	public Node getPathway1() {
		return pathway1;
	}
	public void setPathway1(Node temp,Node pathway1) {
		if(temp.getRight() != null)
		{
			if ( temp.getRight() != null) {
				if(temp.getDown()!= null)
					this.pathway1 = temp.getRight().getRight().getDown();
			}			
		}
	}
	public Node getPathway2() {
		return pathway2;
	}
	public void setPathway2(Node temp,Node pathway2) {
		if(temp.getRight() != null)
		{
			if ( temp.getRight() != null) {
				if(temp.getUp()!= null)
					this.pathway1 = temp.getRight().getRight().getUp();
			}			
		}
	}
	public Node getPathway3() {
		return pathway3;
	}
	public void setPathway3(Node temp, Node pathway3) {
		if(temp.getLeft() != null)
		{
			if ( temp.getUp() != null) {
				if(temp.getUp()!= null)
					this.pathway1 = temp.getLeft().getUp().getUp();
			}			
		}
	}
	public Node getPathway4() {
		return pathway4;
	}
	public void setPathway4(Node temp,Node pathway4) {
		if(temp.getRight() != null)
		{
			if ( temp.getUp() != null) {
				if(temp.getUp()!= null)
					this.pathway1 = temp.getRight().getUp().getUp();
			}			
		}
	}
	public Node getPathway5() {
		return pathway5;
	}
	public void setPathway5(Node temp, Node pathway5) {
		if(temp.getLeft() != null)
		{
			if ( temp.getLeft() != null) {
				if(temp.getUp()!= null)
					this.pathway1 = temp.getLeft().getLeft().getUp();
			}			
		}
	}
	public Node getPathway6() {
		return pathway6;
	}
	public void setPathway6(Node temp, Node pathway6) {
		
	}
	public Node getPathway7() {
		return pathway7;
	}
	
	public Node getPathway8() {
		return pathway8;
	}
		
}
