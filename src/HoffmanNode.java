public class HoffmanNode {

	private int data;
	private char c;
	private HoffmanNode leftNode;
	private HoffmanNode rightNode;

	public HoffmanNode(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}

	public HoffmanNode(int data, char c) {
		this.data = data;
		this.c = c;
		this.leftNode = null;
		this.rightNode = null;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public HoffmanNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(HoffmanNode leftNode) {
		this.leftNode = leftNode;
	}

	public HoffmanNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(HoffmanNode rightNode) {
		this.rightNode = rightNode;
	}
}
