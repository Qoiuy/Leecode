package mook.java.ZJU1001541001.week1;

/**
 * 温度转换
 * 教老弟的代码
 * @author Lilac
 * 2020-03-19
 */
public class TemperatureConversion {

    // 计算摄氏度
    public int calculable(int F){
        double C ;
        C = (F - 32 ) / 9.0 * 5;
        return (int) C;
    }

    // 计算摄氏度 错误结果
    public int calculableError(int F){
        int C ;
        C = (F - 32 ) / 9 * 5;
        return (int) C;
    }

    public static void main(String[] args) {

        System.out.println(new TemperatureConversion().calculable(100));
        System.out.println(new TemperatureConversion().calculableError(100));

    }
}
