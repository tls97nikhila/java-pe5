package com.stackroute.pe5;

import java.util.Comparator;
//class student sorter
class StudentSorter implements Comparator<Student> {

    //override compare method to compare objects
    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getAge() == o2.getAge())  // compare ages
        {
            if(o1.getName().compareTo(o2.getName())==0)  // compare names
                return o1.getId().compareTo(o2.getId());
            else return o1.getName().compareTo(o2.getName());
        }
        else if(o1.getAge()>o2.getAge())
            return 1;
        else
            return -1;
    }
}
