import java.io.*;

class CSAT{
    public static void main(String[] args) throws IOException {


        System.out.println("대학수학능력시험 영어 영역 단어");
        System.out.println("Q: 단어 퀴즈\nA:단어 외우기");

        BufferedReader readOption = new BufferedReader(new InputStreamReader(System.in));

        //TODO char일 때 작동 확인
        char inputOption = char(readOption.readLine());

        //TDOO Switch Case 형식으로 바꾸기
        //TODO 액션 지정 필요
        switch(inputOption){
        	case A :
        	System.out.println("A");
        	break;
        	
        	case Q :
        	System.out.println("Q");
        	break;
        }
    }
}
