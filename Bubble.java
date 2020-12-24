package my.test.study.kim_narae;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bubble {

	public static void main(String[] args) {


		//

		int[] strArr = new int[7]; // 7개의 int 배열 strArr 저장
		List<Integer> list = new ArrayList<>(); //

		Random r = new Random();        // Random클래스 초기화. 랜덤한 수 r 생성

			for (int i = 0; i < strArr.length; i++) {  //i는 0부터 시작하며, i가 strArr값보다 작을 경우, 1씩 더해가며 반복한다

				strArr[i] = r.nextInt(45);  			// 45가지의 번호 중 하나를 랜덤 생성하고 그걸 strArr 배열에 넣는다
				for(int j = 0; j < i; j++ ) {
					if(strArr[i] == strArr[j]) {    //   새로운 strArr[i] 값이 이전에 뽑은 strArr[0~i-1]값과 같은지 확인한다.
					 i--;						// strArr[i]이 strArr[j]와 같으면 다시 뽑는다
				 	}
			 	}
			}


		//여기부터 버블정렬
			int temp;
			for (int i = 0; i < strArr.length; i++) {
				for(int j = 1; j < strArr.length - i; j++) {
				if(strArr[j-1] > strArr[j]) {
					temp = strArr[j-1];
					strArr[j-1] = strArr[j];
					strArr[j] = temp;
			 		}
				}
			}


		// 리스트 작성

			for (int value : strArr) { // value에 strARr 배열을 하나씩 집어넣는다
				list.add(value+1);  // 13줄과 세트, value값에 1을 더한 값(0값을 지우기 위해)을 list에 추가한다
			}


			System.out.println("당첨번호 :" + list);
			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			System.out.println("-----------추 첨 중----------");
			System.out.println("---------------------------");
			System.out.println("---------------------------");
			System.out.println("");
		// 내 번호 뽑기


			for(long k = 1; k < k+1; k++) {
				int[] selArr = new int[7]; // 7개의 int 배열 strArr 저장
				List<Integer> list2 = new ArrayList<>(); //
				Random r2 = new Random();        // Random클래스 초기화. 랜덤한 수 r 생성
				for(int i = 0; i < selArr.length; i++) {
					selArr[i] = r2.nextInt(45);  			// 45가지의 번호 중 하나를 랜덤 생성하고 그걸 strArr 배열에 넣는다
					for(int j = 0; j < i; j++ ) {
						if(selArr[i] == selArr[j]) {    //   새로운 strArr[i] 값이 이전에 뽑은 strArr[0~i-1]값과 같은지 확인한다.
						 i--;						// strArr[i]이 strArr[j]와 같으면 다시 뽑는다
					 	}
				 	}

				}

				int temp2;
				for (int i = 0; i < selArr.length; i++) {
				for(int j = 1; j < selArr.length - i; j++) {
				if(selArr[j-1] > selArr[j]) {
					temp2 = selArr[j-1];
					selArr[j-1] = selArr[j];
					selArr[j] = temp2;
			 			}
					}
				}


			// 리스트 작성

				for (int value2 : selArr) { //value에 strARr 배열을 하나씩 집어넣는다
					list2.add(value2+1);  //13줄과 세트, value값에 1을 더한 값(0값을 지우기 위해)을 list에 추가한다
				}


				if(list.equals(list2)) {
					System.out.println("<<<<<추첨 결과>>>>>");
					System.out.println("");
					System.out.println(k+"번째로 산 로또가 당첨되었습니다!");
					System.out.println("내 번호 :" +  list2);
					System.out.println("");
					System.out.println("로또 구매에 들인 비용 : 총 "+(k)*1000+"원!");
					break;
				}
			}

	}
}