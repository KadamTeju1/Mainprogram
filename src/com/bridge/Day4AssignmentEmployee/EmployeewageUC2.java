package com.bridge.Day4AssignmentEmployee;

public class EmployeewageUC2
{

        public static void main(String[] args)
        {
            int IS_FULL_TIME =1;
            int EMPLOYEE_RATE_PER_HOUR =10;

            double empcheck = Math.floor((Math.random() *10)% 2);

            if (empcheck == IS_FULL_TIME)
            {
                System.out.println("Employee is Present.");
            }
            else
            {
                System.out.println("Employee is Absent.");
            }
        }
}

