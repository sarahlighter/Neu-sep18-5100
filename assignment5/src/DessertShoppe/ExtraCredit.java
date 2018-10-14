package DessertShoppe;

import java.util.ArrayList;
import java.util.List;


public class ExtraCredit {
	public static List<Integer> spiralOrder(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new ArrayList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		int layer=0;
		int m=matrix[0].length, n=matrix.length;
		int count=m*n;
		int i=0,j=0;
		if(m==1){
			while(i<n){
				list.add(matrix[i++][0]);
			}
			return list;
		}
		if(n==1){
			while(j<m){
				list.add(matrix[0][j++]);
			}
			return list;
		}
		while(count>0&&(layer<m/2||layer<n/2)){
			i=layer; j=layer;
			while(j<m-layer-1 &&count>0){
				list.add(matrix[i][j]);
				j++;
				count--;
			}
			while(i<n-1-layer&&count>0){
				list.add(matrix[i][j]);
				i++;
				count--;
			}
			while(j>layer&&count>0){
				list.add(matrix[i][j]);
				j--;
				count--;
			}
			while(i>layer&&count>0){
				list.add(matrix[i][j]);
				i--;
				count--;
			}
			if(count==1) list.add(matrix[m/2][n/2]);
			layer++;
		}
		return list;
	}
	public static void main(String[] args) {
		int[][] matrix={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int[][] matrix1={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix3={{1},{2},{3},{4}};
		int[][] matrix4={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
		List<Integer> list=spiralOrder(matrix);
		for(Integer num:list){
			System.out.print(num+", ");
		}
	}
}
