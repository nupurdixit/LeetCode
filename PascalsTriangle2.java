package LeetCode;
/* Pascals Triangle extension
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
 */
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
	public static List<Integer> generate(int index){
		List<List<Integer>> outerList=new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<index+1;i++){
			list.add(0,1);
			//System.out.println("size of list is: "+list.size());
			//list.set(0, 1);
			for(int j=1;j<list.size()-1;j++){
				list.set(j, list.get(j)+list.get(j+1));
			}
			outerList.add(new ArrayList<>(list));
		}
		return outerList.get(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=generate(5);
		for(Integer l1:list){
			System.out.print(l1+" ");
		}
	}

}
