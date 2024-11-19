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

	/** Description of setWithArray()
	 * @param winArray is saved as the classes' value winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}


    /** Description of getArray()
     * Getter for the array
     * @return the array
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /** Description of getB()
     * Getter for b
     * @return b
     */
	public int getB() 
	{
		return b;
	}

	/** Description of getFlag()
	 * getter for value flag
	 * @return boolean value of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** Description of setFlag()
	 * setter for value flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
