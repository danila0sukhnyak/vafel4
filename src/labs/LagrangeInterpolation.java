package labs;
import labs.models.IFunc;
import labs.modules.LagrangianIntegrationMath;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LagrangeInterpolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Интерполирование многочленом Лагранжа:");
        Map<String, IFunc> funcs = new HashMap<>();
        // 1
        funcs.put("sin(x)", Math::sin);
        // 2
        funcs.put("cos(x)", Math::cos);
        /*
        Вывод и обработка ввода. Не трогать.
        */
        int i = 1;
        ArrayList<String> keys = new ArrayList<>();
        for (Map.Entry<String, IFunc> entry : funcs.entrySet()) {
            System.out.println((i++) + ". " + entry.getKey());
            keys.add(entry.getKey());
        }
        try {
            String str = scanner.nextLine();
            IFunc func1 = funcs.get(keys.get(Integer.parseInt(str) - 1));
            LagrangianIntegrationMath.solve(func1);
        }catch (Exception e){
            System.out.println("Такого уравнения нет");
        }
    }
}
