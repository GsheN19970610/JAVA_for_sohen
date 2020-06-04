package Day_8;

import java.util.ArrayList;

public class CodeKeeper2 {
    ArrayList<String>list;          //list是一个Collection接口的子接口
                                    //ArrayList是list的一个实现类，实现数组大小的可变

    String[] codes = {"alpha","lambda","gamma","delta","zeta"};

    private void addCode(String code){
        if(!list.contains(code)){
            list.add(code);
        }
    }

    public CodeKeeper2(String[] userCodes) {
        list = new ArrayList<>();           //载入
        for (int i = 0; i < codes.length; i++) {
            addCode(codes[i]);              //用户信息载入
        }
        for (int j = 0; j < userCodes.length; j++){
            addCode(userCodes[j]);
        }
        for (String code : list){                       //增强型for循环，将code的元素赋值给list
            System.out.println(code);
        }

    }

}
