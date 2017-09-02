import java.io.*;

public class CSAT{

    /*시작화면 보여주는 메소드*/
    private showIntro(int inputCycle){
        int introCycle;

        for(introCycle = 0; introCycle <= inputCycle; introCycle++){
        System.out.println("==================================");
        }

        System.out.println("대학수학능력시험 영어 영역 단어");
        System.out.println("Q: 단어 테스트\nA: 단어 외우기\nDebug: 디버그");
    }
    
    public static void main(String[] args) throws IOException {
            
        int optionMain = onStart(); //옵션 받아오기

    }

    /*인트로*/
    private static int onStart() throws IOException {
        
        showIntro();
        //TDOO Switch Case 형식으로 바꾸기
        //TODO 액션 지정 필요
        int inputOption = Task.readString();
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

public class Task{


    /*String 읽어오는 메소드*/
    public static String readString() throws IOException{

        BufferedReader readOptionBuffer = new BufferedReader(new InputStreamReader(System.in));
        String readOptionString = readOptionBuffer.readLine();

        //TODO Try & catch로 만들기
        if(readOptionString = null){
            readOptionString = "7"; //실패 했을 때 에러 코드
        }
        return readOptionString;
    }
}

class Debug{
    public static void onDebug(int debugOption){
        switch(debugOption){
            case 0:{
                
            }

            case 1:{

            }

            default:
        }
    }
}