import java.io.*;

class CSAT{
    public static void main(String[] args) {
            
        int optionMain = onStart(); //옵션 받아오기
    }

    /*인트로*/
    private static int onStart() throws IOException {

        int returnOption = 7; // 7이 기본값

        System.out.println("대학수학능력시험 영어 영역 단어");
        System.out.println("Q: 단어 테스트\nA:단어 외우기");

        BufferedReader readOption = new BufferedReader(new InputStreamReader(System.in));

        //TODO readOption을 어떻게 char로 안전하게 변환할 수 있을까?
        char inputOption = readOption.readLine().toCharArray();

        //TDOO Switch Case 형식으로 바꾸기
        //TODO 액션 지정 필요
        switch(inputOption){
            case A:
                returnOption = 0;
            
            case Q:
                returnOption = 1;
        }

        return returnOption;
    }
}

public class Data{

    //TODO BufferedReader로 외부 파일 불러오도록 만들기
    String usrName; // 사용자 이름
    String usrMemo; // 사용자 정보
    int usrCreate; // 생성 시간

    public Data(){
    usrName = "";
    usrMemo = "";
    usrCreateDate = System.DATETIME;
    }

    public String getUsrData(boolean def){
        String[] pushData= {usrName, usrMemo, usrCreate};
        return pushData;
    }


}

public class MemoryTask{
    public static void onMemory(){

    }
}