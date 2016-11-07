package LeetCode;
/*
 * To print Pascals triangle for a given number of rows e.g. for n=5 it must return lists of lists as below
 * [1]
 * [1,1]
 * [1,2,1]
 * [1,3,3,1]
 * [1,4,6,4,1]
 */
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> outerList=new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<numRows;i++){
			list.add(0,1);
			//System.out.println("size of list is: "+list.size());
			//list.set(0, 1);
			for(int j=1;j<list.size()-1;j++){
				list.set(j, list.get(j)+list.get(j+1));
			}
			outerList.add(new ArrayList<>(list));
		}
		return outerList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<List<Integer>> list=generate(5);
		List<List<Integer>> list=generate(5);
		for(List<Integer> l1:list){
				System.out.println(l1);
		}
	}

}
