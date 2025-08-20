package Bai4;

import java.util.Scanner;

class Triangle
{
    double canh1, canh2, canh3;
    public Triangle(double canh1, double canh2, double canh3)
    {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    public boolean check()
    {
        if(canh1 <= 0 || canh2 <= 0 || canh3 <= 0 || canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh2 + canh3 <= canh1)
        {
            return false;
        }
        return true;
    }
    public double Perimeter()
    {
        return canh1 + canh2 + canh3;
    }
    public double Area()
    {
        double p = Perimeter() / 2;
        return Math.sqrt(p*(p - canh1)*(p - canh2)*(p-canh3));
    }
    public void ketqua()
    {
        if (check() == false)
        {
            System.out.println("Tam giac khong ton tai");
        }
        else
        {
            System.out.println("Chu vi tam giac la: " + Perimeter());
            System.out.println("Dien tich tam giac la: " + Area());
        }
    }
}

public class Bai4
{
    public static void main(String[] args)
    {
        double canh1, canh2, canh3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac: ");
        canh1 = sc.nextDouble();
        canh2 = sc.nextDouble();
        canh3 = sc.nextDouble();
        Triangle tamgiac = new Triangle(canh1, canh2, canh3);
        tamgiac.ketqua();
    }
}
