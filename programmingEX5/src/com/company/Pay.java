package com.company;

public class Pay {
    private final int REGULAR_HOURS = 40;
    private int skillLevel;
    private int hoursWorked;
    private int insuranceOption1;
    private int insuranceOption2;
    private int insuranceOption3;
    private int retirementPlan;
    private double hourlyPayRate;
    private double regularPay;
    private int overtimeHoursWorked;
    private double overtimePay;
    private double grossPay;
    private double deductions;
    private double insuranceCost;
    private double retirementCost;
    private double netPay;

    public Pay(int newSkillLevel, int newHoursWorked, int NewInsuranceOption1, int NewInsuranceOption2, int NewInsuranceOption3, int newRetirementPlan) {
        skillLevel = newSkillLevel;
        hoursWorked = newHoursWorked;
        insuranceOption1 = NewInsuranceOption1;
        insuranceOption2 = NewInsuranceOption2;
        insuranceOption3 = NewInsuranceOption3;
        retirementPlan = newRetirementPlan;
        setHourlyPayRate();
        setOvertimeHoursWorked();
        calculateRegularPay();
        calculateOvertimePay();
        calculateGrossPay();
        setInsuranceCost();
        setRetirementCost();
        calculateDeductions();
        calculateNetPay();
    }

    private void setHourlyPayRate() {
        switch (skillLevel) {
            case 1:
                hourlyPayRate = 17.00;
                break;
            case 2:
                hourlyPayRate = 20.00;
                break;
            case 3:
                hourlyPayRate = 22.00;
                break;
            default:
                hourlyPayRate = 0.0;
        }
    }

    private void setOvertimeHoursWorked() {
        if (hoursWorked > REGULAR_HOURS)
            overtimeHoursWorked = hoursWorked - REGULAR_HOURS;
        else
            overtimeHoursWorked = 0;
    }

    private void calculateRegularPay() {
        if (hoursWorked > 40)
            regularPay = REGULAR_HOURS * hourlyPayRate;
        else
            regularPay = hoursWorked * hourlyPayRate;
    }

    private void calculateOvertimePay() {
        overtimePay = overtimeHoursWorked * (hourlyPayRate * 1.5);
    }

    private void calculateGrossPay() {
        grossPay = regularPay + overtimePay;
    }

    private void setInsuranceCost() {
        insuranceCost = 0.0;
        if (insuranceOption1 == 1)
            insuranceCost += 32.50;
        if (insuranceOption2 == 1)
            insuranceCost += 20.00;
        if (insuranceOption3 == 1)
            insuranceCost += 10.00;
    }

    private void setRetirementCost() {
        if (retirementPlan == 1)
            retirementCost = grossPay * 3. / 100.;
        else
            retirementCost = 0;
    }

    private void calculateDeductions() {
        deductions = insuranceCost + retirementCost;
        if (deductions > grossPay)
            deductions = 0;
    }

    private void calculateNetPay() {
        netPay = grossPay - deductions;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nEmployee details...");
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly pay rate: " + hourlyPayRate);
        System.out.println("Regular pay: " + regularPay);
        System.out.println("Overtime pay: " + overtimePay);
        System.out.println("Gross pay: " + grossPay);
        if (deductions > grossPay)
            System.out.println("Error: the deductions exceed the gross pay, so deductions set to 0.");
        else
            System.out.println("Total deductions: " + deductions);
        System.out.println("Net pay: " + netPay);


    }
}
