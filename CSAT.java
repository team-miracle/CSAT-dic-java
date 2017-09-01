import java.io.*;

class CSAT{
    public static void main(String[] args) throws IOException {
            
        int optionMain = onStart(); //옵션 받아오기
        switch(optionMain){
            // case 0: {
            //     MemoryTask.onMemory();
            //     break;
            // }

            // case 1: {
            //     MemoryTask.numBands
            // }     
        }
    }

    private static showIntro(int inputCycle){
        int introCycle;

        for(introCycle = 0; introCycle <= inputCycle; introCycle++){
        System.out.println("==================================");
        }

        System.out.println("대학수학능력시험 영어 영역 단어");
        System.out.println("Q: 단어 테스트\nA:단어 외우기");
    }

    /*인트로*/
    private static int onStart() throws IOException {
        
        showIntro();

        int returnOption = 7; // 7이 기본값

        BufferedReader readOption = new BufferedReader(new InputStreamReader(System.in));

        //TODO readOption을 어떻게 char로 안전하게 변환할 수 있을까?
        char inputOption = readOption.readLine().charAt(0);

        //TDOO Switch Case 형식으로 바꾸기
        //TODO 액션 지정 필요
        switch(inputOption){
            case 'A':
                returnOption = 0;
            
            case 'Q':
                returnOption = 1;
        }

        return returnOption;
    }
}

class Data{

    //TODO BufferedReader로 외부 파일 불러오도록 만들기
    String usrName; // 사용자 이름
    String usrMemo; // 사용자 정보
    String usrCreateTime; // 생성 시간

    public Data(){
    usrName = "";
    usrMemo = "";
    usrCreateTime = "";
    }

    public String[] getUsrData(boolean def){
        String[] pushData= {usrName, usrMemo, usrCreateTime};
        return pushData;
    }
}

class MemoryTask{
    public static void onMemory(){

    }
}