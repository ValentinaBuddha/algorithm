package algo1.lesson1;

import java.util.Scanner;

public class Juravnenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double det = a * d - b * c;
        double detX = e * d - b * f;
        double detY = a * f - e * c;

        if (det != 0) {
            // Единственное решение
            double x = detX / det;
            double y = detY / det;
            System.out.printf("2 %.5f %.5f", x, y);
        } else {
            if (a == 0 && b == 0 && c == 0 && d == 0) {
                if (e == 0 && f == 0) {
                    System.out.println(5);
                } else {
                    System.out.println(0);
                }
            } else if (a == 0 && c == 0) {
                if (b == 0 && d == 0) {
                    if (e == 0 && f == 0) {
                        System.out.println(5);
                    } else {
                        System.out.println(0);
                    }
                } else {
                    // Уравнения вида b*y = e и d*y = f
                    if (b != 0 && d != 0) {
                        double y1 = e / b;
                        double y2 = f / d;
                        if (Math.abs(y1 - y2) < 1e-9) {
                            System.out.printf("4 %.5f", y1);
                        } else {
                            System.out.println(0);
                        }
                    } else if (b != 0) {
                        double y = e / b;
                        if (d == 0 && f == 0) {
                            System.out.printf("4 %.5f", y);
                        } else if (d == 0 && Math.abs(f) > 1e-9) {
                            System.out.println(0);
                        }
                    } else if (d != 0) {
                        double y = f / d;
                        if (b == 0 && e == 0) {
                            System.out.printf("4 %.5f", y);
                        } else if (b == 0 && Math.abs(e) > 1e-9) {
                            System.out.println(0);
                        }
                    }
                }
            } else if (b == 0 && d == 0) {
                // Уравнения вида a*x = e и c*x = f
                if (a != 0 && c != 0) {
                    double x1 = e / a;
                    double x2 = f / c;
                    if (Math.abs(x1 - x2) < 1e-9) {
                        System.out.printf("3 %.5f", x1);
                    } else {
                        System.out.println(0);
                    }
                } else if (a != 0) {
                    double x = e / a;
                    if (c == 0 && f == 0) {
                        System.out.printf("3 %.5f", x);
                    } else if (c == 0 && Math.abs(f) > 1e-9) {
                        System.out.println(0);
                    }
                } else if (c != 0) {
                    double x = f / c;
                    if (a == 0 && e == 0) {
                        System.out.printf("3 %.5f", x);
                    } else if (a == 0 && Math.abs(e) > 1e-9) {
                        System.out.println(0);
                    }
                }
            } else {
                // Проверяем, пропорциональны ли уравнения
                double ratio = 0;
                boolean ratioDefined = false;
                if (a != 0 && c != 0) {
                    ratio = a / c;
                    ratioDefined = true;
                } else if (b != 0 && d != 0) {
                    ratio = b / d;
                    ratioDefined = true;
                }

                if (ratioDefined) {
                    boolean consistent = (Math.abs(b - d * ratio) < 1e-9) &&
                            (Math.abs(e - f * ratio) < 1e-9);
                    if (consistent) {
                        // Бесконечное множество решений вида y = kx + m
                        if (a != 0) {
                            double k = -a / b;
                            double m = e / b;
                            System.out.printf("1 %.5f %.5f", k, m);
                        } else if (c != 0) {
                            double k = -c / d;
                            double m = f / d;
                            System.out.printf("1 %.5f %.5f", k, m);
                        }
                    } else {
                        System.out.println(0);
                    }
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}