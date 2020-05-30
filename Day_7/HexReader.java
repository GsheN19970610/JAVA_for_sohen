package Day_7;

import sun.misc.PostVMInitHook;

class HexReader {
    String[] input = {
            "000A110D1D260219 ",
            "78700F1318141E0C ",
            "6A197D45B0FFFFFF "

    };

    public static void main(String[] args) {
        HexReader hex = new HexReader();
        for (int i = 0;i < hex.input.length ; i++)                      //写入3个16进制字符串
            hex.readLine(hex.input[i]);
        }
        void readLine(String code){                                     //code是传递readLine方法的字符串
            try{
                for (int j = 0 ; j + 1<code.length() ; j+=2) {
                    String sub = code.substring(j , j+2);               //substring（int ， int） 方法读取了code中的两个字符的
                    int num =Integer.parseInt(sub , 16);
                    if(num == 255){                                     //如果是FF，即255，就什么都不返回
                        return;
                    }
                    System.out.print(num + " ");
                }
            }finally {                                                  //try.....finally 块
                System.out.println("**");                               //字符串读完之后在末尾加一个**
            }
            return;
    }
}

