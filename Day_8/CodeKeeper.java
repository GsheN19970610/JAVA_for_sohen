package Day_8;

import java.util.*;

public class CodeKeeper {
    ArrayList list;
    String[] codes = { "alpha", "lambda", "gamma", "delta", "zeta" };

    public CodeKeeper(String[] userCodes) {
        list = new ArrayList();
        for (int i = 0; i < codes.length; i++) {        // 用户名字
            addCode(codes[i]);
        }
        for (int j = 0; j < userCodes.length; j++) {    // 用户的代码
            addCode(userCodes[j]);
        }
        for (Iterator ite = list.iterator(); ite.hasNext(); ) { //加入用命令行参数提供的编码
            String output = (String) ite.next();
            System.out.println(output);
        }
    }

    private void addCode(String code) {             //当出现没不在表内的code，就add加入
        if (!list.contains(code)) {
            list.add(code);
        }
    }

    public static void main(String[] arguments) {
        CodeKeeper keeper = new CodeKeeper(arguments);
    }
}