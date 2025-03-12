package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("JuniorDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("JuniorDeveloper array is full.");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("MidDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("MidDeveloper array is full.");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("SeniorDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("SeniorDeveloper array is full.");
    }
}