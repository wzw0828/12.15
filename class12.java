class OutException extends Exception {
    public OutException(String message) {
        super(message);
    }
}

class InException extends Exception {
    public InException(String message) {
        super(message);
    }
}

class CenterException extends Exception {
    public CenterException(String message) {
        super(message);
    }
}

public class class12 {
    public static void main(String[] args) {
        try {
            double x1 = 5.3;
            double y1 = 6.8;
            double x2 = 0.2;
            double y2 = 9.5;

            double radius = 10.0;
            double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (distance > radius) {
                throw new OutException(String.format("(%.1f, %.1f)不在半徑%.1f, 圓心(%.1f, %.1f)的圓內", x1, y1, radius, x2, y2));
            } 
            else if (distance < radius) {
                throw new InException(String.format("(%.1f, %.1f)在半徑%.1f, 圓心(%.1f, %.1f)的圓內", x1, y1, radius, x2, y2));
            } else {
                throw new CenterException(String.format("(%.1f, %.1f)在半徑%.1f, 圓心(%.1f, %.1f)的圓心上", x1, y1, radius, x2, y2));
            }
        } catch (OutException e) {
            System.out.println(e.getMessage());
        } catch (InException e) {
            System.out.println(e.getMessage());
        } catch (CenterException e) {
            System.out.println(e.getMessage());
        }
    }
}
