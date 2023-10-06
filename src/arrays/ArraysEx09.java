/*
Реализуйте публичный статический метод buildDefinitionList(), который генерирует HTML список определений
(теги <dl>, <dt> и <dd>) и возвращает получившуюся строку. При отсутствии элементов в массиве
метод возвращает пустую строку.

Метод принимает на вход список определения в виде двумерного массива:

String[][] definitions = {
  {"definition1", "description1"},
  {"definition2", "description2"},

};

То есть каждый элемент входного массива сам является массивом, содержащим два элемента: термин и его определение.

String[][] definitions = {
  {"Блямба", "Выпуклость, утолщения на поверхности чего-либо"},
  {"Бобр", "Животное из отряда грызунов"},
};

App.buildDefinitionList(definitions);
// "<dl><dt>Блямба</dt><dd>Выпуклость, утолщение на поверхности чего-либо</dd><dt>Бобр</dt><dd>Животное из отряда грызунов</dd></dl>";
 */

package arrays;

public class ArraysEx09 {
    public static void main(String[] args) {
        String[][] definitions = {
                {"Блямба", "Выпуклость, утолщения на поверхности чего-либо"},
                {"Бобр", "Животное из отряда грызунов"},
        };

        System.out.println(ArraysEx09.buildDefinitionList(definitions));
    }

    public static String buildDefinitionList(String[][] tagsList) {
        if (tagsList.length == 0) {
            return "";
        }
        var result = new StringBuilder();
        result.append("<dl>");
        for (String[] item : tagsList) {
            result.append("<dt>");
            result.append(item[0]);
            result.append("</dt>");
            result.append("<dd>");
            result.append(item[1]);
            result.append("</dd>");
        }
        result.append("</dl>");
        return result.toString();
    }
}
