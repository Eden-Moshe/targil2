import java.util.ArrayList;


/** Description of ShareData
 * @author Eden Moshe
 * @author Shani Fahima
 */
public class SharedData 
{
	/** Description of array
	 * creating an empty list
	 */
	private ArrayList<Integer> array; // Changed from int[] to ArrayList<Integer>
	
	/** Description of winArray
	 *  creating an array of boolean values
	 */
	
	private boolean [] winArray;
	
	/** Description of flag
	 *  creating a boolean value
	 */
	private boolean flag;
	
	/** Description of b
	 *  creating a value for list size
	 */

	private final int b;
	
	/** Description of SharedData()
	 * @param list of Integer called "array"
	 * @param b is lists' size
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**Description of getWinArray()
	 * @return is array of boolean values
	 */
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
        return array;
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
