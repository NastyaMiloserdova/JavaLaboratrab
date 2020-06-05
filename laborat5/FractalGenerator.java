import java.awt.geom.Rectangle2D;

/**
 * Этот класс предоставляет общий интерфейс и операции для генераторов 
 * фракталов, которые можно просматривать в Fractal Explorer.
 */

public abstract class FractalGenerator 
{

    /**
     *
     * @param rangeMin минимальное значение диапазона с плавающей точкой
     * @param rangeMax максимальное значение диапазона с плавающей точкой
     *
     * @param size размер измерения, из которого координата пикселя. 
     *      Например, это может быть ширина изображения или высота изображения.
     *
     * @param coord координата для вычисления значения двойной точности.
     *      Координата должна находиться в диапазоне [0, размер].
     */
    public static double getCoord(double rangeMin, double rangeMax,
        int size, int coord) 
    {
        assert size > 0;
        assert coord >= 0 && coord < size;

        double range = rangeMax - rangeMin;
        return rangeMin + (range * (double) coord / (double) size);
    }


    public abstract void getInitialRange(Rectangle2D.Double range);

    /**
     * Обновляет текущий диапазон с центром в указанных координатах, 
     * а также для увеличения или уменьшения с помощью 
     * указанного коэффициента масштабирования.
     */
    public void recenterAndZoomRange(Rectangle2D.Double range,
        double centerX, double centerY, double scale) 
    {

        double newWidth = range.width * scale;
        double newHeight = range.height * scale;

        range.x = centerX - newWidth / 2;
        range.y = centerY - newHeight / 2;
        range.width = newWidth;
        range.height = newHeight;
    }

    public abstract int numIterations(double x, double y);
}