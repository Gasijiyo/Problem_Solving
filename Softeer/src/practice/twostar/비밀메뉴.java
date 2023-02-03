package practice.twostar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀메뉴 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuffer mList = new StringBuffer();
        StringBuffer nList = new StringBuffer();
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < M ; i++){
            mList.append(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++){
            nList.append(st.nextToken());
        }
        
        if (nList.toString().contains(mList.toString())){
            System.out.println("secret");
        } else {
            System.out.println("normal");
        }
		
	}

}
