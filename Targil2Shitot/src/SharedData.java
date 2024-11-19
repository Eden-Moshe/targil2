public class SharedData 
{
	private ArrayList[] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	// Getter for the array
    public ArrayList<Integer> getArray() {
        return array;
    }

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
