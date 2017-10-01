import java.io.BufferedReader;
import java.io.IOException;

public class CSAT{

    public static void main(String[] args) throws IOException {
        showIntro(); // Intro 보여주기
        int optionMain = onGetOption(); //옵션 받아오기
    }
    /*시작화면 보여주는 메소드*/
    private showIntro(){
        for(int i = 0; i <= 2; i++){
        System.out.println("==================================");
        }

        System.out.println("대학수학능력시험 영어 영역 단어");
        System.out.println("Q: 단어 테스트\nA: 단어 외우기\nDebug: 디버그");
    }
    

    /*인트로*/
    private static int onGetOption() throws IOException {
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

class Task{

    /*String 읽어오는 메소드*/
    public static String readString() throws IOException{

        BufferedReader stringReader = new BufferedReader(new InputStreamReader(System.in));
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
