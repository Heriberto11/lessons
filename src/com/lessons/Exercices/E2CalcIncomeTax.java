package com.lessons.Exercices;

public class E2CalcIncomeTax {
    // calculate tax
    // 15% on the first $45,916 of taxable income, +
    // 20.5% on the next $45,915 of taxable income (on the portion of taxable income over $45,916 up to $91,831), +
    // 26% on the next $50,522 of taxable income (on the portion of taxable income over $91,831 up to $142,353), +
    // 29% on the next $60,447 of taxable income (on the portion of taxable income over $142,353 up to $202,800), +
    // 33% of taxable income over $202,800.
    public static void main(String[] args) {
        double grossSalary = 100000;

        double bracket1 = 45916 * 0.15;
        double bracket2 = bracket1 + 45915 * 0.205;
        double bracket3 = bracket2 + 50522 * 0.26;
        double bracket4 = bracket3 + 60447 * 29;

        if (grossSalary <= 45916)
            System.out.println(grossSalary * 0.15);
        if (grossSalary > 45916 && grossSalary <= 91831)
            System.out.println(bracket1 + (grossSalary - 45916) * 0.205);
        if (grossSalary > 91831 && grossSalary <= 142353)
            System.out.println(bracket2 + (grossSalary - 91831) * 0.26);
        if (grossSalary > 142353 && grossSalary <= 202800)
            System.out.println(bracket3 + (grossSalary - 142353) * 0.29);
        if (grossSalary > 202800)
            System.out.println(bracket4 + (grossSalary - 202800) * 0.33);
    }
}
