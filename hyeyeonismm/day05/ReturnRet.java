package day05;

public class ReturnRet {
    public String solution(String code) {
        String ret="";
        int mode=0;

        for (int idx=0;idx<code.length(); idx++) {
            if (mode==0) {
                if (code.charAt(idx)=='1')
                    mode =1;
                else {
                    if (idx%2==0)
                        ret+=code.charAt(idx);
                }
            }
            else {
                if (code.charAt(idx)=='1')
                    mode =0;
                else {
                    if (idx%2!=0)
                        ret += code.charAt(idx);
                }
            }
        }
        return ret.length() == 0 ? "EMPTY": ret.toString();
    }
}

//charAt: string으로 저장된 문자열 중 한 글자만 선택해서 char타입으로 변환
