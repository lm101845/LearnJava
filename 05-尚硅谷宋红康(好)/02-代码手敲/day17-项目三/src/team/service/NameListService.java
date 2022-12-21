package team.service;

import team.domain.*;

import static team.service.Data.*;
/**
 * @Author liming
 * @Date 2022/6/28 16:29
 **/
public class NameListService {
    private Employee[] employees;

    /**
     * 给数组及数组元素进行初始化
     */
    public NameListService() {
        //1.根据项目中提供的Data类创建相应大小的employees数组
        //2.再根据Data类中的数据构建不同的对象，包括Employee,Programmer,Designer和Architect
        //3.将对象存于数组中
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            //获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取Employee的4个基本信息(这4个类都有，所以写在前面)
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;  //注意：不是所有员工都有设备，所以我们在这里只声明，不获取
            double bonus;
            int stock;
            //这里不要写数字，体验很不好
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    /**
     * 获取指定index上的员工的设备
     * @param index
     * @return
     */
    private Equipment createEquipment(int index) {
        //这个可以复用，放在上面
        String modelOrName = EQIPMENTS[index][1];

        int key = Integer.parseInt(EQIPMENTS[index][0]);
        switch (key){
            case PC:
                String display = EQIPMENTS[index][2];
                return new PC(modelOrName,display);
            case NOTEBOOK:
                double price = Double.parseDouble(EQIPMENTS[index][2]);
                return new NoteBook(modelOrName,price);
            case PRINTER:
                String type = EQIPMENTS[index][2];
                return new Printer(modelOrName,type);
        }
        return null;
    }

    /**
     * 获取当前所有的员工
     * @return
     */
    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     * 获取指定id的员工对象
     * @param id
     * @return 这里我们使用throws合理一些，等到时候调我们这个方法的时候再try...catch
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id){
                //这里因为是基本类型，所以用的==
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
