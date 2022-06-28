package team.junit;

/**
 * @Author liming
 * @Date 2022/6/28 17:19
 **/

import org.junit.Test;
import team.domain.Employee;
import team.service.NameListService;
import team.service.TeamException;

/**
 * 对NameListService的测试
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 100;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
