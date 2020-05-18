package entity;

import java.util.*;

import javax.lang.model.type.NullType;

public class StudentManager {
    static Scanner shuru = new Scanner(System.in);
    static HashMap<Integer, Student> stu = new HashMap<Integer, Student>();


    public void App() {

        while (true) {
            System.out.print(
					"*******\n"
                    +"*请选择操作*\n"
                    + "*1 插入 *\n"
                    + "*2 查找 *\n"
                    + "*3 删除 *\n"
                    + "*4 修改 *\n"
                    + "*5 退出 *\n"
					+"*******"
            );
            String str = shuru.next();
            switch (str) {
                case "1":
                    addStu();
                    break;
                case "2":
                    selectStu();
                    break;
                case "3":
                    deleteStu();
                    break;
                case "4":
                    updateStu();
                    break;
                case "5":
                    exit();
            }
        }
    }

    //退出
    private static void exit() {
        System.exit(0);
    }
    /*
        8.函数是否已经有文档注释？（功能、输入、返回及其他可选）
        功能：修改信息
        输入：sid
        返回：无
    */
    private static void updateStu() {
        System.out.println("修改！");
        System.out.println("输入Sid：");
        int id = shuru.nextInt();
        /*
        43.入口对象是否都被进行了判断不为空
        */
        if(id != null){
            Student s = stu.get(id);
            System.out.println("输入SbirthDay：");
            s.setSbirthDay(shuru.next());

            stu.put(s.getSid(), s);
            System.out.println("修改成功！");
        }else{
            System.out.println("id为空，修改失败");
        }

        /*
        46.是否函数的所有分支都有返回值
        */
        return ;
        
    }
    /*
        8.函数是否已经有文档注释？（功能、输入、返回及其他可选）
        功能：删除信息
        输入：sid
        返回：无
    */
    private static void deleteStu() {
        System.out.println("删除！");
        System.out.println("输入Sid：");
        
        int id = shuru.nextInt();
        /*
        43.入口对象是否都被进行了判断不为空
        */
        if(id != null){
            Student s = new Student();
            s.setSid(id);

            stu.remove(s.getSid());
            System.out.println("删除成功！");
        }
        else{
            System.out.println("sid为空，修改失败");
        }
        /*
        46.是否函数的所有分支都有返回值
        */
        return ;
    }
    /*
        8.函数是否已经有文档注释？（功能、输入、返回及其他可选）
        功能：查询学生信息
        输入：sid
        返回：无
    */
    private static void selectStu() {
        System.out.println("查询！");
        System.out.println("输入Sid：");
        Integer id = shuru.nextInt();
         /*
        43.入口对象是否都被进行了判断不为空
        */
        if(id!=null){
            int t = 0;
            for (Map.Entry<Integer,Student> entry : stu.entrySet()) {
                if (id.equals(entry.getKey()))//比较内容是否存在，是的话打印
                {
                    t++;
                    System.out.print("学生ID：" + entry.getValue().getSid()
                            + ", 学生姓名 ： " + entry.getValue().getSname()
                            + ", 学生出生日期 ： " + entry.getValue().getSbirthDay()
                    );
                    if (entry.getValue().getSsex()) {
                        System.out.println(", 学生性别 ： 男");
                    } else {
                        System.out.println(", 学生性别 ： 女");
                    }
                    System.out.println("查询成功!");
                }
            }
                if (t==0){
                    System.out.println("没有相关内容！");
            }
        }else{
            System.out.println("sid为空，修改失败");
        }
        /*
        46.是否函数的所有分支都有返回值
        */
        return ;
        
    }
    /*
        8.函数是否已经有文档注释？（功能、输入、返回及其他可选）
        功能：添加学生信息
        输入：id，姓名，性别，出生年月
        返回：无
    */
    private static void addStu() {
        System.out.println("添加！");
        System.out.print("请依次输入学生ID 姓名 性别 出生年月\n");
        int id = shuru.nextInt();
        String name = shuru.next();
        boolean sex = shuru.nextBoolean();
        String birth = shuru.next();
        Student s = new Student();
        s.setSid(id);
        s.setSname(name);
        s.setSbirthDay(birth);
        s.setSsex(sex);

        stu.put(s.getSid(), s);
        System.out.println("添加成功！");
    }

}




